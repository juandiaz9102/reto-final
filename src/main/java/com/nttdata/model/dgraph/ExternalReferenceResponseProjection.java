package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ExternalReference
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-20T09:59:31-0500"
)
public class ExternalReferenceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ExternalReferenceResponseProjection() {
    }

    public ExternalReferenceResponseProjection all$() {
        return all$(3);
    }

    public ExternalReferenceResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.externalReferenceType();
        this.name();
        this.typename();
        return this;
    }

    public ExternalReferenceResponseProjection id() {
        return id(null);
    }

    public ExternalReferenceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ExternalReferenceResponseProjection href() {
        return href(null);
    }

    public ExternalReferenceResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ExternalReferenceResponseProjection externalReferenceType() {
        return externalReferenceType(null);
    }

    public ExternalReferenceResponseProjection externalReferenceType(String alias) {
        fields.add(new GraphQLResponseField("externalReferenceType").alias(alias));
        return this;
    }

    public ExternalReferenceResponseProjection name() {
        return name(null);
    }

    public ExternalReferenceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ExternalReferenceResponseProjection typename() {
        return typename(null);
    }

    public ExternalReferenceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}

