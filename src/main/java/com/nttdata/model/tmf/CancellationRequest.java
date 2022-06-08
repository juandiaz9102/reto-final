package com.nttdata.model.tmf;

import java.util.Date;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Request for cancellation an existing Service order
 */
@ApiModel(description = "Request for cancellation an existing Service order")
@JsonTypeName("cancelRequest")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class CancellationRequest extends BaseNode {

    @JsonProperty("id")
    private String id;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("href")
    private String href;

    @JsonProperty("cancellationReason")
    private String cancellationReason;

    @JsonProperty("effectiveCancellationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date effectiveCancellationDate;

    @JsonProperty("requestedCancellationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date requestedCancellationDate;

    @JsonProperty("serviceOrder")
    private ServiceOrder serviceOrder;

    @JsonProperty("state")
    private TaskStateType state;

    @JsonProperty("flowExecutionRef")
    private FlowExecutionRef flowExecutionRef;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("@type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (cancellationReason != null) {
            joiner.add("cancellationReason: " + GraphQLRequestSerializer.getEntry(cancellationReason));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (requestedCancellationDate != null) {
            joiner.add("requestedCancellationDate: " + GraphQLRequestSerializer.getEntry(requestedCancellationDate));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
//        if (serviceorder != null) {
//            joiner.add("serviceorders: " + GraphQLRequestSerializer.getEntry(serviceorder));
//        }
       
        return joiner.toString();
    }

}