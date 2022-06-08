package com.nttdata.model.tmf;

import java.util.List;
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
 * Describes a given characteristic of an object or entity through a name/value pair.
 */
@ApiModel(description = "Describes a given characteristic of an object or entity through a name/value pair.")
@JsonTypeName("characteristic")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Characteristic extends BaseNode {

    @JsonProperty("characteristicId")
    private String characteristicId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;
    
    @JsonProperty("description")
    private String description;

    @JsonProperty("valueType")
    private String valueType;

    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    
    @JsonProperty("isConfigurable")
    private String isConfigurable;

    @JsonProperty("value")
    private String value;

    @JsonProperty("valueUnits")
    private String valueUnits;
    
    private SpecCharacteristic specCharacteristic;

    @JsonProperty("characteristicRelationship")
    private List<CharacteristicRelationship> characteristicRelationship;
    
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if(characteristicId != null){
            joiner.add("characteristicId: " + GraphQLRequestSerializer.getEntry(characteristicId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (unitOfMeasure != null) {
            joiner.add("unitOfMeasure: " + GraphQLRequestSerializer.getEntry(unitOfMeasure));
        }        
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        if (valueUnits != null) {
            joiner.add("valueUnits: " + GraphQLRequestSerializer.getEntry(valueUnits));
        }

        if (characteristicRelationship != null) {
            joiner.add("characteristicRelationship: " + GraphQLRequestSerializer.getEntry(characteristicRelationship));
        }
        return joiner.toString();
    }
}