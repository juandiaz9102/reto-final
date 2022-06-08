package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String authID;
    @javax.validation.constraints.NotNull
    private String firstName;
    @javax.validation.constraints.NotNull
    private String lastName;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private UserStatusTO status;
    @javax.validation.constraints.NotNull
    private UserRoleTO role;
    private FileTO profilePhoto;
    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> groups;

    public UserTO() {
    }

    public UserTO(String id, String authID, String firstName, String lastName, String name, String email, UserStatusTO status, UserRoleTO role, FileTO profilePhoto, java.util.List<UsersGroupTO> groups) {
        this.id = id;
        this.authID = authID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.email = email;
        this.status = status;
        this.role = role;
        this.profilePhoto = profilePhoto;
        this.groups = groups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthID() {
        return authID;
    }

    public void setAuthID(String authID) {
        this.authID = authID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserStatusTO getStatus() {
        return status;
    }

    public void setStatus(UserStatusTO status) {
        this.status = status;
    }

    public UserRoleTO getRole() {
        return role;
    }

    public void setRole(UserRoleTO role) {
        this.role = role;
    }

    public FileTO getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(FileTO profilePhoto) {
        this.profilePhoto = profilePhoto;
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
        if (authID != null) {
            joiner.add("authID: " + GraphQLRequestSerializer.getEntry(authID));
        }
        if (firstName != null) {
            joiner.add("firstName: " + GraphQLRequestSerializer.getEntry(firstName));
        }
        if (lastName != null) {
            joiner.add("lastName: " + GraphQLRequestSerializer.getEntry(lastName));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (profilePhoto != null) {
            joiner.add("profilePhoto: " + GraphQLRequestSerializer.getEntry(profilePhoto));
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
        private String authID;
        private String firstName;
        private String lastName;
        private String name;
        private String email;
        private UserStatusTO status;
        private UserRoleTO role;
        private FileTO profilePhoto;
        private java.util.List<UsersGroupTO> groups;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAuthID(String authID) {
            this.authID = authID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setStatus(UserStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setRole(UserRoleTO role) {
            this.role = role;
            return this;
        }

        public Builder setProfilePhoto(FileTO profilePhoto) {
            this.profilePhoto = profilePhoto;
            return this;
        }

        public Builder setGroups(java.util.List<UsersGroupTO> groups) {
            this.groups = groups;
            return this;
        }


        public UserTO build() {
            return new UserTO(id, authID, firstName, lastName, name, email, status, role, profilePhoto, groups);
        }

    }
}
