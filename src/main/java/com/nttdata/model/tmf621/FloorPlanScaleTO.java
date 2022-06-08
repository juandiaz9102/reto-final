package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanScaleTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Integer referencePoint1X;
    @javax.validation.constraints.NotNull
    private Integer referencePoint1Y;
    @javax.validation.constraints.NotNull
    private Integer referencePoint2X;
    @javax.validation.constraints.NotNull
    private Integer referencePoint2Y;
    @javax.validation.constraints.NotNull
    private Double scaleInMeters;

    public FloorPlanScaleTO() {
    }

    public FloorPlanScaleTO(Integer referencePoint1X, Integer referencePoint1Y, Integer referencePoint2X, Integer referencePoint2Y, Double scaleInMeters) {
        this.referencePoint1X = referencePoint1X;
        this.referencePoint1Y = referencePoint1Y;
        this.referencePoint2X = referencePoint2X;
        this.referencePoint2Y = referencePoint2Y;
        this.scaleInMeters = scaleInMeters;
    }

    public Integer getReferencePoint1X() {
        return referencePoint1X;
    }

    public void setReferencePoint1X(Integer referencePoint1X) {
        this.referencePoint1X = referencePoint1X;
    }

    public Integer getReferencePoint1Y() {
        return referencePoint1Y;
    }

    public void setReferencePoint1Y(Integer referencePoint1Y) {
        this.referencePoint1Y = referencePoint1Y;
    }

    public Integer getReferencePoint2X() {
        return referencePoint2X;
    }

    public void setReferencePoint2X(Integer referencePoint2X) {
        this.referencePoint2X = referencePoint2X;
    }

    public Integer getReferencePoint2Y() {
        return referencePoint2Y;
    }

    public void setReferencePoint2Y(Integer referencePoint2Y) {
        this.referencePoint2Y = referencePoint2Y;
    }

    public Double getScaleInMeters() {
        return scaleInMeters;
    }

    public void setScaleInMeters(Double scaleInMeters) {
        this.scaleInMeters = scaleInMeters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (referencePoint1X != null) {
            joiner.add("referencePoint1X: " + GraphQLRequestSerializer.getEntry(referencePoint1X));
        }
        if (referencePoint1Y != null) {
            joiner.add("referencePoint1Y: " + GraphQLRequestSerializer.getEntry(referencePoint1Y));
        }
        if (referencePoint2X != null) {
            joiner.add("referencePoint2X: " + GraphQLRequestSerializer.getEntry(referencePoint2X));
        }
        if (referencePoint2Y != null) {
            joiner.add("referencePoint2Y: " + GraphQLRequestSerializer.getEntry(referencePoint2Y));
        }
        if (scaleInMeters != null) {
            joiner.add("scaleInMeters: " + GraphQLRequestSerializer.getEntry(scaleInMeters));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer referencePoint1X;
        private Integer referencePoint1Y;
        private Integer referencePoint2X;
        private Integer referencePoint2Y;
        private Double scaleInMeters;

        public Builder() {
        }

        public Builder setReferencePoint1X(Integer referencePoint1X) {
            this.referencePoint1X = referencePoint1X;
            return this;
        }

        public Builder setReferencePoint1Y(Integer referencePoint1Y) {
            this.referencePoint1Y = referencePoint1Y;
            return this;
        }

        public Builder setReferencePoint2X(Integer referencePoint2X) {
            this.referencePoint2X = referencePoint2X;
            return this;
        }

        public Builder setReferencePoint2Y(Integer referencePoint2Y) {
            this.referencePoint2Y = referencePoint2Y;
            return this;
        }

        public Builder setScaleInMeters(Double scaleInMeters) {
            this.scaleInMeters = scaleInMeters;
            return this;
        }


        public FloorPlanScaleTO build() {
            return new FloorPlanScaleTO(referencePoint1X, referencePoint1Y, referencePoint2X, referencePoint2Y, scaleInMeters);
        }

    }
}
