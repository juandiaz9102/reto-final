package com.nttdata.model.camunda;

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
public class StartProcessInstanceRequest {

    private Map<String, Variables> variables;
    private String businessKey;
    private String caseInstanceId;
//    private List<StartInstructions> startInstructions;
    private boolean skipCustomListeners;
    private boolean skipIoMappings;
    private boolean withVariablesInReturn;

}
