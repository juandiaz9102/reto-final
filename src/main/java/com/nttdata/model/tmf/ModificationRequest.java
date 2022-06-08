package com.nttdata.model.tmf;


import java.util.Date;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonTypeName("modifyRequest")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ModificationRequest extends BaseNode {

    @JsonProperty("id")
    private String id;

    @JsonProperty("modifyReason")
    private String modifyReason;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("completionDate")
    private Date completionDate;

    @JsonProperty("requestedCompletionDate")
    private Date requestedCompletionDate;

    @JsonProperty("serviceOrder")
    private ServiceOrder serviceOrder;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("@type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (modifyReason != null) {
            joiner.add("modifyReason: " + GraphQLRequestSerializer.getEntry(modifyReason));
        }
        if (requestedCompletionDate != null) {
            joiner.add("requestedCompletionDate: " + GraphQLRequestSerializer.getEntry(requestedCompletionDate));
        }
//        if (serviceorders != null) {
//            joiner.add("serviceorders: " + GraphQLRequestSerializer.getEntry(serviceorders));
//        }
//        if (_id != null) {
//            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
//        }
        return joiner.toString();
    }
}