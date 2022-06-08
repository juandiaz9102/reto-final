package com.nttdata.model.tmf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.Data;

/**
 * Extra information about a given entity
 */
@JsonTypeName("Note")
@Data
public class Note {
    @JsonProperty("id")
    private String id;
    @JsonProperty("author")
    private String author;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("text")
    private String text;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (date != null) {
            SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
            String fecha = dateFormat.format(date);
            joiner.add("date: " + GraphQLRequestSerializer.getEntry(fecha));
          }
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text));
        }
      
        return joiner.toString();
    }

   
}
