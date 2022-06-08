package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> linkPropertyTypes;
    @javax.validation.constraints.NotNull
    private Integer numberOfPortDefinitions;

    public EquipmentPortTypeTO() {
    }

    public EquipmentPortTypeTO(String id, String name, java.util.List<PropertyTypeTO> propertyTypes, java.util.List<PropertyTypeTO> linkPropertyTypes, Integer numberOfPortDefinitions) {
        this.id = id;
        this.name = name;
        this.propertyTypes = propertyTypes;
        this.linkPropertyTypes = linkPropertyTypes;
        this.numberOfPortDefinitions = numberOfPortDefinitions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<PropertyTypeTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public java.util.List<PropertyTypeTO> getLinkPropertyTypes() {
        return linkPropertyTypes;
    }

    public void setLinkPropertyTypes(java.util.List<PropertyTypeTO> linkPropertyTypes) {
        this.linkPropertyTypes = linkPropertyTypes;
    }

    public Integer getNumberOfPortDefinitions() {
        return numberOfPortDefinitions;
    }

    public void setNumberOfPortDefinitions(Integer numberOfPortDefinitions) {
        this.numberOfPortDefinitions = numberOfPortDefinitions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        if (linkPropertyTypes != null) {
            joiner.add("linkPropertyTypes: " + GraphQLRequestSerializer.getEntry(linkPropertyTypes));
        }
        if (numberOfPortDefinitions != null) {
            joiner.add("numberOfPortDefinitions: " + GraphQLRequestSerializer.getEntry(numberOfPortDefinitions));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private java.util.List<PropertyTypeTO> linkPropertyTypes;
        private Integer numberOfPortDefinitions;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }

        public Builder setLinkPropertyTypes(java.util.List<PropertyTypeTO> linkPropertyTypes) {
            this.linkPropertyTypes = linkPropertyTypes;
            return this;
        }

        public Builder setNumberOfPortDefinitions(Integer numberOfPortDefinitions) {
            this.numberOfPortDefinitions = numberOfPortDefinitions;
            return this;
        }


        public EquipmentPortTypeTO build() {
            return new EquipmentPortTypeTO(id, name, propertyTypes, linkPropertyTypes, numberOfPortDefinitions);
        }

    }
}
