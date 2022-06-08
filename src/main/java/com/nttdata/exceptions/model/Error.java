package com.nttdata.exceptions.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Error {
	
	private String type;
	private LocalDateTime timestamp;
	private String message;
	private List<Cause> causes;

}
