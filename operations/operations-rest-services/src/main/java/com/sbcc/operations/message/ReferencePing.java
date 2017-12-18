package com.sbcc.operations.message;

public class ReferencePing {

    String endPoint;
    String startTime;
    String endTime;

    public ReferencePing() {
        endPoint = "NotSet";
        startTime= "NotSet";
        endTime = "NotSet";

    }

    public ReferencePing(String endPoint, String startTime, String endTime) {
        this.endPoint = endPoint;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

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


}
