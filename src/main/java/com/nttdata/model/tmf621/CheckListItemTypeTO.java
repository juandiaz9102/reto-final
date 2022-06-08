package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CheckListItemTypeTO {

    @JsonProperty("simple")
    SIMPLE("simple"),

    @JsonProperty("string")
    STRING("string"),

    @JsonProperty("enum")
    ENUM("enum"),

    @JsonProperty("files")
    FILES("files"),

    @JsonProperty("yes_no")
    YES_NO("yes_no"),

    @JsonProperty("cell_scan")
    CELL_SCAN("cell_scan"),

    @JsonProperty("wifi_scan")
    WIFI_SCAN("wifi_scan");

    private final String value;

    CheckListItemTypeTO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CheckListItemTypeTO fromValue(String text) {
        for (CheckListItemTypeTO b : CheckListItemTypeTO.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
