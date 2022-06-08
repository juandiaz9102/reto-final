package com.nttdata.model.dgraph;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.nttdata.model.tmf.ServiceOrder;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class ServiceOrderQueryRequest implements GraphQLOperationRequest {

	public static final String OPERATION_NAME = "queryServiceOrder";
	public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

	private String alias;
	private final Map<String, Object> input = new LinkedHashMap<>();
	private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

	public ServiceOrderQueryRequest() {
	}

	public ServiceOrderQueryRequest(String alias) {
		this.alias = alias;
	}

	public void setInput(ServiceOrder episode) {
		this.input.put("filter", episode);
	}

	@Override
	public GraphQLOperation getOperationType() {
		return OPERATION_TYPE;
	}

	@Override
	public String getOperationName() {
		return OPERATION_NAME;
	}

	@Override
	public String getAlias() {
		return alias != null ? alias : OPERATION_NAME;
	}

	@Override
	public Map<String, Object> getInput() {
		return input;
	}

	@Override
	public Set<String> getUseObjectMapperForInputSerialization() {
		return useObjectMapperForInputSerialization;
	}

	@Override
	public String toString() {
		return Objects.toString(input);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private String $alias;
		private ServiceOrder episode;

		public Builder() {
		}

		public Builder alias(String alias) {
			this.$alias = alias;
			return this;
		}

		public Builder setEpisode(ServiceOrder episode) {
			this.episode = episode;
			return this;
		}

		public ServiceOrderQueryRequest build() {
			ServiceOrderQueryRequest obj = new ServiceOrderQueryRequest($alias);
			obj.setInput(episode);
			return obj;
		}

	}
}
