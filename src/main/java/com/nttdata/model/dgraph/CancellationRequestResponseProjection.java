package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CancellationRequest
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class CancellationRequestResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CancellationRequestResponseProjection() {
    }

    public CancellationRequestResponseProjection all$() {
        return all$(3);
    }

    public CancellationRequestResponseProjection all$(int maxDepth) {
        this.id();
        this._atType();
        this.cancellationReason();
        this.externalId();
        this.href();
        this.requestedCancellationDate();
        this.state();
        if (projectionDepthOnFields.getOrDefault("CancellationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", 0) <= maxDepth) {
            projectionDepthOnFields.put("CancellationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", projectionDepthOnFields.getOrDefault("CancellationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", 0) + 1);
            this.serviceorders(new ServiceOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CancellationRequestResponseProjection.ServiceOrderResponseProjection.serviceorders", 0)));
        }
        this._id();
        this.typename();
        return this;
    }

    public CancellationRequestResponseProjection id() {
        return id(null);
    }

    public CancellationRequestResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection _atType() {
        return _atType(null);
    }

    public CancellationRequestResponseProjection _atType(String alias) {
        fields.add(new GraphQLResponseField("_atType").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection cancellationReason() {
        return cancellationReason(null);
    }

    public CancellationRequestResponseProjection cancellationReason(String alias) {
        fields.add(new GraphQLResponseField("cancellationReason").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection externalId() {
        return externalId(null);
    }

    public CancellationRequestResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection href() {
        return href(null);
    }

    public CancellationRequestResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection requestedCancellationDate() {
        return requestedCancellationDate(null);
    }

    public CancellationRequestResponseProjection requestedCancellationDate(String alias) {
        fields.add(new GraphQLResponseField("requestedCancellationDate").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection state() {
        return state(null);
    }

    public CancellationRequestResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection serviceorders(ServiceOrderResponseProjection subProjection) {
        return serviceorders(null, subProjection);
    }

    public CancellationRequestResponseProjection serviceorders(String alias, ServiceOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceorders").alias(alias).projection(subProjection));
        return this;
    }

    public CancellationRequestResponseProjection _id() {
        return _id(null);
    }

    public CancellationRequestResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public CancellationRequestResponseProjection typename() {
        return typename(null);
    }

    public CancellationRequestResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
