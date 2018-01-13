package com.sbcc.operations.service.api;

import com.sbcc.operations.service.model.PingResponse;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

@Controller
public class PingApiController implements PingApi {

    private final PingApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public PingApiController(PingApiDelegate delegate) {
        this.delegate = delegate;
    }
    public ResponseEntity<PingResponse> ping() {
        return delegate.ping();
    }

}
