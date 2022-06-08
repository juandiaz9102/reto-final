package com.nttdata.model.tmf;

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
public class WorkTicketUpdate {
    @JsonProperty("description")
    private String description;

    @JsonProperty("expectedResolutionDate")
    private String expectedResolutionDate;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("requestedResolutionDate")
    private String requestedResolutionDate;

    @JsonProperty("resolutionDate")
    private String resolutionDate;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("ticketType")
    private String ticketType;

    @JsonProperty("attachment")
    private List<AttachmentRefOrValue> attachment;

    @JsonProperty("channel")
    private ChannelRef channel;

    @JsonProperty("note")
    private List<Note> note;

    @JsonProperty("relatedEntity")
    private List<RelatedEntity> relatedEntity;

    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty;

    @JsonProperty("status")
    private WorkTicketStatusType status;

    @JsonProperty("workTicketRelationship")
    private List<WorkTicketRelationship> workTicketRelationship;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;
}
