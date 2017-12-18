package com.sbcc.store.message;



public class PingResponse {

  private String startTime;
  private String endTime;
  
  public PingResponse(){
      super();
      startTime = "NotSet";
      endTime = "NotSet";
  }
   
  public PingResponse(String startTime, 
                      String endTime){
      this.startTime = startTime;
      this.endTime = endTime;
  }
  
  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  @Override
  public String toString(){
    return "Operations Ping Response start: " + startTime
         + " Operations Ping Response end: " + endTime;
  }  
  
}
