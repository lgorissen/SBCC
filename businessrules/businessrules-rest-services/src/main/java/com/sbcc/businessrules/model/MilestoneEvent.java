package com.sbcc.businessrules.model;

import com.sbcc.businessrules.model.types.MilestoneEventEnum;

import javax.validation.constraints.NotNull;

public class MilestoneEvent {

    private String milestone;
    private MilestoneEventEnum milestoneEvent;

    public MilestoneEvent() {
    }

    public MilestoneEvent(String milestone, MilestoneEventEnum milestoneEvent) {
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

    public MilestoneEventEnum getMilestoneEvent() {
        return milestoneEvent;
    }

    public void setMilestoneEvent(MilestoneEventEnum milestoneEvent) {
        this.milestoneEvent = milestoneEvent;
    }

}
