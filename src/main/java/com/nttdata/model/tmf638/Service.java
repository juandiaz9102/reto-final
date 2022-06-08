package com.nttdata.model.tmf638;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf.BaseNode;
import com.nttdata.model.tmf.Characteristic;
import com.nttdata.model.tmf.Feature;
import com.nttdata.model.tmf.Note;
import com.nttdata.model.tmf.Party;
import com.nttdata.model.tmf.Place;
import com.nttdata.model.tmf.RelatedEntity;
import com.nttdata.model.tmf.ServiceOrderItem;
import com.nttdata.model.tmf.StartMode;

import lombok.Getter;
import lombok.Setter;

@JsonTypeName("Service")
@Getter
@Setter
@JsonIgnoreProperties
public class Service extends BaseNode {

	protected String id;
	protected String href;
	protected String category;
	protected String description;
	protected Boolean hasStarted;
	protected Boolean isBundle;
	protected Boolean isServiceEnabled;
	protected Boolean isStateful;
	protected String name;
	protected String state;
	protected Date startDate;
	protected String serviceType;
	protected StartMode startMode;

	//protected java.util.List<ServiceOrderItem> serviceOrderItem;
	protected List<Characteristic> serviceCharacteristic;
	protected String relationshipType;

	protected Date serviceDate;
	protected Date endDate;

	//protected List<Service> serviceRelationship;
	protected List<Feature> feature;
	protected List<Party> relatedParty;
	protected List<Note> note;
	protected List<ResourceRef> supportingResource;
	protected List<ServiceRelationship> serviceRelationship;
	protected ServiceSpecificationRef serviceSpecification;
	protected List<RelatedEntity> relatedEntity;
	protected List<Place> place;
	protected List<Service> supportingService;
	protected String externalId;

	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

		if (id != null) {
			joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
		}
		if (category != null) {
			joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
		}
		if (description != null) {
			joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
		}
		if (endDate != null) {
			joiner.add("endDate: " + GraphQLRequestSerializer.getEntry(endDate));
		}
		if (hasStarted != null) {
			joiner.add("hasStarted: " + GraphQLRequestSerializer.getEntry(hasStarted));
		}
		if (isBundle != null) {
			joiner.add("isBundle: " + GraphQLRequestSerializer.getEntry(isBundle));
		}
		if (isServiceEnabled != null) {
			joiner.add("isServiceEnabled: " + GraphQLRequestSerializer.getEntry(isServiceEnabled));
		}
		if (isStateful != null) {
			joiner.add("isStateful: " + GraphQLRequestSerializer.getEntry(isStateful));
		}
		if (name != null) {
			joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
		}

		if (serviceDate != null) {
			SimpleDateFormat dateFormat =
					new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
			String date = dateFormat.format(serviceDate);
			joiner.add("serviceDate: " + GraphQLRequestSerializer.getEntry(date));
		}

		if (serviceType != null) {
			joiner.add("serviceType: " + GraphQLRequestSerializer.getEntry(serviceType));
		}
		if (startDate != null) {
			joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(startDate));
		}
		if (startMode != null) {
			joiner.add("startMode: " + GraphQLRequestSerializer.getEntry(startMode));
		}
		if (state != null) {
			joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
		}

		if (feature != null) {
			joiner.add("feature: " + GraphQLRequestSerializer.getEntry(feature));
		}
		if (note != null) {
			joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
		}
		if (place != null) {
			joiner.add("place: " + GraphQLRequestSerializer.getEntry(place));
		}
		if (relatedEntity != null) {
			joiner.add("relatedEntity: " + GraphQLRequestSerializer.getEntry(relatedEntity));
		}
		if (relatedParty != null) {
			joiner.add("relatedParty: " + GraphQLRequestSerializer.getEntry(relatedParty));
		}
		if (serviceCharacteristic != null) {
			joiner.add("serviceCharacteristic: " + GraphQLRequestSerializer.getEntry(serviceCharacteristic));
		}
		/*
		if (serviceOrderItem != null) {
			joiner.add("serviceOrderItem: "
					+ GraphQLRequestSerializer.getEntry(serviceOrderItem));
		}
		 */
		if (serviceRelationship != null) {
			joiner.add("serviceRelationship: "
					+ GraphQLRequestSerializer.getEntry(serviceRelationship));
		}
		if (serviceSpecification != null) {
			joiner.add("serviceSpecification: "
					+ GraphQLRequestSerializer.getEntry(serviceSpecification));
		}
		if (supportingResource != null) {
			joiner.add(
					"supportingResource: " + GraphQLRequestSerializer.getEntry(supportingResource));
		}
		if (supportingService != null) {
			joiner.add(
					"supportingService: " + GraphQLRequestSerializer.getEntry(supportingService));
		}

		// The following fields are not found in the TMF638
		if (externalId != null) {
			joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
		}
		if (getType() != null) {
			joiner.add("type: " + GraphQLRequestSerializer.getEntry(getType()));
		}
		if(href!=null){
			joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
		}

		return joiner.toString();
	}
}
