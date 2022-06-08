package com.nttdata.model.dgraph;

public enum Operation {

	CANCEL("Cancel"), 
	POSTPONEMENT("Postponement"), 
	SERVICEORDER("Create"),
	UPDATERESOURCE("UpdateResource");

	private String value;

	Operation(String envUrl) {
		this.value = envUrl;
	}

	public String val() {
		return value;
	}

}
