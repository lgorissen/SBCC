package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sbcc.operations.service.model.CaseIdentifier;
import com.sbcc.operations.service.model.CaseMessageIn;
import com.sbcc.operations.service.model.UserContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseActivityEventRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class CaseActivityEventRequest   {
  @JsonProperty("caseIdentifier")
  private CaseIdentifier caseIdentifier = null;

  @JsonProperty("userContext")
  private UserContext userContext = null;

  @JsonProperty("caseMessageIn")
  private CaseMessageIn caseMessageIn = null;

  public CaseActivityEventRequest caseIdentifier(CaseIdentifier caseIdentifier) {
    this.caseIdentifier = caseIdentifier;
    return this;
  }

   /**
   * Get caseIdentifier
   * @return caseIdentifier
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CaseIdentifier getCaseIdentifier() {
    return caseIdentifier;
  }

  public void setCaseIdentifier(CaseIdentifier caseIdentifier) {
    this.caseIdentifier = caseIdentifier;
  }

  public CaseActivityEventRequest userContext(UserContext userContext) {
    this.userContext = userContext;
    return this;
  }

   /**
   * Get userContext
   * @return userContext
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserContext getUserContext() {
    return userContext;
  }

  public void setUserContext(UserContext userContext) {
    this.userContext = userContext;
  }

  public CaseActivityEventRequest caseMessageIn(CaseMessageIn caseMessageIn) {
    this.caseMessageIn = caseMessageIn;
    return this;
  }

   /**
   * Get caseMessageIn
   * @return caseMessageIn
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CaseMessageIn getCaseMessageIn() {
    return caseMessageIn;
  }

  public void setCaseMessageIn(CaseMessageIn caseMessageIn) {
    this.caseMessageIn = caseMessageIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseActivityEventRequest caseActivityEventRequest = (CaseActivityEventRequest) o;
    return Objects.equals(this.caseIdentifier, caseActivityEventRequest.caseIdentifier) &&
        Objects.equals(this.userContext, caseActivityEventRequest.userContext) &&
        Objects.equals(this.caseMessageIn, caseActivityEventRequest.caseMessageIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseIdentifier, userContext, caseMessageIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseActivityEventRequest {\n");
    
    sb.append("    caseIdentifier: ").append(toIndentedString(caseIdentifier)).append("\n");
    sb.append("    userContext: ").append(toIndentedString(userContext)).append("\n");
    sb.append("    caseMessageIn: ").append(toIndentedString(caseMessageIn)).append("\n");
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

