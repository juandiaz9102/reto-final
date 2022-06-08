package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

/**
 * Linked service order to the one containing this attribute
 */
@ApiModel(description = "Linked service order to the one containing this attribute")
@JsonTypeName("ServiceOrderRelationship")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderRelationship extends BaseNode {

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }

        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }

        if (relationshipType != null) {
            joiner.add("relationshipType: " + GraphQLRequestSerializer.getEntry(relationshipType));
        }

        return joiner.toString();
    }


}