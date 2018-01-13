package com.sbcc.operations.service.api.impl;

import com.sbcc.operations.service.api.PingApiDelegate;

import com.sbcc.operations.service.model.PingResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * A delegate to be called by the {@link PingApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T11:12:28.462Z")

@Service 
public class PingApiDelegateService implements PingApiDelegate {

    private static final Logger log = LoggerFactory.getLogger(PingApiDelegateService.class);

    @org.springframework.beans.factory.annotation.Autowired
    public PingApiDelegateService() {
    }


    /**
     * @see PingApi#ping
     */
    @Override
    public ResponseEntity<PingResponse> ping() {

        PingResponse response = new PingResponse();
        
        return new ResponseEntity<PingResponse>(response,HttpStatus.NOT_IMPLEMENTED);
    }

}
