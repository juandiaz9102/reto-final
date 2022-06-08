package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

public class ResponseProjectionWrapper<T> extends GraphQLResponseProjection {

    public T responseProjection(String responseField, String alias, Object responseProjection) {
        fields.add(new GraphQLResponseField(responseField).alias(alias).projection((GraphQLResponseProjection) responseProjection));
        return (T) this;
    }

}
