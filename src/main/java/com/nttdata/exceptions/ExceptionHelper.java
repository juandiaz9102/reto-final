package com.nttdata.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nttdata.exceptions.model.Cause;
import com.nttdata.exceptions.model.ErrorWrapper;

public class ExceptionHelper extends ResponseEntityExceptionHandler {

	private static final String TECHNICAL = "technical ";
	private static final String BUSINESS = "business";


	/**
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value = { NullPointerException.class })
	protected ResponseEntity<ErrorWrapper> handleNullPointerException(
			NullPointerException ex) {

		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();


		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/**
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value = { JsonProcessingException.class })
	protected ResponseEntity<ErrorWrapper> handleJsonProcessingException(
			JsonProcessingException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(value = { BadRequestException.class })
	protected ResponseEntity<ErrorWrapper> handleBadRequestException(BadRequestException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.BAD_REQUEST.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();	
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = { UnprocessableEntityException.class })
	protected ResponseEntity<ErrorWrapper> handleUnprocessableEntityException(
			UnprocessableEntityException ex) {
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.BAD_REQUEST.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();	
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = { HttpClientErrorException.class })
	protected ResponseEntity<ErrorWrapper> handleHttpClientErrorException(HttpClientErrorException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.NOT_FOUND.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();	
		
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = { ResourceAccessException.class })
	protected ResponseEntity<ErrorWrapper> handleResourceAccessException(ResourceAccessException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();	
		
		
	
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(value = { FileNotFoundException.class })
	protected ResponseEntity<ErrorWrapper> handleFileNotFoundException(FileNotFoundException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.NOT_FOUND.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = { IOException.class })
	protected ResponseEntity<ErrorWrapper> handleIOException(IOException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.NOT_FOUND.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
	
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = { InterruptedException.class })
	protected ResponseEntity<ErrorWrapper> handleInterruptedException(InterruptedException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(value = { NotFoundException.class })
	protected ResponseEntity<ErrorWrapper> handleNotFoundExceptionGraph(NotFoundException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.NOT_FOUND.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<ErrorWrapper> handleException(Exception ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(value = { KeyManagementException.class })
	protected ResponseEntity<ErrorWrapper> handleKeyManagementException(KeyManagementException ex) {
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
		
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(value = { KeyStoreException.class })
	protected ResponseEntity<ErrorWrapper> handleKeyStoreException(KeyStoreException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
	
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { NoSuchAlgorithmException.class })
	protected ResponseEntity<ErrorWrapper> handleNoSuchAlgorithmException(NoSuchAlgorithmException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
	
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	
	@ExceptionHandler(value = { ApplicationException.class })
	protected ResponseEntity<ErrorWrapper> handleNoSuchAlgorithmException(ApplicationException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),ex.getMessage()));
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
	
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	
	@ExceptionHandler(value = { BusinessException.class })
	protected ResponseEntity<ErrorWrapper> handleNoSuchAlgorithmException(BusinessException ex) {
		
		
		List<Cause> causes = new ArrayList<Cause>();
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),ex.getMessage()));
		causes.add(new Cause(HttpStatus.INTERNAL_SERVER_ERROR.name(),
				Arrays.toString(ex.getStackTrace())));
		
		com.nttdata.exceptions.model.Error err = com.nttdata.exceptions.model.Error.builder()
				.type(TECHNICAL)
				.message(ex.getClass().toString())
				.timestamp(LocalDateTime.now())
				.causes(causes).build();
		
	
		return new ResponseEntity<ErrorWrapper>(new ErrorWrapper(err), HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
