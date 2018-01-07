package com.sbcc.businessrules.service;

import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.sbcc.businessrules.model.Case;
import com.sbcc.businessrules.model.CaseEvent;
import com.sbcc.businessrules.model.CaseAction;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public interface EventProcessor {

//    @JsonRpcErrors({
//            @JsonRpcError(exception=ConstraintViolationException.class,
//                    code=-5678, message="CaseEventNotValid")
//    })

    @JsonRpcMethod(value = "processEvent")
    List<CaseAction> processEvent(@JsonRpcParam(value = "case") @Valid Case caseInstance,
                                  @JsonRpcParam(value = "caseEvent") @Valid CaseEvent caseEvent,
                                  @JsonRpcParam(value = "caseActions") @Valid List<CaseAction> caseActions);
}
