package com.sbcc.businessrules.message;


import java.util.ArrayList;

public class PingResponse {

    private String endPoint;
    private String startTime;
    private String endTime;
    private ArrayList<PingResponse> referencePings;

    public PingResponse() {
        super();
        endPoint = "NotSet";
        startTime = "NotSet";
        endTime = "NotSet";
        referencePings = new ArrayList<>();
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

    public ArrayList<PingResponse> getReferencePings() {
        return referencePings;
    }

    public void setReferencePings(ArrayList<PingResponse> referencePings) {
        this.referencePings = referencePings;
    }

    public PingResponse(String endPoint,
                        String startTime,
                        String endTime,
                        ArrayList referencePings) {
        this.endPoint = endPoint;

        this.startTime = startTime;
        this.referencePings = referencePings;
        this.endTime = endTime;

    }


    @Override
    public String toString() {
        return "BusinessRules Ping Response start: " + startTime
                + " BusinessRules Ping Response end: " + endTime;
    }


}
