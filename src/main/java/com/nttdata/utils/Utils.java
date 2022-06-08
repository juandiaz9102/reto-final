package com.nttdata.utils;

import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.kobylynskyi.graphql.codegen.model.graphql.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.exceptions.BusinessException;
import com.nttdata.model.symphony.ParamDefinition;


public class Utils {
	
	
	private static ObjectMapper objectMapper = new ObjectMapper();
    public static final ObjectMapper OBJECT_MAPPER_GRAPHQL = com.kobylynskyi.graphql.codegen.utils.Utils.OBJECT_MAPPER;


    /**
     * Catalog driver validate parameters
     * @param paramValid
     * @param paramDefinitions
     * @return
     */
    public static boolean validatedParameters(List<String> paramValid, List<ParamDefinition> paramDefinitions) {
        boolean correct  = true;
//        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject json1 = null;
        String json2 = "";
        JSONParser parser = new JSONParser();
        try {
            HashMap<String, ParamDefinition> map = paramDefinitions.stream().collect(Collectors
                    .toMap(ParamDefinition::getKey, paramDefinition -> paramDefinition, (v, k) -> k, HashMap::new));
            json2 = objectMapper.writeValueAsString(map);
            json1 = (JSONObject) parser.parse(json2);
            for (String paramToValid: paramValid) {
                if (json1.get(paramToValid) == null){
                    correct = false;
                    break;
                }
            }
        }catch (JsonProcessingException | ParseException e) {
            e.printStackTrace();

        }
        return correct;
    }
    
    /**
     * This method throw an exception when the response of DMN is not successful
     * @param response
     * @throws BusinessException
     * @throws JsonMappingException
     * @throws JsonProcessingException
     */
    public static  void validateDMNResponse(String response) throws BusinessException, JsonMappingException, JsonProcessingException{

        JsonNode node = objectMapper.readTree(response);
    	
    	if(!node.get("messages").isEmpty()) {
    		throw new BusinessException(node.get("messages").toPrettyString());
    	}else if(!node.get("decisionResults").isEmpty() && !node.get("decisionResults").get(0).get("evaluationStatus").toString().contains("SUCCEEDED")) {

    		throw new BusinessException("Request to DMN Errors");
    	}
    }

    public static String buildQuery(GraphQLRequest graphQLRequest) {
        StringBuilder builder = new StringBuilder();
        GraphQLOperationRequest request = graphQLRequest.getRequest();
        //if (request.getAlias() != null) {
        //  builder.append(request.getAlias()).append(": ");
        //}
        builder.append(request.getOperationName());
        Map<String, Object> input = request.getInput();
        Set<String> useObjectMapperForInputSerialization = request.getUseObjectMapperForInputSerialization();
        if (requestHasInput(input)) {
            builder.append("(");
            Iterator<Map.Entry<String, Object>> inputEntryIterator = input.entrySet().iterator();
            boolean valueAdded = false;
            while (inputEntryIterator.hasNext()) {
                Map.Entry<String, Object> inputEntry = inputEntryIterator.next();
                if (inputEntry.getValue() != null) {
                    if (valueAdded) {
                        builder.append(", ");
                    }
                    builder.append(inputEntry.getKey());
                    builder.append(": ");
                    boolean useObjectMapper = useObjectMapperForInputSerialization.contains(inputEntry.getKey());
                    builder.append(GraphQLRequestSerializer.getEntry(inputEntry.getValue(), useObjectMapper));
                    valueAdded = true;
                }
            }
            builder.append(")");
        }
        if (graphQLRequest.getResponseProjection() != null) {
            builder.append(graphQLRequest.getResponseProjection().toString());
        }
        return builder.toString();
    }

    private static boolean requestHasInput(Map<String, Object> input) {
        return input != null && !input.isEmpty() &&
                input.values().stream().anyMatch(Objects::nonNull);
    }

    public static String operationWrapper(GraphQLOperation operationType, String operationName, String queryValue) {
        assert operationType != null;
        String operationTypeLowerCased = operationType.name().toLowerCase();
        if (operationName == null) {
            return String.format("%s { %s }", operationTypeLowerCased, queryValue);
        } else {
            String s = String.format("%s %s { %s }", operationTypeLowerCased, operationName, queryValue);
            return String.format("%s %s { %s }", operationTypeLowerCased, operationName, queryValue);
        }
    }

    public static String jsonQuery(String queryString) {
        ObjectNode objectNode = com.kobylynskyi.graphql.codegen.utils.Utils.OBJECT_MAPPER.createObjectNode();
        objectNode.put("query", queryString);
        return objectMapperWriteValueAsString(objectNode);
    }

    public static String objectMapperWriteValueAsString(Object input) {
        try {
            return OBJECT_MAPPER_GRAPHQL.writeValueAsString(input);
        } catch (JsonProcessingException e) {
            throw new UnableToBuildJsonQueryException(e);
        }
    }
    
    
}
