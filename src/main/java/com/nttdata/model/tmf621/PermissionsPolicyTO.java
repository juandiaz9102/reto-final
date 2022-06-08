package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private Boolean isGlobal;
    @javax.validation.constraints.NotNull
    private SystemPolicyTO policy;
    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> groups;

    public PermissionsPolicyTO() {
    }

    public PermissionsPolicyTO(String id, String name, String description, Boolean isGlobal, SystemPolicyTO policy, java.util.List<UsersGroupTO> groups) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isGlobal = isGlobal;
        this.policy = policy;
        this.groups = groups;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public SystemPolicyTO getPolicy() {
        return policy;
    }

    public void setPolicy(SystemPolicyTO policy) {
        this.policy = policy;
    }

    public java.util.List<UsersGroupTO> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<UsersGroupTO> groups) {
        this.groups = groups;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (isGlobal != null) {
            joiner.add("isGlobal: " + GraphQLRequestSerializer.getEntry(isGlobal));
        }
        if (policy != null) {
            joiner.add("policy: " + GraphQLRequestSerializer.getEntry(policy));
        }
        if (groups != null) {
            joiner.add("groups: " + GraphQLRequestSerializer.getEntry(groups));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private Boolean isGlobal;
        private SystemPolicyTO policy;
        private java.util.List<UsersGroupTO> groups;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsGlobal(Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setPolicy(SystemPolicyTO policy) {
            this.policy = policy;
            return this;
        }

        public Builder setGroups(java.util.List<UsersGroupTO> groups) {
            this.groups = groups;
            return this;
        }


        public PermissionsPolicyTO build() {
            return new PermissionsPolicyTO(id, name, description, isGlobal, policy, groups);
        }

    }
}
