package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceRelationship
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-29T12:06:37-0500"
)
public class ServiceRelationshipResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceRelationshipResponseProjection() {
    }

    public ServiceRelationshipResponseProjection all$() {
        return all$(3);
    }

    public ServiceRelationshipResponseProjection all$(int maxDepth) {
        this.id();
        this.relationshipType();
        if (projectionDepthOnFields.getOrDefault("ServiceRelationshipResponseProjection.ServiceSOMResponseProjection.service", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceRelationshipResponseProjection.ServiceSOMResponseProjection.service", projectionDepthOnFields.getOrDefault("ServiceRelationshipResponseProjection.ServiceSOMResponseProjection.service", 0) + 1);
            this.service(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceRelationshipResponseProjection.ServiceSOMResponseProjection.service", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceRelationshipResponseProjection.CharacteristicResponseProjection.serviceRelationshipCharacteristic", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceRelationshipResponseProjection.CharacteristicResponseProjection.serviceRelationshipCharacteristic", projectionDepthOnFields.getOrDefault("ServiceRelationshipResponseProjection.CharacteristicResponseProjection.serviceRelationshipCharacteristic", 0) + 1);
            this.serviceRelationshipCharacteristic(new CharacteristicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceRelationshipResponseProjection.CharacteristicResponseProjection.serviceRelationshipCharacteristic", 0)));
        }
        return this;
    }

    public ServiceRelationshipResponseProjection id() {
        return id(null);
    }

    public ServiceRelationshipResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceRelationshipResponseProjection relationshipType() {
        return relationshipType(null);
    }

    public ServiceRelationshipResponseProjection relationshipType(String alias) {
        fields.add(new GraphQLResponseField("relationshipType").alias(alias));
        return this;
    }

    public ServiceRelationshipResponseProjection service(ServiceSOMResponseProjection subProjection) {
        return service(null, subProjection);
    }

    public ServiceRelationshipResponseProjection service(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("service").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceRelationshipResponseProjection serviceRelationshipCharacteristic(CharacteristicResponseProjection subProjection) {
        return serviceRelationshipCharacteristic(null, subProjection);
    }

    public ServiceRelationshipResponseProjection serviceRelationshipCharacteristic(String alias, CharacteristicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceRelationshipCharacteristic").alias(alias).projection(subProjection));
        return this;
    }

}
