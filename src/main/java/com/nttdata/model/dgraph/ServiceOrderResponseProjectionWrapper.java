package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;


public class ServiceOrderResponseProjectionWrapper extends GraphQLResponseProjection {

	public ServiceOrderResponseProjectionWrapper serviceOrder(String alias, ServiceOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceOrder").alias(alias).projection(subProjection));
        return this;
    }
	
}
