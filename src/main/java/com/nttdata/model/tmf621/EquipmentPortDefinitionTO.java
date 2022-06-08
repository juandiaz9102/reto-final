package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortDefinitionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private Integer index;
    private String visibleLabel;
    private EquipmentPortTypeTO portType;
    private String bandwidth;

    public EquipmentPortDefinitionTO() {
    }

    public EquipmentPortDefinitionTO(String id, String name, Integer index, String visibleLabel, EquipmentPortTypeTO portType, String bandwidth) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.visibleLabel = visibleLabel;
        this.portType = portType;
        this.bandwidth = bandwidth;
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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getVisibleLabel() {
        return visibleLabel;
    }

    public void setVisibleLabel(String visibleLabel) {
        this.visibleLabel = visibleLabel;
    }

    public EquipmentPortTypeTO getPortType() {
        return portType;
    }

    public void setPortType(EquipmentPortTypeTO portType) {
        this.portType = portType;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
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
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (visibleLabel != null) {
            joiner.add("visibleLabel: " + GraphQLRequestSerializer.getEntry(visibleLabel));
        }
        if (portType != null) {
            joiner.add("portType: " + GraphQLRequestSerializer.getEntry(portType));
        }
        if (bandwidth != null) {
            joiner.add("bandwidth: " + GraphQLRequestSerializer.getEntry(bandwidth));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private Integer index;
        private String visibleLabel;
        private EquipmentPortTypeTO portType;
        private String bandwidth;

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

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setVisibleLabel(String visibleLabel) {
            this.visibleLabel = visibleLabel;
            return this;
        }

        public Builder setPortType(EquipmentPortTypeTO portType) {
            this.portType = portType;
            return this;
        }

        public Builder setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }


        public EquipmentPortDefinitionTO build() {
            return new EquipmentPortDefinitionTO(id, name, index, visibleLabel, portType, bandwidth);
        }

    }
}
