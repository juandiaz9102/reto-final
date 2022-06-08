package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Geometry
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-17T15:26:59-0500"
)
public class GeometryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GeometryResponseProjection() {
    }

    public GeometryResponseProjection all$() {
        return all$(3);
    }

    public GeometryResponseProjection all$(int maxDepth) {
        this.x();
        this.y();
        this.typename();
        return this;
    }

    public GeometryResponseProjection x() {
        return x(null);
    }

    public GeometryResponseProjection x(String alias) {
        fields.add(new GraphQLResponseField("x").alias(alias));
        return this;
    }

    public GeometryResponseProjection y() {
        return y(null);
    }

    public GeometryResponseProjection y(String alias) {
        fields.add(new GraphQLResponseField("y").alias(alias));
        return this;
    }

    public GeometryResponseProjection typename() {
        return typename(null);
    }

    public GeometryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
