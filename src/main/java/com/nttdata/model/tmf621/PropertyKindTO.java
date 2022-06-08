package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PropertyKindTO {

    @JsonProperty("string")
    STRING,
    @JsonProperty("int")
    INT,
    @JsonProperty("bool")
    BOOL,
    @JsonProperty("float")
    FLOAT,
    @JsonProperty("date")
    DATE,
    @JsonProperty("enum")
    ENUM,
    @JsonProperty("range")
    RANGE,
    @JsonProperty("email")
    EMAIL,
    @JsonProperty("gps_location")
    GPS_LOCATION,
    @JsonProperty("datetime_local")
    DATETIME_LOCAL,
    @JsonProperty("node")
    NODE
}
