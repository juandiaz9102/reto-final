package com.nttdata.model.tmf;

import java.util.List;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf638.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * ServiceOrderItem
 */
@JsonTypeName("ServiceOrderItem")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ServiceOrderItem extends BaseNode {

    @JsonProperty("serviceOrderItemId")
    private String serviceOrderItemId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("action")
    private OrderItemActionType action;

    @JsonProperty("appointment")
    private AppointmentRef appointment;

    @JsonProperty("service")
    private Service service;

    @JsonProperty("serviceOrderItem")
    private List<ServiceOrderItem> item;

    @JsonProperty("serviceOrderItemRelationship")
    private List<ServiceOrderItemRelationship> serviceOrderItemRelationship;

    @JsonProperty("state")
    private ServiceOrderItemStateType state;

    @JsonProperty("flowInstanceRef")
    private FlowInstanceRef flowInstanceRef;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (serviceOrderItemId != null) {
            joiner.add("serviceOrderItemId: " + GraphQLRequestSerializer.getEntry(serviceOrderItemId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action.toString()));
        }
        if (service != null) {
            joiner.add("service: " + GraphQLRequestSerializer.getEntry(service));
        }
        if(quantity != null){
            joiner.add("quantity: " + GraphQLRequestSerializer.getEntry(quantity));
        }
        if(appointment!=null){
            joiner.add("appointment: " + GraphQLRequestSerializer.getEntry(appointment));
        }
        if(state!=null){
            joiner.add("state: \"" + GraphQLRequestSerializer.getEntry(state)+"\"");
        }
//        if (composedof != null) {
//            joiner.add("composedof: " + GraphQLRequestSerializer.getEntry(composedof));
//        }
//        if (_id != null) {
//            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
//        }
        return joiner.toString();
    }

}