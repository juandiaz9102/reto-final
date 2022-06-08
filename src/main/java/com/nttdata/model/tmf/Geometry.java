package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.StringJoiner;


@Data
public class Geometry {

    @JsonProperty("x")
    private String x;

    @JsonProperty("y")
    private String y;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (x != null) {
            joiner.add("x: " + GraphQLRequestSerializer.getEntry(x));
        }
        if (y != null) {
            joiner.add("y: " + GraphQLRequestSerializer.getEntry(y));
        }
        return joiner.toString();
    }

}
