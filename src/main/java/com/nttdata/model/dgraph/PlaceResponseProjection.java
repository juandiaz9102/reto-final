package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Place
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class PlaceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PlaceResponseProjection() {
    }

    public PlaceResponseProjection all$() {
        return all$(3);
    }

    public PlaceResponseProjection all$(int maxDepth) {
        this.placeId();
        this.id();
        this.href();
        this.name();
        this.role();
        this.type();
        this._atType();
        if (projectionDepthOnFields.getOrDefault("PlaceResponseProjection.ServiceSOMResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("PlaceResponseProjection.ServiceSOMResponseProjection.services", projectionDepthOnFields.getOrDefault("PlaceResponseProjection.ServiceSOMResponseProjection.services", 0) + 1);
            this.services(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PlaceResponseProjection.ServiceSOMResponseProjection.services", 0)));
        }
        this._id();
        this.geometryType();
        this.accuracy();
        this.spatialRef();
        if (projectionDepthOnFields.getOrDefault("PlaceResponseProjection.GeometryResponseProjection.geometry", 0) <= maxDepth) {
            projectionDepthOnFields.put("PlaceResponseProjection.GeometryResponseProjection.geometry", projectionDepthOnFields.getOrDefault("PlaceResponseProjection.GeometryResponseProjection.geometry", 0) + 1);
            this.geometry(new GeometryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PlaceResponseProjection.GeometryResponseProjection.geometry", 0)));
        }
        this.typename();
        return this;
    }

    public PlaceResponseProjection placeId() {
        return placeId(null);
    }

    public PlaceResponseProjection placeId(String alias) {
        fields.add(new GraphQLResponseField("placeId").alias(alias));
        return this;
    }

    public PlaceResponseProjection id() {
        return id(null);
    }

    public PlaceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PlaceResponseProjection name() {
        return name(null);
    }

    public PlaceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PlaceResponseProjection href() {
        return href(null);
    }

    public PlaceResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public PlaceResponseProjection role() {
        return role(null);
    }

    public PlaceResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public PlaceResponseProjection _atType() {
        return _atType(null);
    }

    public PlaceResponseProjection _atType(String alias) {
        fields.add(new GraphQLResponseField("_atType").alias(alias));
        return this;
    }

    public PlaceResponseProjection services(ServiceSOMResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public PlaceResponseProjection services(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public PlaceResponseProjection type() {
        return type(null);
    }

    public PlaceResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public PlaceResponseProjection _id() {
        return _id(null);
    }

    public PlaceResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }
    public PlaceResponseProjection geometryType() {
        return geometryType(null);
    }

    public PlaceResponseProjection geometryType(String alias) {
        fields.add(new GraphQLResponseField("geometryType").alias(alias));
        return this;
    }

    public PlaceResponseProjection accuracy() {
        return accuracy(null);
    }

    public PlaceResponseProjection accuracy(String alias) {
        fields.add(new GraphQLResponseField("accuracy").alias(alias));
        return this;
    }

    public PlaceResponseProjection spatialRef() {
        return spatialRef(null);
    }

    public PlaceResponseProjection spatialRef(String alias) {
        fields.add(new GraphQLResponseField("spatialRef").alias(alias));
        return this;
    }

    public PlaceResponseProjection geometry(GeometryResponseProjection subProjection) {
        return geometry(null, subProjection);
    }

    public PlaceResponseProjection geometry(String alias, GeometryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("geometry").alias(alias).projection(subProjection));
        return this;
    }

    public PlaceResponseProjection typename() {
        return typename(null);
    }

    public PlaceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
