package com.nttdata.model.camunda;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartProcessInstanceResponse {

    private String id;
    private String definitionId;
    private String businessKey;
    private String caseInstanceId;
    private String tenantId;
    private boolean ended;
    private boolean suspended;
    private List<Link> links;
    private Map<String, Variables> variables;
    private String type;
    private String message;
}
