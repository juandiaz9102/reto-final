package com.nttdata.exceptions.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorWrapper {
	
	
	private com.nttdata.exceptions.model.Error error;

}
