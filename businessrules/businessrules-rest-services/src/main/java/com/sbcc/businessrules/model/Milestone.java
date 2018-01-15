package com.sbcc.businessrules.model;

import com.sbcc.businessrules.model.types.MilestoneStateEnum;

import javax.validation.constraints.NotNull;
import java.util.GregorianCalendar;

public class Milestone {

    private String name;
    private MilestoneStateEnum state;
    private GregorianCalendar deadline;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MilestoneStateEnum getState() {
        return state;
    }

    public void setState(MilestoneStateEnum state) {
        this.state = state;
    }

    public GregorianCalendar getDeadline() {
        return deadline;
    }

    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }

}
