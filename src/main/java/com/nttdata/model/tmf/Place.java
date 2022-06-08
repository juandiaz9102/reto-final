package com.nttdata.model.tmf;


import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.List;
import java.util.StringJoiner;

/**
 * Place reference. Place defines the places where the products are sold or delivered.
 */
@JsonTypeName("Place")
@Data
public class Place extends BaseNode {
    private String placeId;
    private String id;
    private String href;
    private String name;
    private String role;

    private String geometryType;
    private String accuracy;
    private String spatialRef;

    private List<Geometry> geometry;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (placeId != null) {
            joiner.add("placeId: " + GraphQLRequestSerializer.getEntry(placeId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (geometryType != null) {
            joiner.add("geometryType: " + GraphQLRequestSerializer.getEntry(geometryType));
        }
        if (accuracy != null) {
            joiner.add("accuracy: " + GraphQLRequestSerializer.getEntry(accuracy));
        }
        if (spatialRef != null) {
            joiner.add("spatialRef: " + GraphQLRequestSerializer.getEntry(spatialRef));
        }
        if (geometry != null) {
            joiner.add("geometry: " + GraphQLRequestSerializer.getEntry(geometry));
        }
        if (schemaLocation != null) {
            joiner.add("schemaLocation: " + GraphQLRequestSerializer.getEntry(schemaLocation));
        }
        if (baseType != null) {
            joiner.add("baseType: " + GraphQLRequestSerializer.getEntry(baseType));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }
}

