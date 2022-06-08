package com.nttdata.model.tmf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ServiceOrder
 */
@JsonTypeName("ServiceOrder")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrder extends BaseNode {

    @JsonProperty("id")
    @ApiModelProperty(example = "0x23")
    protected String id;

    @JsonProperty("href")
    protected String href;

    @JsonProperty("_atType")
    protected String _atType;

    @JsonProperty("cancellationDate")
    protected Date cancellationDate;

    @JsonProperty("cancellationReason")
    protected String cancellationReason;

    @JsonProperty("category")
    protected String category;

    @JsonProperty("completionDate")
    protected Date completionDate;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("expectedCompletionDate")
    protected Date expectedCompletionDate;

    @JsonProperty("externalId")
    protected String externalId;

    @JsonProperty("notificationContact")
    protected String notificationContact;

    @JsonProperty("orderDate")
    protected Date orderDate;

    @JsonProperty("priority")
    protected String priority;

    @JsonProperty("requestedCompletionDate")
    protected Date requestedCompletionDate;

    @JsonProperty("requestedStartDate")
    protected Date requestedStartDate;

    @JsonProperty("startDate")
    protected Date startDate;

    @JsonProperty("externalReference")
    protected List<ExternalReference> externalReference;

    @JsonProperty("note")
    protected List<Note> note;

    @JsonProperty("orderRelationship")
    protected List<ServiceOrderRelationship> orderRelationship;

    @JsonProperty("relatedParty")
    protected List<Party> relatedParty;

    @JsonProperty("serviceOrderItem")
    protected List<ServiceOrderItem> serviceOrderItem;

    @JsonProperty("cancelRequest")
    protected CancellationRequest cancelRequest;

    @JsonProperty("modifyRequest")
    protected List<ModificationRequest> modifyRequest;

    @JsonProperty("updateRequest")
    protected List<UpdateResourceServiceOrder> updateRequest;

    @JsonProperty("state")
    protected ServiceOrderStateType state;
    //protected String state;

    @JsonProperty("flowExecutionRef")
    protected FlowExecutionRef flowExecutionRef;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if (getId() != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(getId()));
        }
        if (getHref() != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(getHref()));
        }
        if (getCategory() != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(getCategory()));
        }
        if (getDescription() != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(getDescription()));
        }
        if (getExternalId() != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(getExternalId()));
        }
        //
        if (getPriority() != null) {
            joiner.add("priority: " + GraphQLRequestSerializer.getEntry(getPriority()));
        }

        if (getNote() != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(getNote()));
        }


        //
        if (getRequestedCompletionDate() != null) {
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
            String fecha = dateFormat.format(getRequestedStartDate());
            joiner.add("requestedCompletionDate: " + GraphQLRequestSerializer.getEntry(fecha));
        }
        //
        if (getRequestedStartDate() != null) {
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
            String fecha = dateFormat.format(getRequestedStartDate());
            joiner.add("requestedStartDate: " + GraphQLRequestSerializer.getEntry(fecha));
        }

        //
        if (getOrderDate() != null) {
            // joiner.add("serviceDate: \"" + GraphQLRequestSerializer.getEntry(getOrderDate())+"\"");
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
            String fecha = dateFormat.format(getOrderDate());
            joiner.add("orderDate: " + GraphQLRequestSerializer.getEntry(fecha));
        }

        if (getStartDate() != null) {
            // joiner.add("serviceDate: \"" + GraphQLRequestSerializer.getEntry(getOrderDate())+"\"");
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
            String fecha = dateFormat.format(getStartDate());
            joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(fecha));
        }

        if (getState() != null) {
            joiner.add("state: \"" + GraphQLRequestSerializer.getEntry(getState()) + "\"");
            //joiner.add("state: " + GraphQLRequestSerializer.getEntry(ServiceOrderStateType.fromValue(getState().toString())));
        }

        if (getCancellationDate() != null) {
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
            String fecha = dateFormat.format(getCancellationDate());
            joiner.add("cancellationDate: " + GraphQLRequestSerializer.getEntry(fecha));
        }

        if (getCancellationReason() != null) {
            joiner.add("cancellationReason: " + GraphQLRequestSerializer.getEntry(getCancellationReason()));
        }

        if (getRelatedParty() != null) {
            joiner.add("relatedParty: " + GraphQLRequestSerializer.getEntry(getRelatedParty()));
        }

        if (getServiceOrderItem() != null) {
            joiner.add("serviceOrderItem: " + GraphQLRequestSerializer.getEntry(getServiceOrderItem()));
        }

        if (getFlowExecutionRef() != null) {
            joiner.add("flowExecutionRef: " + GraphQLRequestSerializer.getEntry(getFlowExecutionRef()));
        }

        if(getExternalReference() != null){
            joiner.add("externalReference: " + GraphQLRequestSerializer.getEntry(getExternalReference()));
        }

        if(getOrderRelationship() != null){
            joiner.add("orderRelationship: " + GraphQLRequestSerializer.getEntry(getOrderRelationship()));
        }
        if(getCancelRequest() != null){
            joiner.add("cancelRequest: " + GraphQLRequestSerializer.getEntry(getCancelRequest()));
        }

        if(getModifyRequest()!=null){
            joiner.add("modifyRequest: "+ GraphQLRequestSerializer.getEntry(getModifyRequest()));
        }

        return joiner.toString();
    }

    }