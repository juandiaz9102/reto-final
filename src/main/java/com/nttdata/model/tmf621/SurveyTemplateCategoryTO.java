package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;


import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyTemplateCategoryTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String categoryTitle;
    @javax.validation.constraints.NotNull
    private String categoryDescription;
    private java.util.List<SurveyTemplateQuestionTO> surveyTemplateQuestions;

    public SurveyTemplateCategoryTO() {
    }

    public SurveyTemplateCategoryTO(String id, String categoryTitle, String categoryDescription, java.util.List<SurveyTemplateQuestionTO> surveyTemplateQuestions) {
        this.id = id;
        this.categoryTitle = categoryTitle;
        this.categoryDescription = categoryDescription;
        this.surveyTemplateQuestions = surveyTemplateQuestions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public java.util.List<SurveyTemplateQuestionTO> getSurveyTemplateQuestions() {
        return surveyTemplateQuestions;
    }

    public void setSurveyTemplateQuestions(java.util.List<SurveyTemplateQuestionTO> surveyTemplateQuestions) {
        this.surveyTemplateQuestions = surveyTemplateQuestions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (categoryTitle != null) {
            joiner.add("categoryTitle: " + GraphQLRequestSerializer.getEntry(categoryTitle));
        }
        if (categoryDescription != null) {
            joiner.add("categoryDescription: " + GraphQLRequestSerializer.getEntry(categoryDescription));
        }
        if (surveyTemplateQuestions != null) {
            joiner.add("surveyTemplateQuestions: " + GraphQLRequestSerializer.getEntry(surveyTemplateQuestions));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String categoryTitle;
        private String categoryDescription;
        private java.util.List<SurveyTemplateQuestionTO> surveyTemplateQuestions;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCategoryTitle(String categoryTitle) {
            this.categoryTitle = categoryTitle;
            return this;
        }

        public Builder setCategoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
            return this;
        }

        public Builder setSurveyTemplateQuestions(java.util.List<SurveyTemplateQuestionTO> surveyTemplateQuestions) {
            this.surveyTemplateQuestions = surveyTemplateQuestions;
            return this;
        }


        public SurveyTemplateCategoryTO build() {
            return new SurveyTemplateCategoryTO(id, categoryTitle, categoryDescription, surveyTemplateQuestions);
        }

    }
}
