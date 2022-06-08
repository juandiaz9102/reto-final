package com.nttdata.model.tmf;

import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Configuration feature.
 */
@ApiModel(description = "Flow Execution Reference.")
@JsonTypeName("FlowExecutionRef")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class FlowExecutionRef extends BaseNode {

    @JsonProperty("id")
    private String id;

    @JsonProperty("domainId")
    private String domainId;

    @JsonProperty("workflowId")
    private String workflowId;

    @JsonProperty("runId")
    private String runId;

    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("baseFlow")
    private String baseFlow;

    @JsonProperty("flowExecutionRef")
    private FlowExecutionRef flowExecutionRef;

    @JsonProperty("creationDate")
    private String creationDate;

    @JsonProperty("executionDate")
    private String executionDate;

    @JsonProperty("endExecutionDate")
    private String endExecutionDate;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (domainId != null) {
            joiner.add("domainId: " + GraphQLRequestSerializer.getEntry(domainId));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (runId != null) {
            joiner.add("runId: " + GraphQLRequestSerializer.getEntry(runId));
        }
        if (workflowId != null) {
            joiner.add("workflowId: " + GraphQLRequestSerializer.getEntry(workflowId));
        }
        if (creationDate != null) {
            joiner.add("creationDate: " + GraphQLRequestSerializer.getEntry(creationDate));
        }
        if (executionDate != null) {
            joiner.add("executionDate: " + GraphQLRequestSerializer.getEntry(executionDate));
        }
        if (endExecutionDate != null) {
            joiner.add("endExecutionDate: " + GraphQLRequestSerializer.getEntry(endExecutionDate));
        }
//        if (cancelto != null) {
//            joiner.add("cancelto: " + GraphQLRequestSerializer.getEntry(cancelto));
//        }
//        if (serviceorders != null) {
//            joiner.add("serviceorders: " + GraphQLRequestSerializer.getEntry(serviceorders));
//        }
//        if (_id != null) {
//            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
//        }
        return joiner.toString();
    }

}