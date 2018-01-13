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
 * Credential
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T14:24:12.340Z")

public class Credential   {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("onBehalfOfUser")
  private String onBehalfOfUser = null;

  public Credential user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "todo", required = true, value = "")
  @NotNull


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Credential password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "todo", value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Credential onBehalfOfUser(String onBehalfOfUser) {
    this.onBehalfOfUser = onBehalfOfUser;
    return this;
  }

   /**
   * Get onBehalfOfUser
   * @return onBehalfOfUser
  **/
  @ApiModelProperty(example = "todo", value = "")


  public String getOnBehalfOfUser() {
    return onBehalfOfUser;
  }

  public void setOnBehalfOfUser(String onBehalfOfUser) {
    this.onBehalfOfUser = onBehalfOfUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.user, credential.user) &&
        Objects.equals(this.password, credential.password) &&
        Objects.equals(this.onBehalfOfUser, credential.onBehalfOfUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, password, onBehalfOfUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    onBehalfOfUser: ").append(toIndentedString(onBehalfOfUser)).append("\n");
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

