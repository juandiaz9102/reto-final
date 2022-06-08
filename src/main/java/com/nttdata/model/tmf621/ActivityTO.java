package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private UserTO author;
    @javax.validation.constraints.NotNull
    private Boolean isCreate;
    @javax.validation.constraints.NotNull
    private ActivityFieldTO changedField;
    private NodeTO newRelatedNode;
    private NodeTO oldRelatedNode;
    private String oldValue;
    private String newValue;
    @javax.validation.constraints.NotNull
    private String createTime;
    @javax.validation.constraints.NotNull
    private WorkOrderTO workOrder;

    public ActivityTO() {
    }

    public ActivityTO(String id, UserTO author, Boolean isCreate, ActivityFieldTO changedField, NodeTO newRelatedNode, NodeTO oldRelatedNode, String oldValue, String newValue, String createTime, WorkOrderTO workOrder) {
        this.id = id;
        this.author = author;
        this.isCreate = isCreate;
        this.changedField = changedField;
        this.newRelatedNode = newRelatedNode;
        this.oldRelatedNode = oldRelatedNode;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.createTime = createTime;
        this.workOrder = workOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserTO getAuthor() {
        return author;
    }

    public void setAuthor(UserTO author) {
        this.author = author;
    }

    public Boolean getIsCreate() {
        return isCreate;
    }

    public void setIsCreate(Boolean isCreate) {
        this.isCreate = isCreate;
    }

    public ActivityFieldTO getChangedField() {
        return changedField;
    }

    public void setChangedField(ActivityFieldTO changedField) {
        this.changedField = changedField;
    }

    public NodeTO getNewRelatedNode() {
        return newRelatedNode;
    }

    public void setNewRelatedNode(NodeTO newRelatedNode) {
        this.newRelatedNode = newRelatedNode;
    }

    public NodeTO getOldRelatedNode() {
        return oldRelatedNode;
    }

    public void setOldRelatedNode(NodeTO oldRelatedNode) {
        this.oldRelatedNode = oldRelatedNode;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public WorkOrderTO getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderTO workOrder) {
        this.workOrder = workOrder;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (isCreate != null) {
            joiner.add("isCreate: " + GraphQLRequestSerializer.getEntry(isCreate));
        }
        if (changedField != null) {
            joiner.add("changedField: " + GraphQLRequestSerializer.getEntry(changedField));
        }
        if (newRelatedNode != null) {
            joiner.add("newRelatedNode: " + GraphQLRequestSerializer.getEntry(newRelatedNode));
        }
        if (oldRelatedNode != null) {
            joiner.add("oldRelatedNode: " + GraphQLRequestSerializer.getEntry(oldRelatedNode));
        }
        if (oldValue != null) {
            joiner.add("oldValue: " + GraphQLRequestSerializer.getEntry(oldValue));
        }
        if (newValue != null) {
            joiner.add("newValue: " + GraphQLRequestSerializer.getEntry(newValue));
        }
        if (createTime != null) {
            joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private UserTO author;
        private Boolean isCreate;
        private ActivityFieldTO changedField;
        private NodeTO newRelatedNode;
        private NodeTO oldRelatedNode;
        private String oldValue;
        private String newValue;
        private String createTime;
        private WorkOrderTO workOrder;

        public Builder() {
            // Do nothing because schema of symphony.
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAuthor(UserTO author) {
            this.author = author;
            return this;
        }

        public Builder setIsCreate(Boolean isCreate) {
            this.isCreate = isCreate;
            return this;
        }

        public Builder setChangedField(ActivityFieldTO changedField) {
            this.changedField = changedField;
            return this;
        }

        public Builder setNewRelatedNode(NodeTO newRelatedNode) {
            this.newRelatedNode = newRelatedNode;
            return this;
        }

        public Builder setOldRelatedNode(NodeTO oldRelatedNode) {
            this.oldRelatedNode = oldRelatedNode;
            return this;
        }

        public Builder setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }

        public Builder setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setWorkOrder(WorkOrderTO workOrder) {
            this.workOrder = workOrder;
            return this;
        }


        public ActivityTO build() {
            return new ActivityTO(id, author, isCreate, changedField, newRelatedNode, oldRelatedNode, oldValue, newValue, createTime, workOrder);
        }

    }
}
