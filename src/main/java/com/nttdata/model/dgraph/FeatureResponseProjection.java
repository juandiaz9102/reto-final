package com.nttdata.model.dgraph;


import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Feature
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-07T20:01:28-0500"
)
public class FeatureResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FeatureResponseProjection() {
    }

    public FeatureResponseProjection all$() {
        return all$(3);
    }

    public FeatureResponseProjection all$(int maxDepth) {
        this.id();
        this.isBundle();
        this.isEnabled();
        this.name();
        this.typename();
        return this;
    }

    public FeatureResponseProjection id() {
        return id(null);
    }

    public FeatureResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FeatureResponseProjection isBundle() {
        return isBundle(null);
    }

    public FeatureResponseProjection isBundle(String alias) {
        fields.add(new GraphQLResponseField("isBundle").alias(alias));
        return this;
    }

    public FeatureResponseProjection isEnabled() {
        return isEnabled(null);
    }

    public FeatureResponseProjection isEnabled(String alias) {
        fields.add(new GraphQLResponseField("isEnabled").alias(alias));
        return this;
    }

    public FeatureResponseProjection name() {
        return name(null);
    }

    public FeatureResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FeatureResponseProjection typename() {
        return typename(null);
    }

    public FeatureResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
