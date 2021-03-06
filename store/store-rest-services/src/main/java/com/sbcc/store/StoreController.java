package com.sbcc.store;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sbcc.store.message.*;

@CrossOrigin
@RestController
@RequestMapping("/store")
public class StoreController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StoreController.class);


    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    public ResponseEntity ping() {

        LOGGER.info("/ping received");

        String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

        PingResponse response = new PingResponse();
        response.setStartTime(startTime);

        String endPoint = "http://localhost:8082/store/ping";
        response.setEndPoint(endPoint);

        // insert ping logic here

        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        response.setEndTime(endTime);



        return new ResponseEntity<PingResponse>(response, HttpStatus.OK);
    }

}
