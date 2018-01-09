package com.sbcc.businessrules.service;

import com.sbcc.businessrules.model.Case;
import com.sbcc.businessrules.model.CaseEvent;
import com.sbcc.businessrules.rules.DecisionService;
import com.sbcc.businessrules.model.CaseAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public class EventProcessorImpl implements EventProcessor {
    private static final Logger logger = LoggerFactory.getLogger(EventProcessorImpl.class);

    @Autowired
    private DecisionService decisionService;

    @Override
    public List<CaseAction> processEvent(Case caseInstance, CaseEvent caseEvent, List<CaseAction> caseActions) {

        logger.debug("CaseEvent: " + caseEvent.toString());

        return decisionService.processEvent(caseInstance, caseEvent, caseActions);
    }
}
