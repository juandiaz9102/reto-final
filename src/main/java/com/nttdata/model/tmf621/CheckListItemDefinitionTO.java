package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListItemDefinitionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private CheckListItemTypeTO type;
    private Integer index;
    private Boolean isMandatory;
    private String enumValues;
    private CheckListItemEnumSelectionModeTO enumSelectionMode;
    private String helpText;

    public CheckListItemDefinitionTO() {
    }

    public CheckListItemDefinitionTO(String id, String title, CheckListItemTypeTO type, Integer index, Boolean isMandatory, String enumValues, CheckListItemEnumSelectionModeTO enumSelectionMode, String helpText) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.index = index;
        this.isMandatory = isMandatory;
        this.enumValues = enumValues;
        this.enumSelectionMode = enumSelectionMode;
        this.helpText = helpText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CheckListItemTypeTO getType() {
        return type;
    }

    public void setType(CheckListItemTypeTO type) {
        this.type = type;
        //this.type = CheckListItemTypeTO.valueOf(type.toUpperCase()).name();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public String getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(String enumValues) {
        this.enumValues = enumValues;
    }

    public CheckListItemEnumSelectionModeTO getEnumSelectionMode() {
        return enumSelectionMode;
    }

    public void setEnumSelectionMode(CheckListItemEnumSelectionModeTO enumSelectionMode) {
        this.enumSelectionMode = enumSelectionMode;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (isMandatory != null) {
            joiner.add("isMandatory: " + GraphQLRequestSerializer.getEntry(isMandatory));
        }
        if (enumValues != null) {
            joiner.add("enumValues: " + GraphQLRequestSerializer.getEntry(enumValues));
        }
        if (enumSelectionMode != null) {
            joiner.add("enumSelectionMode: " + GraphQLRequestSerializer.getEntry(enumSelectionMode));
        }
        if (helpText != null) {
            joiner.add("helpText: " + GraphQLRequestSerializer.getEntry(helpText));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String title;
        private CheckListItemTypeTO type;
        private Integer index;
        private Boolean isMandatory;
        private String enumValues;
        private CheckListItemEnumSelectionModeTO enumSelectionMode;
        private String helpText;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setType(CheckListItemTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setIsMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setEnumValues(String enumValues) {
            this.enumValues = enumValues;
            return this;
        }

        public Builder setEnumSelectionMode(CheckListItemEnumSelectionModeTO enumSelectionMode) {
            this.enumSelectionMode = enumSelectionMode;
            return this;
        }

        public Builder setHelpText(String helpText) {
            this.helpText = helpText;
            return this;
        }


        public CheckListItemDefinitionTO build() {
            return new CheckListItemDefinitionTO(id, title, type, index, isMandatory, enumValues, enumSelectionMode, helpText);
        }

    }

}
