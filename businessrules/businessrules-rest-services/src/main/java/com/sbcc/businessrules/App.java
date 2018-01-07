package com.sbcc.businessrules;

import com.googlecode.jsonrpc4j.spring.JsonServiceExporter;
import com.sbcc.businessrules.service.EventProcessor;
import com.sbcc.businessrules.service.EventProcessorImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;
import java.util.Properties;

@SpringBootApplication
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final String drlFile = "com/sbcc/rules/Rules.drl";

    // Get PORT and HOST from Environment or set default
    public static final Optional<String> host;
    public static final Optional<String> port;
    public static final Properties myProps = new Properties();

    static {
        host = Optional.ofNullable(System.getenv("HOSTNAME"));
        port = Optional.ofNullable(System.getenv("PORT"));
    }

    public static void main(String[] args) {
        myProps.setProperty("server.address", host.orElse("localhost"));
        myProps.setProperty("server.port", port.orElse("8083"));

        SpringApplication app = new SpringApplication(App.class);
        app.setDefaultProperties(myProps);
        app.run(args);
        logger.debug("--Application Started--");
    }

    @Bean
    public EventProcessor eventProcessor() {
        return new EventProcessorImpl();
    }

    // Autoconfiguration with JsonRpcService unfortunately clashes with Bean Validation
    // So sticking with configuration as Bean
    @Bean(name = "/businessrules/rpc/1.0")
    public JsonServiceExporter jsonServiceExporter() {
        JsonServiceExporter exporter = new JsonServiceExporter();
        exporter.setService(eventProcessor());
        exporter.setServiceInterface(EventProcessor.class);

        return exporter;
    }

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();

        return kieServices.newKieContainer(kieModule.getReleaseId());
    }

}
