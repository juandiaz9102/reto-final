package com.nttdata.utils;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

import com.nttdata.model.tmf621.ActivityTO;
import com.nttdata.model.tmf621.AttachmentRefOrValue;
import com.nttdata.model.tmf621.Characteristic;
import com.nttdata.model.tmf621.CheckList;
import com.nttdata.model.tmf621.CheckListCategoryTO;
import com.nttdata.model.tmf621.CheckListItemTO;
import com.nttdata.model.tmf621.CommentTO;
import com.nttdata.model.tmf621.FileTO;
import com.nttdata.model.tmf621.HyperlinkTO;
import com.nttdata.model.tmf621.Item;
import com.nttdata.model.tmf621.LocationTO;
import com.nttdata.model.tmf621.Note;
import com.nttdata.model.tmf621.ProjectTO;
import com.nttdata.model.tmf621.PropertyKindTO;
import com.nttdata.model.tmf621.PropertyTO;
import com.nttdata.model.tmf621.Quantity;
import com.nttdata.model.tmf621.RelatedEntity;
import com.nttdata.model.tmf621.RelatedParty;
import com.nttdata.model.tmf621.UserTO;
import com.nttdata.model.tmf621.WorkOrderPriorityTO;
import com.nttdata.model.tmf621.WorkOrderStatusTO;
import com.nttdata.model.tmf621.WorkOrderTO;
import com.nttdata.model.tmf621.WorkTicket;
import com.nttdata.model.tmf621.WorkTicketStatusType;


@Component
public class WorkOrderGraphToTMF621 {

    public WorkTicket transform(WorkOrderTO workOrder) {
        WorkTicket workTicket = new WorkTicket();
        workTicket.setId(workOrder.getId());
        workTicket.setHref("/tmf-api/workTicketManagement/v1/workTicket/" + workOrder.getId() + "?@baseType=workOrder");
        workTicket.setCreationDate(changeTimeZone(workOrder.getCreationDate()));
        workTicket.setDescription(workOrder.getDescription());
        workTicket.setName(workOrder.getName());
        workTicket.setPriority(priority(workOrder.getPriority()));
        workTicket.setResolutionDate(changeTimeZone(workOrder.getCloseDate()));
        workTicket.setTicketType(workOrder.getWorkOrderType().getName());
        workTicket.setStatus(status(workOrder.getStatus()));
        workTicket.setAttachment(attachments(workOrder.getFiles()));
        workTicket.setCharacteristic(characteristics(workOrder.getProperties(), workOrder.getHyperlinks()));
        workTicket.setNote(notes(workOrder.getComments(), workOrder.getActivities()));
        workTicket.setRelatedEntity(relatedEntities(workOrder.getProject(), workOrder.getLocation()));
        workTicket.setRelatedParty(relatedParties(workOrder.getOwner(), workOrder.getAssignedTo()));
        workTicket.set_atBaseType("workOrder");
        workTicket.set_atType(workOrder.getWorkOrderType().getName());
        workTicket.setCheckList(checkList(workOrder.getCheckListCategories()));
        return workTicket;
    }

    private String priority(WorkOrderPriorityTO priority) {
        String p = null;
        if (priority != null) {
            p = priority.toString().toLowerCase();
        }
        return p;
    }

    private WorkTicketStatusType status(WorkOrderStatusTO state) {
        WorkTicketStatusType status = WorkTicketStatusType.ACKNOWLEDGED;
        if (state.toString().equals("DONE")) {
            status = WorkTicketStatusType.CLOSED;
        } else if (state.toString().equals("PENDING")) {
            status = WorkTicketStatusType.PENDING;
        }
        return status;
    }

    private List<AttachmentRefOrValue> attachments(List<FileTO> files) {
        if (files != null && !files.isEmpty()) {
            List<AttachmentRefOrValue> attachments = new ArrayList<>();
            files.forEach(f -> {
                AttachmentRefOrValue attachment = new AttachmentRefOrValue();
                attachment.setId(f.getId());
                attachment.setAttachmentType(f.getFileType().toString());
                attachment.setMimeType(f.getMimeType());
                attachment.setName(f.getFileName());
                Quantity q = new Quantity();
                q.setAmount(f.getSizeInBytes().floatValue());
                q.setUnits("bytes");
                attachment.setSize(q);
                attachments.add(attachment);
            });
            return attachments;
        }
        return new ArrayList<>();
    }

    private List<Characteristic> characteristics(List<PropertyTO> props, List<HyperlinkTO> hyperlinks) {
        if ((props != null && !props.isEmpty()) || (hyperlinks != null && !hyperlinks.isEmpty())) {
            List<Characteristic> characteristics = new ArrayList<>();
            if (props != null) {
                props.forEach(p -> {
                    Characteristic characteristic = new Characteristic();
                    characteristic.setId(p.getId());
                    characteristic.setValue(p.getStringValue());
                    if (p.getPropertyType().getType().equals(PropertyKindTO.NODE)) {
                        characteristic.setId(p.getPropertyType().getId());
                        characteristic.setValue(p.getRawValue());
                    }

                    characteristic.setName(p.getPropertyType().getName());
                    characteristic.setValueType(p.getPropertyType().getType().toString());
                    characteristic.set_atBaseType("propertyType");
                    characteristics.add(characteristic);
                });
            }
            if (hyperlinks != null) {
                hyperlinks.forEach(h -> {
                    Characteristic characteristic = new Characteristic();
                    characteristic.setId(h.getId());
                    characteristic.setName(h.getDisplayName());
                    characteristic.setValueType("string");
                    characteristic.setValue(h.getUrl());
                    characteristic.set_atBaseType("hyperlink");
                    characteristics.add(characteristic);
                });
            }
            return characteristics;
        }
        return new ArrayList<>();
    }

