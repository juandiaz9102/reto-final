package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AppointmentRef
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-25T16:00:59-0500"
)
public class AppointmentRefResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AppointmentRefResponseProjection() {
    }

    public AppointmentRefResponseProjection all$() {
        return all$(3);
    }

    public AppointmentRefResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.description();
        this.typename();
        return this;
    }

    public AppointmentRefResponseProjection id() {
        return id(null);
    }

    public AppointmentRefResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AppointmentRefResponseProjection href() {
        return href(null);
    }

    public AppointmentRefResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public AppointmentRefResponseProjection description() {
        return description(null);
    }

    public AppointmentRefResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public AppointmentRefResponseProjection typename() {
        return typename(null);
    }

    public AppointmentRefResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
