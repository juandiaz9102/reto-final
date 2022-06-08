package com.nttdata.model.tmf640;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nttdata.model.tmf.Characteristic;
import com.nttdata.model.tmf.Feature;
import com.nttdata.model.tmf.Note;
import com.nttdata.model.tmf.RelatedParty;
import com.nttdata.model.tmf.RelatedServiceOrderItem;
import com.nttdata.model.tmf.ResourceRef;
import com.nttdata.model.tmf.ServiceRelationship;
import com.nttdata.model.tmf.ServiceStateType;
import com.nttdata.model.tmf638.RelatedPlaceRefOrValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService. Skipped properties: id,href
 */
@ApiModel(description = "Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService. Skipped properties: id,href")

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-25T14:06:01.043Z")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ServiceCreate   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("hasStarted")
  private Boolean hasStarted = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isServiceEnabled")
  private Boolean isServiceEnabled = null;

  @JsonProperty("isStateful")
  private Boolean isStateful = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceDate")
  private String serviceDate = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("startMode")
  private String startMode = null;

  @JsonProperty("feature")
  
  private List<Feature> feature = null;

  @JsonProperty("note")
  
  private List<Note> note = null;

  @JsonProperty("place")
  
  private List<RelatedPlaceRefOrValue> place = null;

  @JsonProperty("relatedEntity")
  
  private List<RelatedEntityRefOrValue> relatedEntity = null;

  @JsonProperty("relatedParty")
  
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("serviceCharacteristic")
  
  private List<Characteristic> serviceCharacteristic = null;

  @JsonProperty("serviceOrderItem")
  
  private List<RelatedServiceOrderItem> serviceOrderItem = null;

  @JsonProperty("serviceRelationship")
  
  private List<ServiceRelationship> serviceRelationship = null;

  @JsonProperty("serviceSpecification")
  private ServiceSpecificationRef serviceSpecification = null;

  @JsonProperty("state")
  private ServiceStateType state = null;

  @JsonProperty("supportingResource")
  
  private List<ResourceRef> supportingResource = null;

  @JsonProperty("supportingService")
  
  private List<ServiceRefOrValue> supportingService = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ServiceCreate category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Is it a customer facing or resource facing service
   * @return category
  **/
  @ApiModelProperty(value = "Is it a customer facing or resource facing service")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ServiceCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-text description of the service
   * @return description
  **/
  @ApiModelProperty(value = "Free-text description of the service")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceCreate endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date when the service ends
   * @return endDate
  **/
  @ApiModelProperty(value = "Date when the service ends")

  

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ServiceCreate hasStarted(Boolean hasStarted) {
    this.hasStarted = hasStarted;
    return this;
  }

  /**
   * If TRUE, this Service has already been started
   * @return hasStarted
  **/
  @ApiModelProperty(value = "If TRUE, this Service has already been started")


  public Boolean isHasStarted() {
    return hasStarted;
  }

  public void setHasStarted(Boolean hasStarted) {
    this.hasStarted = hasStarted;
  }

  public ServiceCreate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).
   * @return isBundle
  **/
  @ApiModelProperty(value = "If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).")


  public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ServiceCreate isServiceEnabled(Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
    return this;
  }

  /**
   * If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed 
   * @return isServiceEnabled
  **/
  @ApiModelProperty(value = "If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed ")


  public Boolean isIsServiceEnabled() {
    return isServiceEnabled;
  }

  public void setIsServiceEnabled(Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
  }

  public ServiceCreate isStateful(Boolean isStateful) {
    this.isStateful = isStateful;
    return this;
  }

  /**
   * If TRUE, this Service can be changed without affecting any other services
   * @return isStateful
  **/
  @ApiModelProperty(value = "If TRUE, this Service can be changed without affecting any other services")


  public Boolean isIsStateful() {
    return isStateful;
  }

  public void setIsStateful(Boolean isStateful) {
    this.isStateful = isStateful;
  }

  public ServiceCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service
   * @return name
  **/
  @ApiModelProperty(value = "Name of the service")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceCreate serviceDate(String serviceDate) {
    this.serviceDate = serviceDate;
    return this;
  }

  /**
   * Date when the service was created (whatever its status).
   * @return serviceDate
  **/
  @ApiModelProperty(value = "Date when the service was created (whatever its status).")


  public String getServiceDate() {
    return serviceDate;
  }

  public void setServiceDate(String serviceDate) {
    this.serviceDate = serviceDate;
  }

  public ServiceCreate serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Business type of the service
   * @return serviceType
  **/
  @ApiModelProperty(value = "Business type of the service")


  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ServiceCreate startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the service starts
   * @return startDate
  **/
  @ApiModelProperty(value = "Date when the service starts")

  

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ServiceCreate startMode(String startMode) {
    this.startMode = startMode;
    return this;
  }

  /**
   * This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above
   * @return startMode
  **/
  @ApiModelProperty(value = "This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above")


  public String getStartMode() {
    return startMode;
  }

  public void setStartMode(String startMode) {
    this.startMode = startMode;
  }

  public ServiceCreate feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public ServiceCreate addFeatureItem(Feature featureItem) {
    if (this.feature == null) {
      this.feature = new ArrayList<Feature>();
    }
    this.feature.add(featureItem);
    return this;
  }

  /**
   * A list of feature associated with this service 
   * @return feature
  **/
  @ApiModelProperty(value = "A list of feature associated with this service ")

  

  public List<Feature> getFeature() {
    return feature;
  }

  public void setFeature(List<Feature> feature) {
    this.feature = feature;
  }

  public ServiceCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceCreate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * A list of notes made on this service
   * @return note
  **/
  @ApiModelProperty(value = "A list of notes made on this service")

  

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ServiceCreate place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ServiceCreate addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceRefOrValue>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)
   * @return place
  **/
  @ApiModelProperty(value = "A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)")

  

  public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public ServiceCreate relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public ServiceCreate addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<RelatedEntityRefOrValue>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * A list of related  entity in relationship with this service 
   * @return relatedEntity
  **/
  @ApiModelProperty(value = "A list of related  entity in relationship with this service ")

  

  public List<RelatedEntityRefOrValue> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public ServiceCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity
   * @return relatedParty
  **/
  @ApiModelProperty(value = "A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity")

  

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceCreate serviceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public ServiceCreate addServiceCharacteristicItem(Characteristic serviceCharacteristicItem) {
    if (this.serviceCharacteristic == null) {
      this.serviceCharacteristic = new ArrayList<Characteristic>();
    }
    this.serviceCharacteristic.add(serviceCharacteristicItem);
    return this;
  }

  /**
   * A list of characteristics that characterize this service (ServiceCharacteristic [*]) 
   * @return serviceCharacteristic
  **/
  @ApiModelProperty(value = "A list of characteristics that characterize this service (ServiceCharacteristic [*]) ")

  

  public List<Characteristic> getServiceCharacteristic() {
    return serviceCharacteristic;
  }

  public void setServiceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
  }

  public ServiceCreate serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceCreate addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<RelatedServiceOrderItem>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items related to this service
   * @return serviceOrderItem
  **/
  @ApiModelProperty(value = "A list of service order items related to this service")

  

  public List<RelatedServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceCreate serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public ServiceCreate addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
    if (this.serviceRelationship == null) {
      this.serviceRelationship = new ArrayList<ServiceRelationship>();
    }
    this.serviceRelationship.add(serviceRelationshipItem);
    return this;
  }

  /**
   * A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example).
   * @return serviceRelationship
  **/
  @ApiModelProperty(value = "A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example).")

  

  public List<ServiceRelationship> getServiceRelationship() {
    return serviceRelationship;
  }

  public void setServiceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
  }

  public ServiceCreate serviceSpecification(ServiceSpecificationRef serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  /**
   * The specification from which this service was instantiated
   * @return serviceSpecification
  **/
  @ApiModelProperty(required = true, value = "The specification from which this service was instantiated")
  @NotNull

  

  public ServiceSpecificationRef getServiceSpecification() {
    return serviceSpecification;
  }

  public void setServiceSpecification(ServiceSpecificationRef serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  public ServiceCreate state(ServiceStateType state) {
    this.state = state;
    return this;
  }

  /**
   * The life cycle state of the service, such as designed, reserved, active, etc...
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The life cycle state of the service, such as designed, reserved, active, etc...")
  @NotNull

  

  public ServiceStateType getState() {
    return state;
  }

  public void setState(ServiceStateType state) {
    this.state = state;
  }

  public ServiceCreate supportingResource(List<ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  public ServiceCreate addSupportingResourceItem(ResourceRef supportingResourceItem) {
    if (this.supportingResource == null) {
      this.supportingResource = new ArrayList<ResourceRef>();
    }
    this.supportingResource.add(supportingResourceItem);
    return this;
  }

  /**
   * A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources
   * @return supportingResource
  **/
  @ApiModelProperty(value = "A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources")

  

  public List<ResourceRef> getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(List<ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
  }

  public ServiceCreate supportingService(List<ServiceRefOrValue> supportingService) {
    this.supportingService = supportingService;
    return this;
  }

  public ServiceCreate addSupportingServiceItem(ServiceRefOrValue supportingServiceItem) {
    if (this.supportingService == null) {
      this.supportingService = new ArrayList<ServiceRefOrValue>();
    }
    this.supportingService.add(supportingServiceItem);
    return this;
  }

  /**
   * A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)
   * @return supportingService
  **/
  @ApiModelProperty(value = "A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)")

  

  public List<ServiceRefOrValue> getSupportingService() {
    return supportingService;
  }

  public void setSupportingService(List<ServiceRefOrValue> supportingService) {
    this.supportingService = supportingService;
  }

  public ServiceCreate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ServiceCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ServiceCreate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCreate serviceCreate = (ServiceCreate) o;
    return Objects.equals(this.category, serviceCreate.category) &&
        Objects.equals(this.description, serviceCreate.description) &&
        Objects.equals(this.endDate, serviceCreate.endDate) &&
        Objects.equals(this.hasStarted, serviceCreate.hasStarted) &&
        Objects.equals(this.isBundle, serviceCreate.isBundle) &&
        Objects.equals(this.isServiceEnabled, serviceCreate.isServiceEnabled) &&
        Objects.equals(this.isStateful, serviceCreate.isStateful) &&
        Objects.equals(this.name, serviceCreate.name) &&
        Objects.equals(this.serviceDate, serviceCreate.serviceDate) &&
        Objects.equals(this.serviceType, serviceCreate.serviceType) &&
        Objects.equals(this.startDate, serviceCreate.startDate) &&
        Objects.equals(this.startMode, serviceCreate.startMode) &&
        Objects.equals(this.feature, serviceCreate.feature) &&
        Objects.equals(this.note, serviceCreate.note) &&
        Objects.equals(this.place, serviceCreate.place) &&
        Objects.equals(this.relatedEntity, serviceCreate.relatedEntity) &&
        Objects.equals(this.relatedParty, serviceCreate.relatedParty) &&
        Objects.equals(this.serviceCharacteristic, serviceCreate.serviceCharacteristic) &&
        Objects.equals(this.serviceOrderItem, serviceCreate.serviceOrderItem) &&
        Objects.equals(this.serviceRelationship, serviceCreate.serviceRelationship) &&
        Objects.equals(this.serviceSpecification, serviceCreate.serviceSpecification) &&
        Objects.equals(this.state, serviceCreate.state) &&
        Objects.equals(this.supportingResource, serviceCreate.supportingResource) &&
        Objects.equals(this.supportingService, serviceCreate.supportingService) &&
        Objects.equals(this.baseType, serviceCreate.baseType) &&
        Objects.equals(this.schemaLocation, serviceCreate.schemaLocation) &&
        Objects.equals(this.type, serviceCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, endDate, hasStarted, isBundle, isServiceEnabled, isStateful, name, serviceDate, serviceType, startDate, startMode, feature, note, place, relatedEntity, relatedParty, serviceCharacteristic, serviceOrderItem, serviceRelationship, serviceSpecification, state, supportingResource, supportingService, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCreate {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hasStarted: ").append(toIndentedString(hasStarted)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isServiceEnabled: ").append(toIndentedString(isServiceEnabled)).append("\n");
    sb.append("    isStateful: ").append(toIndentedString(isStateful)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceDate: ").append(toIndentedString(serviceDate)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startMode: ").append(toIndentedString(startMode)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    serviceRelationship: ").append(toIndentedString(serviceRelationship)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    supportingService: ").append(toIndentedString(supportingService)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

