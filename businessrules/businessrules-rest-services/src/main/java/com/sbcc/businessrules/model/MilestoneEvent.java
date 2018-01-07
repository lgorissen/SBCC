package com.sbcc.businessrules.model;

import javax.validation.constraints.NotNull;

public class MilestoneEvent {

    private String milestone;
    private String milestoneEvent;

    public MilestoneEvent() {
    }

    public MilestoneEvent(String milestone, String milestoneEvent) {
        this.milestone = milestone;
        this.milestoneEvent = milestoneEvent;
    }

    @NotNull
    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    @NotNull
    public String getMilestoneEvent() {
        return milestoneEvent;
    }

    public void setMilestoneEvent(String milestoneEvent) {
        this.milestoneEvent = milestoneEvent;
    }

}
