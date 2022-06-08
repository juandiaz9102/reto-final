package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private UserTO createdBy;
    @javax.validation.constraints.NotNull
    private ProjectTypeTO type;
    private ProjectTemplateTO template;
    private LocationTO location;
    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderTO> workOrders;
    @javax.validation.constraints.NotNull
    private Integer numberOfWorkOrders;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentTO> comments;
    private ProjectPriorityTO priority;

    public ProjectTO() {
    }

    public ProjectTO(String id, String name, String description, UserTO createdBy, ProjectTypeTO type, ProjectTemplateTO template, LocationTO location, java.util.List<WorkOrderTO> workOrders, Integer numberOfWorkOrders, java.util.List<PropertyTO> properties, java.util.List<CommentTO> comments, ProjectPriorityTO priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.type = type;
        this.template = template;
        this.location = location;
        this.workOrders = workOrders;
        this.numberOfWorkOrders = numberOfWorkOrders;
        this.properties = properties;
        this.comments = comments;
        this.priority = priority;
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

    public UserTO getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserTO createdBy) {
        this.createdBy = createdBy;
    }

    public ProjectTypeTO getType() {
        return type;
    }

    public void setType(ProjectTypeTO type) {
        this.type = type;
    }

    public ProjectTemplateTO getTemplate() {
        return template;
    }

    public void setTemplate(ProjectTemplateTO template) {
        this.template = template;
    }

    public LocationTO getLocation() {
        return location;
    }

    public void setLocation(LocationTO location) {
        this.location = location;
    }

    public java.util.List<WorkOrderTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
        this.workOrders = workOrders;
    }

    public Integer getNumberOfWorkOrders() {
        return numberOfWorkOrders;
    }

    public void setNumberOfWorkOrders(Integer numberOfWorkOrders) {
        this.numberOfWorkOrders = numberOfWorkOrders;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public java.util.List<CommentTO> getComments() {
        return comments;
    }

    public void setComments(java.util.List<CommentTO> comments) {
        this.comments = comments;
    }

    public ProjectPriorityTO getPriority() {
        return priority;
    }

    public void setPriority(ProjectPriorityTO priority) {
        this.priority = priority;
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
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        if (numberOfWorkOrders != null) {
            joiner.add("numberOfWorkOrders: " + GraphQLRequestSerializer.getEntry(numberOfWorkOrders));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (comments != null) {
            joiner.add("comments: " + GraphQLRequestSerializer.getEntry(comments));
        }
        if (priority != null) {
            joiner.add("priority: " + GraphQLRequestSerializer.getEntry(priority));
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
        private UserTO createdBy;
        private ProjectTypeTO type;
        private ProjectTemplateTO template;
        private LocationTO location;
        private java.util.List<WorkOrderTO> workOrders;
        private Integer numberOfWorkOrders;
        private java.util.List<PropertyTO> properties;
        private java.util.List<CommentTO> comments;
        private ProjectPriorityTO priority;

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

        public Builder setCreatedBy(UserTO createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setType(ProjectTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setTemplate(ProjectTemplateTO template) {
            this.template = template;
            return this;
        }

        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        public Builder setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }

        public Builder setNumberOfWorkOrders(Integer numberOfWorkOrders) {
            this.numberOfWorkOrders = numberOfWorkOrders;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setComments(java.util.List<CommentTO> comments) {
            this.comments = comments;
            return this;
        }

        public Builder setPriority(ProjectPriorityTO priority) {
            this.priority = priority;
            return this;
        }

        public ProjectTO build() {
            return new ProjectTO(id, name, description, createdBy, type, template, location, workOrders, numberOfWorkOrders, properties, comments, priority);
        }
    }
}
