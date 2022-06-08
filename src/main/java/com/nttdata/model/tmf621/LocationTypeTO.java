package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String mapType;
    @javax.validation.constraints.NotNull
    private Boolean isSite;
    private Integer index;
    private Integer mapZoomLevel;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    @javax.validation.constraints.NotNull
    private Integer numberOfLocations;
    private java.util.List<SurveyTemplateCategoryTO> surveyTemplateCategories;

    public LocationTypeTO() {
    }

    public LocationTypeTO(String id, String name, String mapType, Boolean isSite, Integer index, Integer mapZoomLevel, java.util.List<PropertyTypeTO> propertyTypes, Integer numberOfLocations, java.util.List<SurveyTemplateCategoryTO> surveyTemplateCategories) {
        this.id = id;
        this.name = name;
        this.mapType = mapType;
        this.isSite = isSite;
        this.index = index;
        this.mapZoomLevel = mapZoomLevel;
        this.propertyTypes = propertyTypes;
        this.numberOfLocations = numberOfLocations;
        this.surveyTemplateCategories = surveyTemplateCategories;
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

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public Boolean getIsSite() {
        return isSite;
    }

    public void setIsSite(Boolean isSite) {
        this.isSite = isSite;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getMapZoomLevel() {
        return mapZoomLevel;
    }

    public void setMapZoomLevel(Integer mapZoomLevel) {
        this.mapZoomLevel = mapZoomLevel;
    }

    public java.util.List<PropertyTypeTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public Integer getNumberOfLocations() {
        return numberOfLocations;
    }

    public void setNumberOfLocations(Integer numberOfLocations) {
        this.numberOfLocations = numberOfLocations;
    }

    public java.util.List<SurveyTemplateCategoryTO> getSurveyTemplateCategories() {
        return surveyTemplateCategories;
    }

    public void setSurveyTemplateCategories(java.util.List<SurveyTemplateCategoryTO> surveyTemplateCategories) {
        this.surveyTemplateCategories = surveyTemplateCategories;
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
        if (mapType != null) {
            joiner.add("mapType: " + GraphQLRequestSerializer.getEntry(mapType));
        }
        if (isSite != null) {
            joiner.add("isSite: " + GraphQLRequestSerializer.getEntry(isSite));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (mapZoomLevel != null) {
            joiner.add("mapZoomLevel: " + GraphQLRequestSerializer.getEntry(mapZoomLevel));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        if (numberOfLocations != null) {
            joiner.add("numberOfLocations: " + GraphQLRequestSerializer.getEntry(numberOfLocations));
        }
        if (surveyTemplateCategories != null) {
            joiner.add("surveyTemplateCategories: " + GraphQLRequestSerializer.getEntry(surveyTemplateCategories));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String mapType;
        private Boolean isSite;
        private Integer index;
        private Integer mapZoomLevel;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private Integer numberOfLocations;
        private java.util.List<SurveyTemplateCategoryTO> surveyTemplateCategories;

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

        public Builder setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }

        public Builder setIsSite(Boolean isSite) {
            this.isSite = isSite;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setMapZoomLevel(Integer mapZoomLevel) {
            this.mapZoomLevel = mapZoomLevel;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }

        public Builder setNumberOfLocations(Integer numberOfLocations) {
            this.numberOfLocations = numberOfLocations;
            return this;
        }

        public Builder setSurveyTemplateCategories(java.util.List<SurveyTemplateCategoryTO> surveyTemplateCategories) {
            this.surveyTemplateCategories = surveyTemplateCategories;
            return this;
        }


        public LocationTypeTO build() {
            return new LocationTypeTO(id, name, mapType, isSite, index, mapZoomLevel, propertyTypes, numberOfLocations, surveyTemplateCategories);
        }

    }
}
