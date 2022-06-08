package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceOrderItem
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-04-20T11:30:42-0500"
)
public class ServiceOrderItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceOrderItemResponseProjection() {
    }

    public ServiceOrderItemResponseProjection all$() {
        return all$(3);
    }

    public ServiceOrderItemResponseProjection all$(int maxDepth) {
        this.serviceOrderItemId();
        this.quantity();
        if (projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.AppointmentRefResponseProjection.appointment", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderItemResponseProjection.AppointmentRefResponseProjection.appointment", projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.AppointmentRefResponseProjection.appointment", 0) + 1);
            this.appointment(new AppointmentRefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.AppointmentRefResponseProjection.appointment", 0)));
        }
        this.id();
        this.type();
        this.action();
        if (projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", 0) + 1);
            this.service(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", 0)));
        }
        this.state();
        this.typename();
        return this;
    }

    public ServiceOrderItemResponseProjection serviceOrderItemId() {
        return serviceOrderItemId(null);
    }

    public ServiceOrderItemResponseProjection serviceOrderItemId(String alias) {
        fields.add(new GraphQLResponseField("serviceOrderItemId").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection quantity() {
        return quantity(null);
    }

    public ServiceOrderItemResponseProjection quantity(String alias) {
        fields.add(new GraphQLResponseField("quantity").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection appointment(AppointmentRefResponseProjection subProjection) {
        return appointment(null, subProjection);
    }

    public ServiceOrderItemResponseProjection appointment(String alias, AppointmentRefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("appointment").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderItemResponseProjection id() {
        return id(null);
    }

    public ServiceOrderItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection type() {
        return type(null);
    }

    public ServiceOrderItemResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection action() {
        return action(null);
    }

    public ServiceOrderItemResponseProjection action(String alias) {
        fields.add(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection service(ServiceSOMResponseProjection subProjection) {
        return service(null, subProjection);
    }

    public ServiceOrderItemResponseProjection service(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("service").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderItemResponseProjection state() {
        return state(null);
    }

    public ServiceOrderItemResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection typename() {
        return typename(null);
    }

    public ServiceOrderItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
