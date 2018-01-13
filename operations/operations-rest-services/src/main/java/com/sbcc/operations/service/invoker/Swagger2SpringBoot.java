package com.sbcc.operations.service.invoker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;
import java.util.Properties;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "com.sbcc.operations.service.invoker", "com.sbcc.operations.service.api" })
public class Swagger2SpringBoot implements CommandLineRunner {

    // Get PORT and HOST from Environment or set default
    public static final Optional<String> host;
    public static final Optional<String> port;
    public static final Properties myProps = new Properties();

    static {
        host = Optional.ofNullable(System.getenv("HOSTNAME"));
        port = Optional.ofNullable(System.getenv("PORT"));
    }

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {

        // Set properties

        myProps.setProperty("server.address", host.orElse("localhost"));
        myProps.setProperty("server.port", port.orElse("8081"));

        SpringApplication app = new SpringApplication(Swagger2SpringBoot.class);
        app.setDefaultProperties(myProps);
        app.run(args);

    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}