package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum YesNoResponseTO {

    @JsonProperty("YES")
    YES("YES"),
    @JsonProperty("NO")
    NO("NO");

    private final String value;

    YesNoResponseTO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static YesNoResponseTO fromValue(String text) {
        for (YesNoResponseTO b : YesNoResponseTO.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
