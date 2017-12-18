package com.sbcc.operations;

import com.sbcc.operations.message.PingResponse;
import com.sbcc.operations.references.EnginePingResponse;
import com.sbcc.operations.references.StorePingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/operations")
public class OperationsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationsController.class);


    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    public ResponseEntity ping() {

        LOGGER.info("/ping received");

        PingResponse pingResponse = new PingResponse();

        pingResponse.setEndPoint("http://localhost:8080/operations/ping");

        // set start time
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        pingResponse.setStartTime(timeStamp);

        // ping engine

        RestTemplate restTemplate = new RestTemplate();
        EnginePingResponse enginePingResponse = restTemplate.getForObject("http://localhost:8081/engine/ping", EnginePingResponse.class);

        PingResponse enginePing = new PingResponse("http://localhost:8081/engine/ping",
                enginePingResponse.getStartTime(),
                enginePingResponse.getEndTime(),
                null);
        pingResponse.getReferencePings().add(enginePing);

        // ping store

        StorePingResponse storePingResponse = restTemplate.getForObject("http://localhost:8082/store/ping", StorePingResponse.class);

        PingResponse storePing = new PingResponse("http://localhost:8082/store/ping",
                storePingResponse.getStartTime(),
                storePingResponse.getEndTime(),
                null);
        pingResponse.getReferencePings().add(storePing);

        // set end time
        timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        pingResponse.setEndTime(timeStamp);

        return new ResponseEntity<PingResponse>(pingResponse, HttpStatus.OK);
    }

}
