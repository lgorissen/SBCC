package com.sbcc.businessrules.model;

import com.sbcc.businessrules.model.types.MilestoneActionEnum;

import javax.validation.constraints.NotNull;

public class MilestoneAction {
    private String milestoneName;
    private MilestoneActionEnum action;

    public MilestoneAction() {
    }

    public MilestoneAction(String milestoneName, MilestoneActionEnum action) {
        this.milestoneName = milestoneName;
        this.action = action;
    }

    @NotNull
    public String getMilestoneName() {
        return milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    public MilestoneActionEnum getAction() {
        return action;
    }

    public void setAction(MilestoneActionEnum action) {
        this.action = action;
    }

}
