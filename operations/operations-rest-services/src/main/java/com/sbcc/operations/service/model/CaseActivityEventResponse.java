package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sbcc.operations.service.model.CaseIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseActivityEventResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class CaseActivityEventResponse   {
  @JsonProperty("caseIdentifier")
  private CaseIdentifier caseIdentifier = null;

  public CaseActivityEventResponse caseIdentifier(CaseIdentifier caseIdentifier) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseActivityEventResponse caseActivityEventResponse = (CaseActivityEventResponse) o;
    return Objects.equals(this.caseIdentifier, caseActivityEventResponse.caseIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseActivityEventResponse {\n");
    
    sb.append("    caseIdentifier: ").append(toIndentedString(caseIdentifier)).append("\n");
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

