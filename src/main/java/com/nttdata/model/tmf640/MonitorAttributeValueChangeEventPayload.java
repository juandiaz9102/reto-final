package com.nttdata.model.tmf640;

import java.util.Objects;



import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-25T14:06:01.043Z")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class MonitorAttributeValueChangeEventPayload   {
  @JsonProperty("monitor")
  private Monitor monitor = null;

  public MonitorAttributeValueChangeEventPayload monitor(Monitor monitor) {
    this.monitor = monitor;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return monitor
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  

  public Monitor getMonitor() {
    return monitor;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorAttributeValueChangeEventPayload monitorAttributeValueChangeEventPayload = (MonitorAttributeValueChangeEventPayload) o;
    return Objects.equals(this.monitor, monitorAttributeValueChangeEventPayload.monitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorAttributeValueChangeEventPayload {\n");
    
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
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

