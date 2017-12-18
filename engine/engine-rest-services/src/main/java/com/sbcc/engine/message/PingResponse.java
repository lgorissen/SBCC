package com.sbcc.engine.message;

import java.util.ArrayList;


public class PingResponse {

  private String startTime;
  //private ArrayList<PingReference> referencePings;
  private String endTime;
  
  public PingResponse(){
      super();
      startTime = "NotSet";
      endTime = "NotSet";
  //    referencePings = newArrayList();
  }
   
  public PingResponse(String startTime, 
  //                    ArrayList<PingReference> referencePings, 
                      String endTime){
      this.startTime = startTime;
  //    this.referencePings = referencePings;
      this.endTime = endTime;
  }
  
  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  //public ArrayList<PingReference> getReferencePings() {
  //  return this.referencePings;
  //}

  //public void setReferencePings(ArrayList<PingReference> referencePings) {
  //  this.referencePings = referencePings;
  //}

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  @Override
  public String toString(){
    return "Operations Ping Response start: " + startTime
  //       + " Backend reference pings count : " + referencePings.size()
         + " Operations Ping Response end: " + endTime;
  }  
  
}
