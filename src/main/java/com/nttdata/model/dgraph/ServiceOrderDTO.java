package com.nttdata.model.dgraph;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.StringJoiner;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf.ServiceOrder;
import com.nttdata.model.tmf.ServiceOrderStateType;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-25T16:03:54-0500")
public class ServiceOrderDTO extends ServiceOrder implements java.io.Serializable {

  private static final long serialVersionUID = 1L;




  public ServiceOrderDTO() {}

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
      String date = dateFormat.format(getOrderDate());
      joiner.add("orderDate: " + GraphQLRequestSerializer.getEntry(date));
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

    /*
    if (serviceState != null) {
        joiner.add("serviceState: " + GraphQLRequestSerializer.getEntry(serviceState));
    }
    if (serviceType != null) {
        joiner.add("serviceType: " + GraphQLRequestSerializer.getEntry(serviceType));
    }

    if (type != null) {
        joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
    }
    */
    return joiner.toString();
  }

 

}
