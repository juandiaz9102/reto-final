package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyTemplateQuestionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String questionTitle;
    @javax.validation.constraints.NotNull
    private String questionDescription;
    @javax.validation.constraints.NotNull
    private SurveyQuestionTypeTO questionType;
    @javax.validation.constraints.NotNull
    private Integer index;

    public SurveyTemplateQuestionTO() {
    }

    public SurveyTemplateQuestionTO(String id, String questionTitle, String questionDescription, SurveyQuestionTypeTO questionType, Integer index) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
        this.questionType = questionType;
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public SurveyQuestionTypeTO getQuestionType() {
        return questionType;
    }

    public void setQuestionType(SurveyQuestionTypeTO questionType) {
        this.questionType = questionType;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (questionTitle != null) {
            joiner.add("questionTitle: " + GraphQLRequestSerializer.getEntry(questionTitle));
        }
        if (questionDescription != null) {
            joiner.add("questionDescription: " + GraphQLRequestSerializer.getEntry(questionDescription));
        }
        if (questionType != null) {
            joiner.add("questionType: " + GraphQLRequestSerializer.getEntry(questionType));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String questionTitle;
        private String questionDescription;
        private SurveyQuestionTypeTO questionType;
        private Integer index;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setQuestionTitle(String questionTitle) {
            this.questionTitle = questionTitle;
            return this;
        }

        public Builder setQuestionDescription(String questionDescription) {
            this.questionDescription = questionDescription;
            return this;
        }

        public Builder setQuestionType(SurveyQuestionTypeTO questionType) {
            this.questionType = questionType;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }


        public SurveyTemplateQuestionTO build() {
            return new SurveyTemplateQuestionTO(id, questionTitle, questionDescription, questionType, index);
        }

    }
}
