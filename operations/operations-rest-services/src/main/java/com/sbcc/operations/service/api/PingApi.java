/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.sbcc.operations.service.api;

import com.sbcc.operations.service.model.PingResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

@Api(value = "ping", description = "the ping API")
public interface PingApi {

    @ApiOperation(value = "ping for availability of SBCC components", nickname = "ping", notes = "ping for availability of SBCC components ", response = PingResponse.class, tags={ "management", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "health of SBCC components", response = PingResponse.class),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/ping",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PingResponse> ping();

}
