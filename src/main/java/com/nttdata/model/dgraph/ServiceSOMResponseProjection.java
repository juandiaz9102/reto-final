package com.nttdata.model.dgraph;

import java.util.HashMap;
import java.util.Map;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ServiceSOM
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-03-25T10:09:44-0500"
)
public class ServiceSOMResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceSOMResponseProjection() {
    }

    public ServiceSOMResponseProjection all$() {
        return all$(3);
    }

    public ServiceSOMResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.category();
        this.description();
        this.externalId();
        this.hasStarted();
        this.isServiceEnabled();
        this.isStateful();
        this.name();
        this.serviceDate();
        this.serviceType();
        this.state();
        this.type();
        if (projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.PartyResponseProjection.relatedParty", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSOMResponseProjection.PartyResponseProjection.relatedParty", projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.PartyResponseProjection.relatedParty", 0) + 1);
            this.relatedParty(new PartyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.PartyResponseProjection.relatedParty", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.PlaceResponseProjection.locatedin", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSOMResponseProjection.PlaceResponseProjection.locatedin", projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.PlaceResponseProjection.locatedin", 0) + 1);
            this.place(new PlaceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.PlaceResponseProjection.locatedin", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceSpecificationRefResponseProjection.definedby", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSOMResponseProjection.ServiceSpecificationRefResponseProjection.definedby", projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceSpecificationRefResponseProjection.definedby", 0) + 1);
            this.serviceSpecification(new ServiceSpecificationRefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceSpecificationRefResponseProjection.definedby", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceOrderItemResponseProjection.serviceorderitems", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSOMResponseProjection.ServiceOrderItemResponseProjection.serviceorderitems", projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceOrderItemResponseProjection.serviceorderitems", 0) + 1);
            this.serviceorderitem(new ServiceOrderItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceOrderItemResponseProjection.serviceorderitem", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.CharacteristicResponseProjection.characteristics", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSOMResponseProjection.CharacteristicResponseProjection.characteristics", projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.CharacteristicResponseProjection.characteristics", 0) + 1);
            this.serviceCharacteristic(new CharacteristicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.CharacteristicResponseProjection.characteristics", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceSOMResponseProjection.composedof", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSOMResponseProjection.ServiceSOMResponseProjection.composedof", projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceSOMResponseProjection.composedof", 0) + 1);
            this.supportingService(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSOMResponseProjection.ServiceSOMResponseProjection.composedof", 0)));
        }
        this.relationshipType();
        this.schemaLocation();
        this.type();
        return this;
    }

    public ServiceSOMResponseProjection id() {
        return id(null);
    }

    public ServiceSOMResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection href() {
        return href(null);
    }

    public ServiceSOMResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection category() {
        return category(null);
    }

    public ServiceSOMResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection description() {
        return description(null);
    }

    public ServiceSOMResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection endDate() {
        return endDate(null);
    }

    public ServiceSOMResponseProjection endDate(String alias) {
        fields.add(new GraphQLResponseField("endDate").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection hasStarted() {
        return hasStarted(null);
    }

    public ServiceSOMResponseProjection hasStarted(String alias) {
        fields.add(new GraphQLResponseField("hasStarted").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection isBundle() {
        return isBundle(null);
    }

    public ServiceSOMResponseProjection isBundle(String alias) {
        fields.add(new GraphQLResponseField("isBundle").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection isServiceEnabled() {
        return isServiceEnabled(null);
    }

    public ServiceSOMResponseProjection isServiceEnabled(String alias) {
        fields.add(new GraphQLResponseField("isServiceEnabled").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection isStateful() {
        return isStateful(null);
    }

    public ServiceSOMResponseProjection isStateful(String alias) {
        fields.add(new GraphQLResponseField("isStateful").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection name() {
        return name(null);
    }

    public ServiceSOMResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection serviceDate() {
        return serviceDate(null);
    }

    public ServiceSOMResponseProjection serviceDate(String alias) {
        fields.add(new GraphQLResponseField("serviceDate").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection serviceType() {
        return serviceType(null);
    }

    public ServiceSOMResponseProjection serviceType(String alias) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection state() {
        return state(null);
    }

    public ServiceSOMResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection startDate() {
        return startDate(null);
    }

    public ServiceSOMResponseProjection startDate(String alias) {
        fields.add(new GraphQLResponseField("startDate").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection startMode() {
        return startMode(null);
    }

    public ServiceSOMResponseProjection startMode(String alias) {
        fields.add(new GraphQLResponseField("startMode").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection feature(FeatureResponseProjection subProjection) {
        return feature(null, subProjection);
    }

    public ServiceSOMResponseProjection feature(String alias, FeatureResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("feature").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection note(NoteResponseProjection subProjection) {
        return note(null, subProjection);
    }

    public ServiceSOMResponseProjection note(String alias, NoteResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("note").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection place(PlaceResponseProjection subProjection) {
        return place(null, subProjection);
    }

    public ServiceSOMResponseProjection place(String alias, PlaceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("place").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection relatedEntity(RelatedEntityResponseProjection subProjection) {
        return relatedEntity(null, subProjection);
    }

    public ServiceSOMResponseProjection relatedEntity(String alias, RelatedEntityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedEntity").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection relatedParty(PartyResponseProjection subProjection) {
        return relatedParty(null, subProjection);
    }

    public ServiceSOMResponseProjection relatedParty(String alias, PartyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedParty").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection serviceCharacteristic(CharacteristicResponseProjection subProjection) {
        return serviceCharacteristic(null, subProjection);
    }

    public ServiceSOMResponseProjection serviceCharacteristic(String alias, CharacteristicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceCharacteristic").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection serviceorderitem(ServiceOrderItemResponseProjection subProjection) {
        return serviceorderitem(null, subProjection);
    }

    public ServiceSOMResponseProjection serviceorderitem(String alias, ServiceOrderItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceorderitem").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection serviceRelationship(ServiceRelationshipResponseProjection subProjection) {
        return serviceRelationship(null, subProjection);
    }

    public ServiceSOMResponseProjection serviceRelationship(String alias, ServiceRelationshipResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceRelationship").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection serviceSpecification(ServiceSpecificationRefResponseProjection subProjection) {
        return serviceSpecification(null, subProjection);
    }

    public ServiceSOMResponseProjection serviceSpecification(String alias, ServiceSpecificationRefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceSpecification").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection supportingResource(ResourceRefResponseProjection subProjection) {
        return supportingResource(null, subProjection);
    }

    public ServiceSOMResponseProjection supportingResource(String alias, ResourceRefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("supportingResource").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSOMResponseProjection supportingService(ServiceSOMResponseProjection subProjection) {
        return supportingService(null, subProjection);
    }

    public ServiceSOMResponseProjection supportingService(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("supportingService").alias(alias).projection(subProjection));
        return this;
    }


    // The following fields are not found in the TMF638
    public ServiceSOMResponseProjection externalId() {
        return externalId(null);
    }

    public ServiceSOMResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection type() {
        return type(null);
    }

    public ServiceSOMResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }
    
    public ServiceSOMResponseProjection relationshipType() {
        return relationshipType(null);
    }

    public ServiceSOMResponseProjection relationshipType(String alias) {
        fields.add(new GraphQLResponseField("relationshipType").alias(alias));
        return this;
    }

    public ServiceSOMResponseProjection schemaLocation() {
        return schemaLocation(null);
    }

    public ServiceSOMResponseProjection schemaLocation(String alias) {
        fields.add(new GraphQLResponseField("schemaLocation").alias(alias));
        return this;
    }

    /**
     *
     * For delete method response
     */
    public ServiceSOMResponseProjection msg() {
        return this.msg((String)null);
    }

    public ServiceSOMResponseProjection msg(String alias) {
        this.fields.add((new GraphQLResponseField("msg")).alias(alias));
        return this;
    }

}
