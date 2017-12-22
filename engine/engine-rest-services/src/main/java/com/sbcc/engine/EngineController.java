package com.sbcc.engine;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sbcc.engine.message.*;
import com.sbcc.engine.references.*;

@CrossOrigin
@RestController
@RequestMapping("/engine")
public class EngineController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EngineController.class);


    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    public ResponseEntity ping() {

        LOGGER.info("/ping received");

        String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

        PingResponse response = new PingResponse();
        response.setStartTime(startTime);

        String endPoint = "http://localhost:8081/engine/ping";
        response.setEndPoint(endPoint);

        // insert ping logic here

        // ping businessrules

        RestTemplate restTemplate = new RestTemplate();

        BusinessRulesPingResponse businessrulesPingResponse = restTemplate.getForObject("http://localhost:8083/businessrules/ping", BusinessRulesPingResponse.class);

        PingResponse enginePingResponse = new PingResponse("http://localhost:8083/businessrules/ping",
                businessrulesPingResponse.getStartTime(),
                businessrulesPingResponse.getEndTime(),
                businessrulesPingResponse.getReferencePings());
        response.getReferencePings().add(enginePingResponse);


        // ping messaging

        restTemplate = new RestTemplate();
        MessagingPingResponse messagingPingResponse = restTemplate.getForObject("http://localhost:8084/messaging/ping", MessagingPingResponse.class);

        PingResponse messagingPing = new PingResponse("http://localhost:8084/messaging/ping",
                messagingPingResponse.getStartTime(),
                messagingPingResponse.getEndTime(),
                messagingPingResponse.getReferencePings());
        response.getReferencePings().add(messagingPing);

        // ping store

        StorePingResponse storePingResponse = restTemplate.getForObject("http://localhost:8082/store/ping", StorePingResponse.class);

        PingResponse storePing = new PingResponse("http://localhost:8082/store/ping",
                storePingResponse.getStartTime(),
                storePingResponse.getEndTime(),
                storePingResponse.getReferencePings());
        response.getReferencePings().add(storePing);

        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        response.setEndTime(endTime);


        return new ResponseEntity<PingResponse>(response, HttpStatus.OK);
    }

}
