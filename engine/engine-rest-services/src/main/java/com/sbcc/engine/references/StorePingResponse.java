package com.sbcc.engine.references;

import java.util.ArrayList;

public class StorePingResponse {

    String endPoint;
    String startTime;
    String endTime;
    ArrayList<MessagingPingResponse> referencePings;


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

    public ArrayList<MessagingPingResponse> getReferencePings() {
        return referencePings;
    }

    public void setReferencePings(ArrayList<MessagingPingResponse> referencePings) {
        this.referencePings = referencePings;
    }
}
