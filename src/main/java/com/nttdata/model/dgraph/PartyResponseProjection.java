package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Party
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class PartyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PartyResponseProjection() {
    }

    public PartyResponseProjection all$() {
        return all$(3);
    }

    public PartyResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.name();
        this.role();
        if (projectionDepthOnFields.getOrDefault("PartyResponseProjection.ServiceOrderResponseProjection.relatedto", 0) <= maxDepth) {
            projectionDepthOnFields.put("PartyResponseProjection.ServiceOrderResponseProjection.relatedto", projectionDepthOnFields.getOrDefault("PartyResponseProjection.ServiceOrderResponseProjection.relatedto", 0) + 1);
            this.relatedto(new ServiceOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PartyResponseProjection.ServiceOrderResponseProjection.relatedto", 0)));
        }
        this._id();
        this.typename();
        return this;
    }

    public PartyResponseProjection id() {
        return id(null);
    }

    public PartyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PartyResponseProjection href() {
        return href(null);
    }

    public PartyResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public PartyResponseProjection name() {
        return name(null);
    }

    public PartyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PartyResponseProjection role() {
        return role(null);
    }

    public PartyResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public PartyResponseProjection relatedto(ServiceOrderResponseProjection subProjection) {
        return relatedto(null, subProjection);
    }

    public PartyResponseProjection relatedto(String alias, ServiceOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedto").alias(alias).projection(subProjection));
        return this;
    }

    public PartyResponseProjection type() {
        return type(null);
    }

    public PartyResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public PartyResponseProjection baseType() {
        return baseType(null);
    }

    public PartyResponseProjection baseType(String alias) {
        fields.add(new GraphQLResponseField("baseType").alias(alias));
        return this;
    }

    public PartyResponseProjection schemaLocation() {
        return schemaLocation(null);
    }

    public PartyResponseProjection schemaLocation(String alias) {
        fields.add(new GraphQLResponseField("schemaLocation").alias(alias));
        return this;
    }

    public PartyResponseProjection referredType() {
        return referredType(null);
    }

    public PartyResponseProjection referredType(String alias) {
        fields.add(new GraphQLResponseField("referredType").alias(alias));
        return this;
    }


    public PartyResponseProjection _id() {
        return _id(null);
    }

    public PartyResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public PartyResponseProjection typename() {
        return typename(null);
    }

    public PartyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
