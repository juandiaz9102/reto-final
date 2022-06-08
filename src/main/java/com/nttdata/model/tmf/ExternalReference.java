package com.nttdata.model.tmf;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.StringJoiner;

@Data
public class ExternalReference {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("href")
    private String href;

    @JsonProperty("externalReferenceType")
    private String externalReferenceType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;



    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }

        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }

        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (externalReferenceType != null) {
            joiner.add("externalReferenceType: " + GraphQLRequestSerializer.getEntry(externalReferenceType));
        }
        return joiner.toString();
    }


}
