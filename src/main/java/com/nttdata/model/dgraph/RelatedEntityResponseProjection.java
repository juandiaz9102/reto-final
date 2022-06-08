package com.nttdata.model.dgraph;


import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for relatedEntity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-07T18:53:07-0500"
)
public class RelatedEntityResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RelatedEntityResponseProjection() {
    }

    public RelatedEntityResponseProjection all$() {
        return all$(3);
    }

    public RelatedEntityResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.name();
        this.role();
        this.typename();
        return this;
    }

    public RelatedEntityResponseProjection id() {
        return id(null);
    }

    public RelatedEntityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RelatedEntityResponseProjection href() {
        return href(null);
    }

    public RelatedEntityResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public RelatedEntityResponseProjection name() {
        return name(null);
    }

    public RelatedEntityResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RelatedEntityResponseProjection role() {
        return role(null);
    }

    public RelatedEntityResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public RelatedEntityResponseProjection typename() {
        return typename(null);
    }

    public RelatedEntityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
