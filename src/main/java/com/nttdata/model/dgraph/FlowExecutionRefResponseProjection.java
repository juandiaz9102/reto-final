package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowExecutionRef
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class FlowExecutionRefResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowExecutionRefResponseProjection() {
    }

    public FlowExecutionRefResponseProjection all$() {
        return all$(3);
    }

    public FlowExecutionRefResponseProjection all$(int maxDepth) {
        this.id();
        this.domainId();
        this.projectId();
        this.runId();
        this.creationDate();
        this.executionDate();
        this.endExecutionDate();
        this.workflowId();
        if (projectionDepthOnFields.getOrDefault("FlowExecutionRefResponseProjection.FlowExecutionRefResponseProjection.cancelto", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowExecutionRefResponseProjection.FlowExecutionRefResponseProjection.cancelto", projectionDepthOnFields.getOrDefault("FlowExecutionRefResponseProjection.FlowExecutionRefResponseProjection.cancelto", 0) + 1);
            this.cancelto(new FlowExecutionRefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowExecutionRefResponseProjection.FlowExecutionRefResponseProjection.cancelto", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowExecutionRefResponseProjection.ServiceOrderResponseProjection.serviceorders", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowExecutionRefResponseProjection.ServiceOrderResponseProjection.serviceorders", projectionDepthOnFields.getOrDefault("FlowExecutionRefResponseProjection.ServiceOrderResponseProjection.serviceorders", 0) + 1);
            this.serviceorders(new ServiceOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowExecutionRefResponseProjection.ServiceOrderResponseProjection.serviceorders", 0)));
        }
        this._id();
        this.typename();
        return this;
    }

    public FlowExecutionRefResponseProjection id() {
        return id(null);
    }

    public FlowExecutionRefResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection domainId() {
        return domainId(null);
    }

    public FlowExecutionRefResponseProjection domainId(String alias) {
        fields.add(new GraphQLResponseField("domainId").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection projectId() {
        return projectId(null);
    }

    public FlowExecutionRefResponseProjection projectId(String alias) {
        fields.add(new GraphQLResponseField("projectId").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection runId() {
        return runId(null);
    }

    public FlowExecutionRefResponseProjection runId(String alias) {
        fields.add(new GraphQLResponseField("runId").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection creationDate() {
        return creationDate(null);
    }

    public FlowExecutionRefResponseProjection creationDate(String alias) {
        fields.add(new GraphQLResponseField("creationDate").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection executionDate() {
        return executionDate(null);
    }

    public FlowExecutionRefResponseProjection executionDate(String alias) {
        fields.add(new GraphQLResponseField("executionDate").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection endExecutionDate() {
        return endExecutionDate(null);
    }

    public FlowExecutionRefResponseProjection endExecutionDate(String alias) {
        fields.add(new GraphQLResponseField("endExecutionDate").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection workflowId() {
        return workflowId(null);
    }

    public FlowExecutionRefResponseProjection workflowId(String alias) {
        fields.add(new GraphQLResponseField("workflowId").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection cancelto(FlowExecutionRefResponseProjection subProjection) {
        return cancelto(null, subProjection);
    }

    public FlowExecutionRefResponseProjection cancelto(String alias, FlowExecutionRefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cancelto").alias(alias).projection(subProjection));
        return this;
    }

    public FlowExecutionRefResponseProjection serviceorders(ServiceOrderResponseProjection subProjection) {
        return serviceorders(null, subProjection);
    }

    public FlowExecutionRefResponseProjection serviceorders(String alias, ServiceOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceorders").alias(alias).projection(subProjection));
        return this;
    }

    public FlowExecutionRefResponseProjection _id() {
        return _id(null);
    }

    public FlowExecutionRefResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public FlowExecutionRefResponseProjection typename() {
        return typename(null);
    }

    public FlowExecutionRefResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
