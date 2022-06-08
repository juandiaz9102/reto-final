package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private String externalId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private LocationTypeTO locationType;
    private LocationTO parentLocation;
    @javax.validation.constraints.NotNull
    private java.util.List<LocationTO> children;
    @javax.validation.constraints.NotNull
    private Integer numChildren;
    @javax.validation.constraints.NotNull
    private Double latitude;
    @javax.validation.constraints.NotNull
    private Double longitude;
    private CoordinatesTO parentCoords;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipments;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> images;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> files;
    @javax.validation.constraints.NotNull
    private Boolean siteSurveyNeeded;
    @javax.validation.constraints.NotNull
    private java.util.List<LocationTO> locationHierarchy;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyTO> surveys;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyWiFiScanTO> wifiData;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyCellScanTO> cellData;
    @javax.validation.constraints.NotNull
    private java.util.List<FloorPlanTO> floorPlans;
    @javax.validation.constraints.NotNull
    private java.util.List<HyperlinkTO> hyperlinks;

    public LocationTO() {
    }

    public LocationTO(String id, String externalId, String name, LocationTypeTO locationType, LocationTO parentLocation, java.util.List<LocationTO> children, Integer numChildren, Double latitude, Double longitude, CoordinatesTO parentCoords, java.util.List<EquipmentTO> equipments, java.util.List<PropertyTO> properties, java.util.List<FileTO> images, java.util.List<FileTO> files, Boolean siteSurveyNeeded, java.util.List<LocationTO> locationHierarchy, java.util.List<SurveyTO> surveys, java.util.List<SurveyWiFiScanTO> wifiData, java.util.List<SurveyCellScanTO> cellData, java.util.List<FloorPlanTO> floorPlans, java.util.List<HyperlinkTO> hyperlinks) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.locationType = locationType;
        this.parentLocation = parentLocation;
        this.children = children;
        this.numChildren = numChildren;
        this.latitude = latitude;
        this.longitude = longitude;
        this.parentCoords = parentCoords;
        this.equipments = equipments;
        this.properties = properties;
        this.images = images;
        this.files = files;
        this.siteSurveyNeeded = siteSurveyNeeded;
        this.locationHierarchy = locationHierarchy;
        this.surveys = surveys;
        this.wifiData = wifiData;
        this.cellData = cellData;
        this.floorPlans = floorPlans;
        this.hyperlinks = hyperlinks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationTypeTO getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationTypeTO locationType) {
        this.locationType = locationType;
    }

    public LocationTO getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(LocationTO parentLocation) {
        this.parentLocation = parentLocation;
    }

    public java.util.List<LocationTO> getChildren() {
        return children;
    }

    public void setChildren(java.util.List<LocationTO> children) {
        this.children = children;
    }

    public Integer getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public CoordinatesTO getParentCoords() {
        return parentCoords;
    }

    public void setParentCoords(CoordinatesTO parentCoords) {
        this.parentCoords = parentCoords;
    }

    public java.util.List<EquipmentTO> getEquipments() {
        return equipments;
    }

    public void setEquipments(java.util.List<EquipmentTO> equipments) {
        this.equipments = equipments;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public java.util.List<FileTO> getImages() {
        return images;
    }

    public void setImages(java.util.List<FileTO> images) {
        this.images = images;
    }

    public java.util.List<FileTO> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<FileTO> files) {
        this.files = files;
    }

    public Boolean getSiteSurveyNeeded() {
        return siteSurveyNeeded;
    }

    public void setSiteSurveyNeeded(Boolean siteSurveyNeeded) {
        this.siteSurveyNeeded = siteSurveyNeeded;
    }

    public java.util.List<LocationTO> getLocationHierarchy() {
        return locationHierarchy;
    }

    public void setLocationHierarchy(java.util.List<LocationTO> locationHierarchy) {
        this.locationHierarchy = locationHierarchy;
    }

    public java.util.List<SurveyTO> getSurveys() {
        return surveys;
    }

    public void setSurveys(java.util.List<SurveyTO> surveys) {
        this.surveys = surveys;
    }

    public java.util.List<SurveyWiFiScanTO> getWifiData() {
        return wifiData;
    }

    public void setWifiData(java.util.List<SurveyWiFiScanTO> wifiData) {
        this.wifiData = wifiData;
    }

    public java.util.List<SurveyCellScanTO> getCellData() {
        return cellData;
    }

    public void setCellData(java.util.List<SurveyCellScanTO> cellData) {
        this.cellData = cellData;
    }

    public java.util.List<FloorPlanTO> getFloorPlans() {
        return floorPlans;
    }

    public void setFloorPlans(java.util.List<FloorPlanTO> floorPlans) {
        this.floorPlans = floorPlans;
    }

    public java.util.List<HyperlinkTO> getHyperlinks() {
        return hyperlinks;
    }

    public void setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
        this.hyperlinks = hyperlinks;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (locationType != null) {
            joiner.add("locationType: " + GraphQLRequestSerializer.getEntry(locationType));
        }
        if (parentLocation != null) {
            joiner.add("parentLocation: " + GraphQLRequestSerializer.getEntry(parentLocation));
        }
        if (children != null) {
            joiner.add("children: " + GraphQLRequestSerializer.getEntry(children));
        }
        if (numChildren != null) {
            joiner.add("numChildren: " + GraphQLRequestSerializer.getEntry(numChildren));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (parentCoords != null) {
            joiner.add("parentCoords: " + GraphQLRequestSerializer.getEntry(parentCoords));
        }
        if (equipments != null) {
            joiner.add("equipments: " + GraphQLRequestSerializer.getEntry(equipments));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (images != null) {
            joiner.add("images: " + GraphQLRequestSerializer.getEntry(images));
        }
        if (files != null) {
            joiner.add("files: " + GraphQLRequestSerializer.getEntry(files));
        }
        if (siteSurveyNeeded != null) {
            joiner.add("siteSurveyNeeded: " + GraphQLRequestSerializer.getEntry(siteSurveyNeeded));
        }
        if (locationHierarchy != null) {
            joiner.add("locationHierarchy: " + GraphQLRequestSerializer.getEntry(locationHierarchy));
        }
        if (surveys != null) {
            joiner.add("surveys: " + GraphQLRequestSerializer.getEntry(surveys));
        }
        if (wifiData != null) {
            joiner.add("wifiData: " + GraphQLRequestSerializer.getEntry(wifiData));
        }
        if (cellData != null) {
            joiner.add("cellData: " + GraphQLRequestSerializer.getEntry(cellData));
        }
        if (floorPlans != null) {
            joiner.add("floorPlans: " + GraphQLRequestSerializer.getEntry(floorPlans));
        }
        if (hyperlinks != null) {
            joiner.add("hyperlinks: " + GraphQLRequestSerializer.getEntry(hyperlinks));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String externalId;
        private String name;
        private LocationTypeTO locationType;
        private LocationTO parentLocation;
        private java.util.List<LocationTO> children;
        private Integer numChildren;
        private Double latitude;
        private Double longitude;
        private CoordinatesTO parentCoords;
        private java.util.List<EquipmentTO> equipments;
        private java.util.List<PropertyTO> properties;
        private java.util.List<FileTO> images;
        private java.util.List<FileTO> files;
        private Boolean siteSurveyNeeded;
        private java.util.List<LocationTO> locationHierarchy;
        private java.util.List<SurveyTO> surveys;
        private java.util.List<SurveyWiFiScanTO> wifiData;
        private java.util.List<SurveyCellScanTO> cellData;
        private java.util.List<FloorPlanTO> floorPlans;
        private java.util.List<HyperlinkTO> hyperlinks;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocationType(LocationTypeTO locationType) {
            this.locationType = locationType;
            return this;
        }

        public Builder setParentLocation(LocationTO parentLocation) {
            this.parentLocation = parentLocation;
            return this;
        }

        public Builder setChildren(java.util.List<LocationTO> children) {
            this.children = children;
            return this;
        }

        public Builder setNumChildren(Integer numChildren) {
            this.numChildren = numChildren;
            return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setParentCoords(CoordinatesTO parentCoords) {
            this.parentCoords = parentCoords;
            return this;
        }

        public Builder setEquipments(java.util.List<EquipmentTO> equipments) {
            this.equipments = equipments;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setImages(java.util.List<FileTO> images) {
            this.images = images;
            return this;
        }

        public Builder setFiles(java.util.List<FileTO> files) {
            this.files = files;
            return this;
        }

        public Builder setSiteSurveyNeeded(Boolean siteSurveyNeeded) {
            this.siteSurveyNeeded = siteSurveyNeeded;
            return this;
        }

        public Builder setLocationHierarchy(java.util.List<LocationTO> locationHierarchy) {
            this.locationHierarchy = locationHierarchy;
            return this;
        }

        public Builder setSurveys(java.util.List<SurveyTO> surveys) {
            this.surveys = surveys;
            return this;
        }

        public Builder setWifiData(java.util.List<SurveyWiFiScanTO> wifiData) {
            this.wifiData = wifiData;
            return this;
        }

        public Builder setCellData(java.util.List<SurveyCellScanTO> cellData) {
            this.cellData = cellData;
            return this;
        }

        public Builder setFloorPlans(java.util.List<FloorPlanTO> floorPlans) {
            this.floorPlans = floorPlans;
            return this;
        }

        public Builder setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
            this.hyperlinks = hyperlinks;
            return this;
        }


        public LocationTO build() {
            return new LocationTO(id, externalId, name, locationType, parentLocation, children, numChildren, latitude, longitude, parentCoords, equipments, properties, images, files, siteSurveyNeeded, locationHierarchy, surveys, wifiData, cellData, floorPlans, hyperlinks);
        }

    }

}
