package com.nttdata.model.dgraph;

import java.util.HashMap;
import java.util.Map;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ServiceOrder
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-04-20T12:31:47-0500"
)
public class ServiceOrderResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceOrderResponseProjection() {
    }

    public ServiceOrderResponseProjection all$() {
        return all$(3);
    }

    public ServiceOrderResponseProjection all$(int maxDepth) {
        this.id();
        this._atType();
        this.category();
        this.description();
        this.externalId();
        this.priority();
        this.orderDate();
        this.startDate();
        this.requestedCompletionDate();
        this.requestedStartDate();
        this.state();
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ExternalReferenceResponseProjection.externalReference", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.ExternalReferenceResponseProjection.externalReference", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ExternalReferenceResponseProjection.externalReference", 0) + 1);
            this.externalReference(new ExternalReferenceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ExternalReferenceResponseProjection.externalReference", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderRelationshipResponseProjection.orderRelationship", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.ServiceOrderRelationshipResponseProjection.orderRelationship", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderRelationshipResponseProjection.orderRelationship", 0) + 1);
            this.orderRelationship(new ServiceOrderRelationshipResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderRelationshipResponseProjection.orderRelationship", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.PartyResponseProjection.relatedParty", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.PartyResponseProjection.relatedParty", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.PartyResponseProjection.relatedParty", 0) + 1);
            this.relatedParty(new PartyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.PartyResponseProjection.relatedParty", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.flowExecutionRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.flowExecutionRef", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.flowExecutionRef", 0) + 1);
            this.flowExecutionRef(new FlowExecutionRefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.flowExecutionRef", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelRequest", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelRequest", 0) + 1);
            this.cancelRequest(new CancellationRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyRequest", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyRequest", 0) + 1);
            this.modifyRequest(new ModificationRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.serviceOrderItem", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.serviceOrderItem", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.serviceOrderItem", 0) + 1);
            this.serviceOrderItem(new ServiceOrderItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.serviceOrderItem", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.NoteResponseProjection.note", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.NoteResponseProjection.note", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.NoteResponseProjection.note", 0) + 1);
            this.note(new NoteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.NoteResponseProjection.note", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceOrderResponseProjection id() {
        return id(null);
    }

    public ServiceOrderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection href() {
        return href(null);
    }

    public ServiceOrderResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection msg() {
        return msg(null);
    }

    public ServiceOrderResponseProjection msg(String alias) {
        fields.add(new GraphQLResponseField("msg").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection _atType() {
        return _atType(null);
    }

    public ServiceOrderResponseProjection _atType(String alias) {
        fields.add(new GraphQLResponseField("_atType").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection category() {
        return category(null);
    }

    public ServiceOrderResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection description() {
        return description(null);
    }

    public ServiceOrderResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection externalId() {
        return externalId(null);
    }

    public ServiceOrderResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection priority() {
        return priority(null);
    }

    public ServiceOrderResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection orderDate() {
        return orderDate(null);
    }

    public ServiceOrderResponseProjection orderDate(String alias) {
        fields.add(new GraphQLResponseField("orderDate").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection startDate() {
        return startDate(null);
    }

    public ServiceOrderResponseProjection startDate(String alias) {
        fields.add(new GraphQLResponseField("startDate").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection requestedCompletionDate() {
        return requestedCompletionDate(null);
    }

    public ServiceOrderResponseProjection requestedCompletionDate(String alias) {
        fields.add(new GraphQLResponseField("requestedCompletionDate").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection requestedStartDate() {
        return requestedStartDate(null);
    }

    public ServiceOrderResponseProjection requestedStartDate(String alias) {
        fields.add(new GraphQLResponseField("requestedStartDate").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection state() {
        return state(null);
    }

    public ServiceOrderResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection externalReference(ExternalReferenceResponseProjection subProjection) {
        return externalReference(null, subProjection);
    }

    public ServiceOrderResponseProjection externalReference(String alias, ExternalReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("externalReference").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection orderRelationship(ServiceOrderRelationshipResponseProjection subProjection) {
        return orderRelationship(null, subProjection);
    }

    public ServiceOrderResponseProjection orderRelationship(String alias, ServiceOrderRelationshipResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("orderRelationship").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection relatedParty(PartyResponseProjection subProjection) {
        return relatedParty(null, subProjection);
    }

    public ServiceOrderResponseProjection relatedParty(String alias, PartyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedParty").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection flowExecutionRef(FlowExecutionRefResponseProjection subProjection) {
        return flowExecutionRef(null, subProjection);
    }

    public ServiceOrderResponseProjection flowExecutionRef(String alias, FlowExecutionRefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("flowExecutionRef").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection cancelRequest(CancellationRequestResponseProjection subProjection) {
        return cancelRequest(null, subProjection);
    }

    public ServiceOrderResponseProjection cancelRequest(String alias, CancellationRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cancelRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection modifyRequest(ModificationRequestResponseProjection subProjection) {
        return modifyRequest(null, subProjection);
    }

    public ServiceOrderResponseProjection modifyRequest(String alias, ModificationRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("modifyRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection serviceOrderItem(ServiceOrderItemResponseProjection subProjection) {
        return serviceOrderItem(null, subProjection);
    }

    public ServiceOrderResponseProjection serviceOrderItem(String alias, ServiceOrderItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceOrderItem").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection note(NoteResponseProjection subProjection) {
        return note(null, subProjection);
    }

    public ServiceOrderResponseProjection note(String alias, NoteResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("note").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection typename() {
        return typename(null);
    }

    public ServiceOrderResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
