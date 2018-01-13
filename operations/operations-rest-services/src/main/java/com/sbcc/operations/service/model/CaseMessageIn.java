package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sbcc.operations.service.model.MessageDataList;
import com.sbcc.operations.service.model.MessageInEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseMessageIn
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class CaseMessageIn   {
  @JsonProperty("activityGuid")
  private String activityGuid = null;

  @JsonProperty("activityName")
  private String activityName = null;

  @JsonProperty("message")
  private MessageInEnum message = null;

  @JsonProperty("dataList")
  private MessageDataList dataList = null;

  public CaseMessageIn activityGuid(String activityGuid) {
    this.activityGuid = activityGuid;
    return this;
  }

   /**
   * Get activityGuid
   * @return activityGuid
  **/
  @ApiModelProperty(example = "todo", value = "")


  public String getActivityGuid() {
    return activityGuid;
  }

  public void setActivityGuid(String activityGuid) {
    this.activityGuid = activityGuid;
  }

  public CaseMessageIn activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

   /**
   * Get activityName
   * @return activityName
  **/
  @ApiModelProperty(example = "todo", required = true, value = "")
  @NotNull


  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public CaseMessageIn message(MessageInEnum message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MessageInEnum getMessage() {
    return message;
  }

  public void setMessage(MessageInEnum message) {
    this.message = message;
  }

  public CaseMessageIn dataList(MessageDataList dataList) {
    this.dataList = dataList;
    return this;
  }

   /**
   * Get dataList
   * @return dataList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MessageDataList getDataList() {
    return dataList;
  }

  public void setDataList(MessageDataList dataList) {
    this.dataList = dataList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseMessageIn caseMessageIn = (CaseMessageIn) o;
    return Objects.equals(this.activityGuid, caseMessageIn.activityGuid) &&
        Objects.equals(this.activityName, caseMessageIn.activityName) &&
        Objects.equals(this.message, caseMessageIn.message) &&
        Objects.equals(this.dataList, caseMessageIn.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityGuid, activityName, message, dataList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseMessageIn {\n");
    
    sb.append("    activityGuid: ").append(toIndentedString(activityGuid)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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

