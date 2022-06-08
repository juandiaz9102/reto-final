package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Personalization {

    @JsonProperty("to")
    private List<To> to;
    
    @JsonProperty("bcc")
    private List<To> bcc;

    @JsonProperty("subject")
    private String subject;

}
