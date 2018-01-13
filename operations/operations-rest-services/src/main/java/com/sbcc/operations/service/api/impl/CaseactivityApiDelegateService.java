package com.sbcc.operations.service.api.impl;

import com.sbcc.operations.service.api.CaseactivityApiDelegate;

import com.sbcc.operations.service.model.CaseActivityEventRequest;
import com.sbcc.operations.service.model.CaseActivityEventResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

/**
 * A delegate to be called by the {@link CaseactivityApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T11:12:28.462Z")

@Service 
public class CaseactivityApiDelegateService implements CaseactivityApiDelegate {

    private static final Logger log = LoggerFactory.getLogger(CaseactivityApiDelegateService.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;


    @org.springframework.beans.factory.annotation.Autowired
    public CaseactivityApiDelegateService(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }


    /**
     * @see CaseactivityApi#caseActivityEvent
     */
    @Override
    public ResponseEntity<CaseActivityEventResponse> caseActivityEvent(CaseActivityEventRequest caseActivityEventRequest){

        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseActivityEventResponse>(objectMapper.readValue("{  \"caseIdentifier\" : {    \"caseId\" : \"NL17.1235\",    \"identificationKey\" : \"987654321\"  }}", CaseActivityEventResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseActivityEventResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseActivityEventResponse>(HttpStatus.NOT_IMPLEMENTED);

    }

}
