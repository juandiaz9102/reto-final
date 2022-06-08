package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Note
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class NoteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NoteResponseProjection() {
    }

    public NoteResponseProjection all$() {
        return all$(3);
    }

    public NoteResponseProjection all$(int maxDepth) {
        this.id();
        this.author();
        this.date();
        this.text();
        if (projectionDepthOnFields.getOrDefault("NoteResponseProjection.ServiceOrderResponseProjection.serviceorder", 0) <= maxDepth) {
            projectionDepthOnFields.put("NoteResponseProjection.ServiceOrderResponseProjection.serviceorder", projectionDepthOnFields.getOrDefault("NoteResponseProjection.ServiceOrderResponseProjection.serviceorder", 0) + 1);
            this.serviceorder(new ServiceOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NoteResponseProjection.ServiceOrderResponseProjection.serviceorder", 0)));
        }
        this._id();
        this.typename();
        return this;
    }

    public NoteResponseProjection id() {
        return id(null);
    }

    public NoteResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NoteResponseProjection author() {
        return author(null);
    }

    public NoteResponseProjection author(String alias) {
        fields.add(new GraphQLResponseField("author").alias(alias));
        return this;
    }

    public NoteResponseProjection date() {
        return date(null);
    }

    public NoteResponseProjection date(String alias) {
        fields.add(new GraphQLResponseField("date").alias(alias));
        return this;
    }

    public NoteResponseProjection text() {
        return text(null);
    }

    public NoteResponseProjection text(String alias) {
        fields.add(new GraphQLResponseField("text").alias(alias));
        return this;
    }

    public NoteResponseProjection serviceorder(ServiceOrderResponseProjection subProjection) {
        return serviceorder(null, subProjection);
    }

    public NoteResponseProjection serviceorder(String alias, ServiceOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceorder").alias(alias).projection(subProjection));
        return this;
    }

    public NoteResponseProjection _id() {
        return _id(null);
    }

    public NoteResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public NoteResponseProjection typename() {
        return typename(null);
    }

    public NoteResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
