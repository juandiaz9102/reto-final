package com.nttdata.model.tmf;

import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Related Entity reference. A related party defines party or party role linked to a specific entity.
 */
@JsonTypeName("Party")
@Data
public class Party extends BaseNode{

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;


    //private java.util.List<ServiceOrder> relatedto;

    /*
    @JsonProperty("serviceOrders")
    @ApiModelProperty(hidden = true)
    private java.util.List<ServiceOrder> serviceOrders;
     */

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
        	//filter: {id: {eq: "2"}}, 
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (baseType != null) {
            joiner.add("baseType: " + GraphQLRequestSerializer.getEntry(baseType));
        }
        if (schemaLocation != null) {
            joiner.add("schemaLocation: " + GraphQLRequestSerializer.getEntry(schemaLocation));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (referredType != null) {
            joiner.add("referredType: " + GraphQLRequestSerializer.getEntry(referredType));
        }
        /*
        if (relatedto != null) {
            joiner.add("relatedto: " + GraphQLRequestSerializer.getEntry(relatedto));

        if (serviceOrders != null) {
            joiner.add("serviceOrders: " + GraphQLRequestSerializer.getEntry(serviceOrders));
        }
*/
        return joiner.toString();
    }
}
