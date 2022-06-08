package com.nttdata.model.tmf;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

/**
 * Configuration feature.
 */
@JsonTypeName("Feature")
@Data
public class Feature {

    private String id;
    private Boolean isBundle;
    private Boolean isEnabled;
    private String name;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;

    private List<Feature> featureBindsTo = new ArrayList<>();
    private List<ConstraintRef> constraintRefs = new ArrayList<>();
    private List<Characteristic> featureCharacteritic = new ArrayList<>();

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (isBundle != null) {
            joiner.add("isBundle: " + GraphQLRequestSerializer.getEntry(isBundle));
        }
        if (isEnabled != null) {
            joiner.add("isEnabled: " + GraphQLRequestSerializer.getEntry(isEnabled));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }


}
