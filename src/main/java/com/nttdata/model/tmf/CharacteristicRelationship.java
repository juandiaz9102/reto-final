package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

/**
 * Another Characteristic that is related to the current Characteristic;
 */
@ApiModel(description = "Another Characteristic that is related to the current Characteristic;")
@JsonTypeName("CharacteristicRelationship")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class CharacteristicRelationship /*extends BaseNode*/ {

    @JsonProperty("id")
    private String id;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (relationshipType != null) {
            joiner.add("relationshipType: " + GraphQLRequestSerializer.getEntry(relationshipType));
        }
        return joiner.toString();
    }
}