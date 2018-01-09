package com.sbcc.businessrules.model;

import com.sbcc.businessrules.model.enums.ActivityEventEnum;

import javax.validation.constraints.NotNull;

public class ActivityEvent {

    private String activityName;
    private ActivityEventEnum activityEvent;

    public ActivityEvent() {
    }

    public ActivityEvent(String activityName, ActivityEventEnum activityEvent) {
        this.activityName = activityName;
        this.activityEvent = activityEvent;
    }

    @NotNull
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public ActivityEventEnum getActivityEvent() {
        return activityEvent;
    }

    public void setActivityEvent(ActivityEventEnum activityEvent) {
        this.activityEvent = activityEvent;
    }

}
