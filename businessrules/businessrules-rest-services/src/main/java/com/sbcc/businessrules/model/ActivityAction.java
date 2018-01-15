package com.sbcc.businessrules.model;

import com.sbcc.businessrules.model.types.ActivityActionEnum;

import javax.validation.constraints.NotNull;
import java.util.List;

public class ActivityAction {
    private String activityName;
    private ActivityActionEnum action;
    private List<ActionData> actionDataList;

    public ActivityAction() {
    }

    public ActivityAction(String activityName, ActivityActionEnum action) {
        this.activityName = activityName;
        this.action = action;
    }

    @NotNull
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public ActivityActionEnum getAction() {
        return action;
    }

    public void setAction(ActivityActionEnum action) {
        this.action = action;
    }

    public List<ActionData> getActionDataList() {
        return actionDataList;
    }

    public void setActionDataList(List<ActionData> actionDataList) {
        this.actionDataList = actionDataList;
    }
}
