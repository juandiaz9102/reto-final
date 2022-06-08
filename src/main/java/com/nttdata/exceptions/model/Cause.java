package com.nttdata.exceptions.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cause {
	
	private String code;
	private String description;
	

}
