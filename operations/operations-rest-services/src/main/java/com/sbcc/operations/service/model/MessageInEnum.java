package com.sbcc.operations.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MessageInEnum
 */
public enum MessageInEnum {
  
  ABORTED("ABORTED"),
  
  COMPLETED("COMPLETED"),
  
  FAULTED("FAULTED"),
  
  STARTED("STARTED");

  private String value;

  MessageInEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageInEnum fromValue(String text) {
    for (MessageInEnum b : MessageInEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

