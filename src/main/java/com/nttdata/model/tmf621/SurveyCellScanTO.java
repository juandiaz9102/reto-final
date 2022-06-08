package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyCellScanTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private CellularNetworkTypeTO networkType;
    @javax.validation.constraints.NotNull
    private Integer signalStrength;
    private Integer timestamp;
    private String baseStationID;
    private String networkID;
    private String systemID;
    private String cellID;
    private String locationAreaCode;
    private String mobileCountryCode;
    private String mobileNetworkCode;
    private String primaryScramblingCode;
    private String operator;
    private Integer arfcn;
    private String physicalCellID;
    private String trackingAreaCode;
    private Integer timingAdvance;
    private Integer earfcn;
    private Integer uarfcn;
    private Double latitude;
    private Double longitude;

    public SurveyCellScanTO() {
    }

    public SurveyCellScanTO(String id, CellularNetworkTypeTO networkType, Integer signalStrength, Integer timestamp, String baseStationID, String networkID, String systemID, String cellID, String locationAreaCode, String mobileCountryCode, String mobileNetworkCode, String primaryScramblingCode, String operator, Integer arfcn, String physicalCellID, String trackingAreaCode, Integer timingAdvance, Integer earfcn, Integer uarfcn, Double latitude, Double longitude) {
        this.id = id;
        this.networkType = networkType;
        this.signalStrength = signalStrength;
        this.timestamp = timestamp;
        this.baseStationID = baseStationID;
        this.networkID = networkID;
        this.systemID = systemID;
        this.cellID = cellID;
        this.locationAreaCode = locationAreaCode;
        this.mobileCountryCode = mobileCountryCode;
        this.mobileNetworkCode = mobileNetworkCode;
        this.primaryScramblingCode = primaryScramblingCode;
        this.operator = operator;
        this.arfcn = arfcn;
        this.physicalCellID = physicalCellID;
        this.trackingAreaCode = trackingAreaCode;
        this.timingAdvance = timingAdvance;
        this.earfcn = earfcn;
        this.uarfcn = uarfcn;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CellularNetworkTypeTO getNetworkType() {
        return networkType;
    }

    public void setNetworkType(CellularNetworkTypeTO networkType) {
        this.networkType = networkType;
    }

    public Integer getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(Integer signalStrength) {
        this.signalStrength = signalStrength;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBaseStationID() {
        return baseStationID;
    }

    public void setBaseStationID(String baseStationID) {
        this.baseStationID = baseStationID;
    }

    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public String getCellID() {
        return cellID;
    }

    public void setCellID(String cellID) {
        this.cellID = cellID;
    }

    public String getLocationAreaCode() {
        return locationAreaCode;
    }

    public void setLocationAreaCode(String locationAreaCode) {
        this.locationAreaCode = locationAreaCode;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getMobileNetworkCode() {
        return mobileNetworkCode;
    }

    public void setMobileNetworkCode(String mobileNetworkCode) {
        this.mobileNetworkCode = mobileNetworkCode;
    }

    public String getPrimaryScramblingCode() {
        return primaryScramblingCode;
    }

    public void setPrimaryScramblingCode(String primaryScramblingCode) {
        this.primaryScramblingCode = primaryScramblingCode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getArfcn() {
        return arfcn;
    }

    public void setArfcn(Integer arfcn) {
        this.arfcn = arfcn;
    }

    public String getPhysicalCellID() {
        return physicalCellID;
    }

    public void setPhysicalCellID(String physicalCellID) {
        this.physicalCellID = physicalCellID;
    }

    public String getTrackingAreaCode() {
        return trackingAreaCode;
    }

    public void setTrackingAreaCode(String trackingAreaCode) {
        this.trackingAreaCode = trackingAreaCode;
    }

    public Integer getTimingAdvance() {
        return timingAdvance;
    }

    public void setTimingAdvance(Integer timingAdvance) {
        this.timingAdvance = timingAdvance;
    }

    public Integer getEarfcn() {
        return earfcn;
    }

    public void setEarfcn(Integer earfcn) {
        this.earfcn = earfcn;
    }

    public Integer getUarfcn() {
        return uarfcn;
    }

    public void setUarfcn(Integer uarfcn) {
        this.uarfcn = uarfcn;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (networkType != null) {
            joiner.add("networkType: " + GraphQLRequestSerializer.getEntry(networkType));
        }
        if (signalStrength != null) {
            joiner.add("signalStrength: " + GraphQLRequestSerializer.getEntry(signalStrength));
        }
        if (timestamp != null) {
            joiner.add("timestamp: " + GraphQLRequestSerializer.getEntry(timestamp));
        }
        if (baseStationID != null) {
            joiner.add("baseStationID: " + GraphQLRequestSerializer.getEntry(baseStationID));
        }
        if (networkID != null) {
            joiner.add("networkID: " + GraphQLRequestSerializer.getEntry(networkID));
        }
        if (systemID != null) {
            joiner.add("systemID: " + GraphQLRequestSerializer.getEntry(systemID));
        }
        if (cellID != null) {
            joiner.add("cellID: " + GraphQLRequestSerializer.getEntry(cellID));
        }
        if (locationAreaCode != null) {
            joiner.add("locationAreaCode: " + GraphQLRequestSerializer.getEntry(locationAreaCode));
        }
        if (mobileCountryCode != null) {
            joiner.add("mobileCountryCode: " + GraphQLRequestSerializer.getEntry(mobileCountryCode));
        }
        if (mobileNetworkCode != null) {
            joiner.add("mobileNetworkCode: " + GraphQLRequestSerializer.getEntry(mobileNetworkCode));
        }
        if (primaryScramblingCode != null) {
            joiner.add("primaryScramblingCode: " + GraphQLRequestSerializer.getEntry(primaryScramblingCode));
        }
        if (operator != null) {
            joiner.add("operator: " + GraphQLRequestSerializer.getEntry(operator));
        }
        if (arfcn != null) {
            joiner.add("arfcn: " + GraphQLRequestSerializer.getEntry(arfcn));
        }
        if (physicalCellID != null) {
            joiner.add("physicalCellID: " + GraphQLRequestSerializer.getEntry(physicalCellID));
        }
        if (trackingAreaCode != null) {
            joiner.add("trackingAreaCode: " + GraphQLRequestSerializer.getEntry(trackingAreaCode));
        }
        if (timingAdvance != null) {
            joiner.add("timingAdvance: " + GraphQLRequestSerializer.getEntry(timingAdvance));
        }
        if (earfcn != null) {
            joiner.add("earfcn: " + GraphQLRequestSerializer.getEntry(earfcn));
        }
        if (uarfcn != null) {
            joiner.add("uarfcn: " + GraphQLRequestSerializer.getEntry(uarfcn));
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

        private String id;
        private CellularNetworkTypeTO networkType;
        private Integer signalStrength;
        private Integer timestamp;
        private String baseStationID;
        private String networkID;
        private String systemID;
        private String cellID;
        private String locationAreaCode;
        private String mobileCountryCode;
        private String mobileNetworkCode;
        private String primaryScramblingCode;
        private String operator;
        private Integer arfcn;
        private String physicalCellID;
        private String trackingAreaCode;
        private Integer timingAdvance;
        private Integer earfcn;
        private Integer uarfcn;
        private Double latitude;
        private Double longitude;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setNetworkType(CellularNetworkTypeTO networkType) {
            this.networkType = networkType;
            return this;
        }

        public Builder setSignalStrength(Integer signalStrength) {
            this.signalStrength = signalStrength;
            return this;
        }

        public Builder setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setBaseStationID(String baseStationID) {
            this.baseStationID = baseStationID;
            return this;
        }

        public Builder setNetworkID(String networkID) {
            this.networkID = networkID;
            return this;
        }

        public Builder setSystemID(String systemID) {
            this.systemID = systemID;
            return this;
        }

        public Builder setCellID(String cellID) {
            this.cellID = cellID;
            return this;
        }

        public Builder setLocationAreaCode(String locationAreaCode) {
            this.locationAreaCode = locationAreaCode;
            return this;
        }

        public Builder setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }

        public Builder setMobileNetworkCode(String mobileNetworkCode) {
            this.mobileNetworkCode = mobileNetworkCode;
            return this;
        }

        public Builder setPrimaryScramblingCode(String primaryScramblingCode) {
            this.primaryScramblingCode = primaryScramblingCode;
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setArfcn(Integer arfcn) {
            this.arfcn = arfcn;
            return this;
        }

        public Builder setPhysicalCellID(String physicalCellID) {
            this.physicalCellID = physicalCellID;
            return this;
        }

        public Builder setTrackingAreaCode(String trackingAreaCode) {
            this.trackingAreaCode = trackingAreaCode;
            return this;
        }

        public Builder setTimingAdvance(Integer timingAdvance) {
            this.timingAdvance = timingAdvance;
            return this;
        }

        public Builder setEarfcn(Integer earfcn) {
            this.earfcn = earfcn;
            return this;
        }

        public Builder setUarfcn(Integer uarfcn) {
            this.uarfcn = uarfcn;
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


        public SurveyCellScanTO build() {
            return new SurveyCellScanTO(id, networkType, signalStrength, timestamp, baseStationID, networkID, systemID, cellID, locationAreaCode, mobileCountryCode, mobileNetworkCode, primaryScramblingCode, operator, arfcn, physicalCellID, trackingAreaCode, timingAdvance, earfcn, uarfcn, latitude, longitude);
        }

    }
}