    private List<Note> notes(List<CommentTO> comments, List<ActivityTO> activities) {
    	List<Note> notes = new ArrayList<>();
        if (comments != null && !comments.isEmpty()) {            
            comments.forEach(c -> {
                Note note = new Note();                
                note.setId(c.getId());
                note.setText(c.getText());
                note.setDate(c.getCreateTime());
                note.setAuthor(c.getAuthor().getName());
                note.set_atBaseType("Comments");
                notes.add(note);
            });            
        }
        if (activities != null && !activities.isEmpty()) {            
        	activities.forEach(c -> {
                Note note = new Note();
                note.setId(c.getId());                
                note.setDate(c.getCreateTime());
                note.setAuthor(c.getAuthor().getName());
                note.set_atBaseType("Activity");
                notes.add(note);
            });            
        }
        return notes;
    }

    private List<RelatedEntity> relatedEntities(ProjectTO project, LocationTO location) {
        if (project != null || location != null) {
            List<RelatedEntity> relatedEntities = new ArrayList<>();
            if (project != null) {
                RelatedEntity relatedEntity = new RelatedEntity();
                relatedEntity.setId(project.getId());
                relatedEntity.setHref("/tmf-api/workTicketManagement/v1/workTicket/"
                        + project.getId() + "?@baseType=project");
                relatedEntity.setName(project.getName());
                relatedEntity.setRole("project");
                relatedEntity.set_atBaseType("project");
                relatedEntity.set_atType(project.getType().getName());
                relatedEntities.add(relatedEntity);
            }
            if (location != null) {
                RelatedEntity relatedEntity = new RelatedEntity();
                relatedEntity.setId(location.getId());
                relatedEntity.setHref("/tmf-api/resourceInventoryManagement/v1/resource/"
                        + location.getId() + "?@baseType=location");
                relatedEntity.setName(location.getName());
                relatedEntity.setRole("location");
                relatedEntity.set_atBaseType("location");
                relatedEntity.set_atType(location.getLocationType().getName());
                relatedEntities.add(relatedEntity);
            }
            return relatedEntities;
        }
        return new ArrayList<>();
    }

    private List<RelatedParty> relatedParties(UserTO owner, UserTO assigned) {
        if (owner != null || assigned != null) {
            List<RelatedParty> relatedParties = new ArrayList<>();
            if (owner != null) {
                RelatedParty relatedParty = new RelatedParty();
                relatedParty.setId(owner.getId());
                relatedParty.setHref("/tmf-api/userManagement/v1/user/" + owner.getId());
                relatedParty.setName(owner.getName());
                relatedParty.setRole("OWNER");
                relatedParty.set_atBaseType("user");
                relatedParty.set_atType("OWNER");
                relatedParties.add(relatedParty);
            }
            if (assigned != null) {
                RelatedParty relatedParty = new RelatedParty();
                relatedParty.setId(assigned.getId());
                relatedParty.setHref("/tmf-api/userManagement/v1/user/" + assigned.getId());
                relatedParty.setName(assigned.getName());
                relatedParty.setRole("ASSIGNED");
                relatedParty.set_atBaseType("user");
                relatedParty.set_atType("ASSIGNED");
                relatedParties.add(relatedParty);
            }
            return relatedParties;
        }
        return new ArrayList<>();
    }

    private String changeTimeZone(String dateTime) {
        if (dateTime != null) {
            DateTimeFormatter df = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");
            DateTime dateToChange = df.withOffsetParsed().parseDateTime(dateTime);
            DateTimeFormatter regionZone = df.withZone(DateTimeZone.forID("America/Bogota"));
            Date date = dateToChange.toDate();
            DateTime dateTimeToShow = new DateTime(date);
            return dateTimeToShow.toString(regionZone);
        }
        return null;
    }

    private List<CheckList> checkList(List<CheckListCategoryTO> checkListCategories) {
        if (checkListCategories != null && checkListCategories.size() > 0) {
            List<CheckList> cls = new ArrayList<>();
            checkListCategories.forEach(c -> {
                CheckList cl = new CheckList();
                cl.setId(c.getId());
                cl.setDescription(c.getDescription());
                cl.setName(c.getTitle());
                if (c.getCheckList() != null && c.getCheckList().size() > 0) {
                    List<Item> items = new ArrayList<>();
                    c.getCheckList().forEach(i -> {
                        Item item = new Item();
                        item.setId(i.getId());
                        item.setName(i.getTitle());
                        item.setDescription(i.getHelpText());
                        item.setValueType(i.getType().toString());
                        item.setOptions(i.getEnumValues());
                        item.setValue(itemDefineValue(i));
                        items.add(item);
                    });
                    cl.setItem(items);
                }
                cls.add(cl);
            });
            return cls;
        }
        return null;
    }

    private Object itemDefineValue(CheckListItemTO item) {
        Object value = null;
        switch (item.getType().toString().toLowerCase()) {
            case "simple":
                value = item.getChecked();
                break;
            case "string":
                value = item.getStringValue();
                break;
            case "enum":
                value = item.getSelectedEnumValues();
                break;
            case "files":
                value = item.getFiles();
                break;
            case "yes_no":
                value = item.getYesNoResponse() != null ? item.getYesNoResponse().toString().toLowerCase() : "";
                break;
            case "cell_scan":
            case "wifiScan":
                value = "Unsupported type";
                break;
        }
        return value;
    }
}
