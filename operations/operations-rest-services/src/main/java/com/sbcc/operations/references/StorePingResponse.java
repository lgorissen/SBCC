package com.sbcc.operations.references;

import java.util.ArrayList;

public class StorePingResponse {

    String endPoint;
    String startTime;
    String endTime;
    ArrayList<EnginePingResponse> referencePings;


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public ArrayList<EnginePingResponse> getReferencePings() {
        return referencePings;
    }

    public void setReferencePings(ArrayList<EnginePingResponse> referencePings) {
        this.referencePings = referencePings;
    }
}
