package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Boolean isDeleted;
    @javax.validation.constraints.NotNull
    private Boolean hasCustomer;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;
    @javax.validation.constraints.NotNull
    private Integer numberOfServices;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions;
    @javax.validation.constraints.NotNull
    private DiscoveryMethodTO discoveryMethod;

    public ServiceTypeTO() {
    }

    public ServiceTypeTO(String id, String name, Boolean isDeleted, Boolean hasCustomer, java.util.List<PropertyTypeTO> propertyTypes, java.util.List<ServiceTO> services, Integer numberOfServices, java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions, DiscoveryMethodTO discoveryMethod) {
        this.id = id;
        this.name = name;
        this.isDeleted = isDeleted;
        this.hasCustomer = hasCustomer;
        this.propertyTypes = propertyTypes;
        this.services = services;
        this.numberOfServices = numberOfServices;
        this.endpointDefinitions = endpointDefinitions;
        this.discoveryMethod = discoveryMethod;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getHasCustomer() {
        return hasCustomer;
    }

    public void setHasCustomer(Boolean hasCustomer) {
        this.hasCustomer = hasCustomer;
    }

    public java.util.List<PropertyTypeTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public java.util.List<ServiceTO> getServices() {
        return services;
    }

    public void setServices(java.util.List<ServiceTO> services) {
        this.services = services;
    }

    public Integer getNumberOfServices() {
        return numberOfServices;
    }

    public void setNumberOfServices(Integer numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    public java.util.List<ServiceEndpointDefinitionTO> getEndpointDefinitions() {
        return endpointDefinitions;
    }

    public void setEndpointDefinitions(java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions) {
        this.endpointDefinitions = endpointDefinitions;
    }

    public DiscoveryMethodTO getDiscoveryMethod() {
        return discoveryMethod;
    }

    public void setDiscoveryMethod(DiscoveryMethodTO discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
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
        if (isDeleted != null) {
            joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        }
        if (hasCustomer != null) {
            joiner.add("hasCustomer: " + GraphQLRequestSerializer.getEntry(hasCustomer));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        if (numberOfServices != null) {
            joiner.add("numberOfServices: " + GraphQLRequestSerializer.getEntry(numberOfServices));
        }
        if (endpointDefinitions != null) {
            joiner.add("endpointDefinitions: " + GraphQLRequestSerializer.getEntry(endpointDefinitions));
        }
        if (discoveryMethod != null) {
            joiner.add("discoveryMethod: " + GraphQLRequestSerializer.getEntry(discoveryMethod));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private Boolean isDeleted;
        private Boolean hasCustomer;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private java.util.List<ServiceTO> services;
        private Integer numberOfServices;
        private java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions;
        private DiscoveryMethodTO discoveryMethod;

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

        public Builder setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public Builder setHasCustomer(Boolean hasCustomer) {
            this.hasCustomer = hasCustomer;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }

        public Builder setNumberOfServices(Integer numberOfServices) {
            this.numberOfServices = numberOfServices;
            return this;
        }

        public Builder setEndpointDefinitions(java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions) {
            this.endpointDefinitions = endpointDefinitions;
            return this;
        }

        public Builder setDiscoveryMethod(DiscoveryMethodTO discoveryMethod) {
            this.discoveryMethod = discoveryMethod;
            return this;
        }


        public ServiceTypeTO build() {
            return new ServiceTypeTO(id, name, isDeleted, hasCustomer, propertyTypes, services, numberOfServices, endpointDefinitions, discoveryMethod);
        }

    }
}
