package com.nttdata.model.dgraph;


import java.util.HashMap;
import java.util.Map;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ResourceRef
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-07T18:13:34-0500"
)
public class ResourceRefResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourceRefResponseProjection() {
    }

    public ResourceRefResponseProjection all$() {
        return all$(3);
    }

    public ResourceRefResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.name();
        this.version();
        this.typename();
        return this;
    }

    public ResourceRefResponseProjection id() {
        return id(null);
    }

    public ResourceRefResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourceRefResponseProjection href() {
        return href(null);
    }

    public ResourceRefResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ResourceRefResponseProjection name() {
        return name(null);
    }

    public ResourceRefResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ResourceRefResponseProjection version() {
        return version(null);
    }

    public ResourceRefResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public ResourceRefResponseProjection typename() {
        return typename(null);
    }

    public ResourceRefResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

}

