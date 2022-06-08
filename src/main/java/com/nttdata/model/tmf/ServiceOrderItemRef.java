package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.StringJoiner;

/**
 * ServiceOrderItemRef
 */
@JsonTypeName("ServiceOrderItemRef")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderItemRef extends BaseNode {

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("serviceOrderHref")
    private URI serviceOrderHref;

    @JsonProperty("serviceOrderId")
    private String serviceOrderId;
    
    
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (itemId != null) {
            joiner.add("itemId: " + GraphQLRequestSerializer.getEntry(itemId));
        }
        if (serviceOrderHref != null) {
            joiner.add("serviceOrderHref: " + GraphQLRequestSerializer.getEntry(serviceOrderHref));
        }
        if (serviceOrderId != null) {
            joiner.add("serviceOrderId: " + GraphQLRequestSerializer.getEntry(serviceOrderId));
        }

        

        return joiner.toString();
    }



}