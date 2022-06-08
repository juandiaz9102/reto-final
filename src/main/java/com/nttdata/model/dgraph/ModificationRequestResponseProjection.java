package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ModificationRequest
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class ModificationRequestResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ModificationRequestResponseProjection() {
    }

    public ModificationRequestResponseProjection all$() {
        return all$(3);
    }

    public ModificationRequestResponseProjection all$(int maxDepth) {
        this.id();
        this._atType();
        this.externalId();
        this.modifyReason();
        this.requestedCompletionDate();
        if (projectionDepthOnFields.getOrDefault("ModificationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", 0) <= maxDepth) {
            projectionDepthOnFields.put("ModificationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", projectionDepthOnFields.getOrDefault("ModificationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", 0) + 1);
            this.serviceorders(new ServiceOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ModificationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", 0)));
        }
        this._id();
        this.typename();
        return this;
    }

    public ModificationRequestResponseProjection id() {
        return id(null);
    }

    public ModificationRequestResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ModificationRequestResponseProjection _atType() {
        return _atType(null);
    }

    public ModificationRequestResponseProjection _atType(String alias) {
        fields.add(new GraphQLResponseField("_atType").alias(alias));
        return this;
    }

    public ModificationRequestResponseProjection externalId() {
        return externalId(null);
    }

    public ModificationRequestResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ModificationRequestResponseProjection modifyReason() {
        return modifyReason(null);
    }

    public ModificationRequestResponseProjection modifyReason(String alias) {
        fields.add(new GraphQLResponseField("modifyReason").alias(alias));
        return this;
    }

    public ModificationRequestResponseProjection requestedCompletionDate() {
        return requestedCompletionDate(null);
    }

    public ModificationRequestResponseProjection requestedCompletionDate(String alias) {
        fields.add(new GraphQLResponseField("requestedCompletionDate").alias(alias));
        return this;
    }

    public ModificationRequestResponseProjection serviceorders(ServiceOrderResponseProjection subProjection) {
        return serviceorders(null, subProjection);
    }

    public ModificationRequestResponseProjection serviceorders(String alias, ServiceOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceorders").alias(alias).projection(subProjection));
        return this;
    }

    public ModificationRequestResponseProjection _id() {
        return _id(null);
    }

    public ModificationRequestResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ModificationRequestResponseProjection typename() {
        return typename(null);
    }

    public ModificationRequestResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
