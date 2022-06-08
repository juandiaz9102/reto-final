package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListCategoryTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListItemTO> checkList;

    public CheckListCategoryTO() {
    }

    public CheckListCategoryTO(String id, String title, String description, java.util.List<CheckListItemTO> checkList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.checkList = checkList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<CheckListItemTO> getCheckList() {
        return checkList;
    }

    public void setCheckList(java.util.List<CheckListItemTO> checkList) {
        this.checkList = checkList;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (checkList != null) {
            joiner.add("checkList: " + GraphQLRequestSerializer.getEntry(checkList));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String title;
        private String description;
        private java.util.List<CheckListItemTO> checkList;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCheckList(java.util.List<CheckListItemTO> checkList) {
            this.checkList = checkList;
            return this;
        }

        public CheckListCategoryTO build() {
            return new CheckListCategoryTO(id, title, description, checkList);
        }

    }
}
