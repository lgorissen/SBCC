package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sbcc.operations.service.model.Credential;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserContext
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class UserContext   {
  @JsonProperty("credential")
  private Credential credential = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  public UserContext credential(Credential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }

  public UserContext token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "todo", value = "")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserContext locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "todo", value = "")


  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserContext timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(example = "todo", value = "")


  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserContext userContext = (UserContext) o;
    return Objects.equals(this.credential, userContext.credential) &&
        Objects.equals(this.token, userContext.token) &&
        Objects.equals(this.locale, userContext.locale) &&
        Objects.equals(this.timeZone, userContext.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, token, locale, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserContext {\n");
    
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

