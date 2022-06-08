package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanReferencePointTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Integer x;
    @javax.validation.constraints.NotNull
    private Integer y;
    @javax.validation.constraints.NotNull
    private Double latitude;
    @javax.validation.constraints.NotNull
    private Double longitude;

    public FloorPlanReferencePointTO() {
    }

    public FloorPlanReferencePointTO(Integer x, Integer y, Double latitude, Double longitude) {
        this.x = x;
        this.y = y;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (x != null) {
            joiner.add("x: " + GraphQLRequestSerializer.getEntry(x));
        }
        if (y != null) {
            joiner.add("y: " + GraphQLRequestSerializer.getEntry(y));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer x;
        private Integer y;
        private Double latitude;
        private Double longitude;

        public Builder() {
        }

        public Builder setX(Integer x) {
            this.x = x;
            return this;
        }

        public Builder setY(Integer y) {
            this.y = y;
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


        public FloorPlanReferencePointTO build() {
            return new FloorPlanReferencePointTO(x, y, latitude, longitude);
        }

    }
}
