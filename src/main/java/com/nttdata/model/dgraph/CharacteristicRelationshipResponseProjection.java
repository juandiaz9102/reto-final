package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CharacteristicRelationship
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-04-29T14:50:48-0500"
)
public class CharacteristicRelationshipResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CharacteristicRelationshipResponseProjection() {
    }

    public CharacteristicRelationshipResponseProjection all$() {
        return all$(3);
    }

    public CharacteristicRelationshipResponseProjection all$(int maxDepth) {
        this.id();
        this.relationshipType();
        this.typename();
        return this;
    }

    public CharacteristicRelationshipResponseProjection id() {
        return id(null);
    }

    public CharacteristicRelationshipResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CharacteristicRelationshipResponseProjection relationshipType() {
        return relationshipType(null);
    }

    public CharacteristicRelationshipResponseProjection relationshipType(String alias) {
        fields.add(new GraphQLResponseField("relationshipType").alias(alias));
        return this;
    }

    public CharacteristicRelationshipResponseProjection typename() {
        return typename(null);
    }

    public CharacteristicRelationshipResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
