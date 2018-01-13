package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sbcc.operations.service.model.PingResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PingResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class PingResponse   {
  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("endPoint")
  private String endPoint = null;

  @JsonProperty("referencePings")
  @Valid
  private List<PingResponse> referencePings = null;

  public PingResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "ToDo", required = true, value = "")
  @NotNull


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public PingResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(example = "ToDo", required = true, value = "")
  @NotNull


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public PingResponse endPoint(String endPoint) {
    this.endPoint = endPoint;
    return this;
  }

   /**
   * Get endPoint
   * @return endPoint
  **/
  @ApiModelProperty(example = "http://localhost:8081/SBCC/operations/0.1.0/ping", required = true, value = "")
  @NotNull


  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public PingResponse referencePings(List<PingResponse> referencePings) {
    this.referencePings = referencePings;
    return this;
  }

  public PingResponse addReferencePingsItem(PingResponse referencePingsItem) {
    if (this.referencePings == null) {
      this.referencePings = new ArrayList<PingResponse>();
    }
    this.referencePings.add(referencePingsItem);
    return this;
  }

   /**
   * Get referencePings
   * @return referencePings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PingResponse> getReferencePings() {
    return referencePings;
  }

  public void setReferencePings(List<PingResponse> referencePings) {
    this.referencePings = referencePings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PingResponse pingResponse = (PingResponse) o;
    return Objects.equals(this.startTime, pingResponse.startTime) &&
        Objects.equals(this.endTime, pingResponse.endTime) &&
        Objects.equals(this.endPoint, pingResponse.endPoint) &&
        Objects.equals(this.referencePings, pingResponse.referencePings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, endPoint, referencePings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingResponse {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    referencePings: ").append(toIndentedString(referencePings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

