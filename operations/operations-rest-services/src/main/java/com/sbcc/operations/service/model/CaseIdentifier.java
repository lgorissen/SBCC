package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseIdentifier
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class CaseIdentifier   {
  @JsonProperty("caseId")
  private String caseId = null;

  @JsonProperty("identificationKey")
  private String identificationKey = null;

  public CaseIdentifier caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }

   /**
   * Get caseId
   * @return caseId
  **/
  @ApiModelProperty(example = "NL17.1234", required = true, value = "")
  @NotNull


  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }

  public CaseIdentifier identificationKey(String identificationKey) {
    this.identificationKey = identificationKey;
    return this;
  }

   /**
   * Get identificationKey
   * @return identificationKey
  **/
  @ApiModelProperty(example = "987654321", required = true, value = "")
  @NotNull


  public String getIdentificationKey() {
    return identificationKey;
  }

  public void setIdentificationKey(String identificationKey) {
    this.identificationKey = identificationKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseIdentifier caseIdentifier = (CaseIdentifier) o;
    return Objects.equals(this.caseId, caseIdentifier.caseId) &&
        Objects.equals(this.identificationKey, caseIdentifier.identificationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, identificationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseIdentifier {\n");
    
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    identificationKey: ").append(toIndentedString(identificationKey)).append("\n");
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

