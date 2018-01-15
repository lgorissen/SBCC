package com.sbcc.businessrules.service;

import com.sbcc.businessrules.model.*;
import com.sbcc.businessrules.model.types.CaseEventTypeEnum;
import com.sbcc.businessrules.model.types.CaseStateEnum;
import com.sbcc.businessrules.model.types.MilestoneActionEnum;
import com.sbcc.businessrules.model.types.MilestoneEventEnum;
import com.sbcc.businessrules.rules.DecisionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventProcessorImplTest {

    @Autowired
    EventProcessor eventProcessorImpl;
    @MockBean
    private DecisionService decisionService;

    @Test
    public void processEventValidActivityEvent() {

        Case caseInstance = new Case(new CaseHeader("HandelsvorderingCasus", "1.0", CaseStateEnum.ACTIVE, "DEFAULT"), Arrays.asList());
        CaseEvent caseEvent = new CaseEvent(CaseEventTypeEnum.MILESTONE_EVENT, null, null, null, new MilestoneEvent("msProcesinleidingIngediend", MilestoneEventEnum.REACHED));
        List<CaseAction> caseActions = Arrays.asList();

        List<CaseAction> caseActionsExpected = Arrays.asList(new CaseAction(null, new MilestoneAction("msProcesinleidingIngediend", MilestoneActionEnum.REACH)));

        given(this.decisionService.processEvent(caseInstance, caseEvent, caseActions)).willReturn(caseActionsExpected);
        List<CaseAction> caseActionsGot = eventProcessorImpl.processEvent(caseInstance, caseEvent, caseActions);
        assertThat(caseActionsGot.get(0), samePropertyValuesAs(caseActionsExpected.get(0)));

    }

}
