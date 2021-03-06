package com.sbcc.businessrules.model;

import com.sbcc.businessrules.model.types.CaseEventTypeEnum;

public class CaseEvent {

    private CaseEventTypeEnum eventType;
    private ActivityEvent activityEvent;
    private CustomEvent customEvent;
    private LifecycleEvent lifecycleEvent;
    private MilestoneEvent milestoneEvent;

    public CaseEvent() {
    }

    public CaseEvent(CaseEventTypeEnum eventType, ActivityEvent activityEvent, CustomEvent customEvent, LifecycleEvent lifecycleEvent, MilestoneEvent milestoneEvent) {
        this.eventType = eventType;
        this.activityEvent = activityEvent;
        this.customEvent = customEvent;
        this.lifecycleEvent = lifecycleEvent;
        this.milestoneEvent = milestoneEvent;
    }

    public CaseEventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(CaseEventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public ActivityEvent getActivityEvent() {
        return activityEvent;
    }

    public void setActivityEvent(ActivityEvent activityEvent) {
        this.activityEvent = activityEvent;
    }

    public CustomEvent getCustomEvent() {
        return customEvent;
    }

    public void setCustomEvent(CustomEvent customEvent) {
        this.customEvent = customEvent;
    }

    public LifecycleEvent getLifecycleEvent() {
        return lifecycleEvent;
    }

    public void setLifecycleEvent(LifecycleEvent lifecycleEvent) {
        this.lifecycleEvent = lifecycleEvent;
    }

    public MilestoneEvent getMilestoneEvent() {
        return milestoneEvent;
    }

    public void setMilestoneEvent(MilestoneEvent milestoneEvent) {
        this.milestoneEvent = milestoneEvent;
    }

    @Override
    public String toString() {
        return "CaseEvent{" +
                "eventType='" + eventType + '\'' +
                ", activityEvent=" + activityEvent +
                ", customEvent=" + customEvent +
                ", lifecycleEvent=" + lifecycleEvent +
                ", milestoneEvent=" + milestoneEvent +
                '}';
    }

}
