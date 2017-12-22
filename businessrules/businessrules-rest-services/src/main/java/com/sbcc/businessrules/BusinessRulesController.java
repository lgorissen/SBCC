package com.sbcc.businessrules;

import com.sbcc.businessrules.message.PingResponse;
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
@RequestMapping("/businessrules")
public class BusinessRulesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessRulesController.class);


    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    public ResponseEntity ping() {

        LOGGER.info("/ping received");

        // set start time
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

        PingResponse pingResponse = new PingResponse();
        pingResponse.setStartTime(timeStamp);

        // set endPoint
        pingResponse.setEndPoint("http://localhost:8083/businessrules/ping");


        // set end time
        timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        pingResponse.setEndTime(timeStamp);

        return new ResponseEntity<PingResponse>(pingResponse, HttpStatus.OK);
    }

}
