package com.nttdata.model.dgraph;

import java.util.StringJoiner;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subscriber {
	
	
	private String id;
	private String callback;
	private String topic;
	
	
	 @Override
	    public String toString() {
	        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
	        if (id != null) {
	            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
	        }
	        if (callback != null) {
	            joiner.add("callback: " + GraphQLRequestSerializer.getEntry(callback));
	        }
	      
	        if (topic != null) {
	            joiner.add("topic: " + GraphQLRequestSerializer.getEntry(topic));
	        }
	        return joiner.toString();
	    }

}
