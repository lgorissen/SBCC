package com.sbcc.operations.service.api;

import com.sbcc.operations.service.model.CaseActivityEventRequest;
import com.sbcc.operations.service.model.CaseActivityEventResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * A delegate to be called by the {@link CaseactivityApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public interface CaseactivityApiDelegate {

    /**
     * @see CaseactivityApi#caseActivityEvent
     */
    ResponseEntity<CaseActivityEventResponse> caseActivityEvent(CaseActivityEventRequest caseActivityEventRequest);

}
