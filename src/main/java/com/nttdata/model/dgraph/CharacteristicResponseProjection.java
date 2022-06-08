package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Characteristic
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class CharacteristicResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CharacteristicResponseProjection() {
    }

    public CharacteristicResponseProjection all$() {
        return all$(3);
    }

    public CharacteristicResponseProjection all$(int maxDepth) {
        this.id();
        this.characteristicId();
        this.type();
        this.name();
        this.unitOfMeasure();
        this.value();
        this.valueType();
        this.valueUnits();
        if (projectionDepthOnFields.getOrDefault("CharacteristicResponseProjection.ServiceSOMResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("CharacteristicResponseProjection.ServiceSOMResponseProjection.services", projectionDepthOnFields.getOrDefault("CharacteristicResponseProjection.ServiceSOMResponseProjection.services", 0) + 1);
            this.services(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CharacteristicResponseProjection.ServiceSOMResponseProjection.services", 0)));
        }
        return this;
    }

    public CharacteristicResponseProjection characteristicId() {
        return characteristicId(null);
    }

    public CharacteristicResponseProjection characteristicId(String alias) {
        fields.add(new GraphQLResponseField("characteristicId").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection id() {
        return id(null);
    }

    public CharacteristicResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection type() {
        return type(null);
    }

    public CharacteristicResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection name() {
        return name(null);
    }

    public CharacteristicResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection unitOfMeasure() {
        return unitOfMeasure(null);
    }

    public CharacteristicResponseProjection unitOfMeasure(String alias) {
        fields.add(new GraphQLResponseField("unitOfMeasure").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection value() {
        return value(null);
    }

    public CharacteristicResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection valueType() {
        return valueType(null);
    }

    public CharacteristicResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection valueUnits() {
        return valueUnits(null);
    }

    public CharacteristicResponseProjection valueUnits(String alias) {
        fields.add(new GraphQLResponseField("valueUnits").alias(alias));
        return this;
    }

    public CharacteristicResponseProjection services(ServiceSOMResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public CharacteristicResponseProjection services(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public CharacteristicResponseProjection characteristicRelationship(CharacteristicRelationshipResponseProjection subProjection) {
        return characteristicRelationship(null, subProjection);
    }

    public CharacteristicResponseProjection characteristicRelationship(String alias, CharacteristicRelationshipResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("characteristicRelationship").alias(alias).projection(subProjection));
        return this;
    }

}