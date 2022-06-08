package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.StringJoiner;

@JsonTypeName("ResourceRef")
@Data
public class ResourceRef {

    private String id;
    private String href;
    private String name;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@referredType")
    private String referredType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getschemaLocation() {
        return schemaLocation;
    }

    public void setschemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getbaseType() {
        return baseType;
    }

    public void setbaseType(String baseType) {
        this.baseType = baseType;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String getreferredType() {
        return referredType;
    }

    public void setreferredType(String referredType) {
        this.referredType = referredType;
    }

    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedEntityRefOrValue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    atType: ").append(toIndentedString(type)).append("\n");
        sb.append("    atReferredType: ").append(toIndentedString(referredType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
     */

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }

        return joiner.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
