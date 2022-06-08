package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import com.nttdata.exceptions.ApplicationException;
import com.nttdata.utils.Utils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.StringJoiner;

@Service
public class PatchMutationRequest<T> {

    public String genericUpdate(T request,boolean filterEquals,String nameId, String id, String alias, String operation, GraphQLResponseProjection responseProjection) {
        String strResponse = null;
        String idToSave = GraphQLRequestSerializer.getEntry(id);
        StringBuilder sb = new StringBuilder(idToSave);
        sb.deleteCharAt(idToSave.length() - 1);
        sb.deleteCharAt(0);

        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setEquals(filterEquals);
        filterRequest.setNameId(nameId);
        filterRequest.setId(sb.toString());
        filterRequest.setRequest(request.toString());


        ResponseProjectionWrapper responseProjectionWrapper =
                (ResponseProjectionWrapper) new ResponseProjectionWrapper().responseProjection(alias, alias, responseProjection);

        ServiceMutationRequest patchRequest = new ServiceMutationRequest();
        patchRequest.setOperationName(operation);
        patchRequest.setAlias(operation);
        patchRequest.setInput(filterRequest);

        GraphQLRequest graphQLRequest = new GraphQLRequest(patchRequest, responseProjectionWrapper);

        strResponse = Utils.buildQuery(graphQLRequest);

        return strResponse;
    }

}
