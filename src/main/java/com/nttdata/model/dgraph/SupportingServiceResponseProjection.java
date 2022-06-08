package com.nttdata.model.dgraph;


import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SupportingService
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-07T18:13:34-0500"
)
public class SupportingServiceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SupportingServiceResponseProjection() {
    }

    public SupportingServiceResponseProjection all$() {
        return all$(3);
    }

    public SupportingServiceResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this._atReferredType();
        this._atType();
        this._id();
        this.typename();
        return this;
    }

    public SupportingServiceResponseProjection id() {
        return id(null);
    }

    public SupportingServiceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SupportingServiceResponseProjection href() {
        return href(null);
    }

    public SupportingServiceResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public SupportingServiceResponseProjection _atReferredType() {
        return _atReferredType(null);
    }

    public SupportingServiceResponseProjection _atReferredType(String alias) {
        fields.add(new GraphQLResponseField("_atReferredType").alias(alias));
        return this;
    }

    public SupportingServiceResponseProjection _atType() {
        return _atType(null);
    }

    public SupportingServiceResponseProjection _atType(String alias) {
        fields.add(new GraphQLResponseField("_atType").alias(alias));
        return this;
    }

    public SupportingServiceResponseProjection _id() {
        return _id(null);
    }

    public SupportingServiceResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public SupportingServiceResponseProjection typename() {
        return typename(null);
    }

    public SupportingServiceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
