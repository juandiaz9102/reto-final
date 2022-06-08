package com.nttdata.interceptor;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RestTemplateAuthInterceptor implements ClientHttpRequestInterceptor{ 
	
	@Autowired
	AuthRequestInterceptor authRequestInterceptor;
	
	@Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
		
		ClientHttpResponse response = null;
		
		try {
			
			if(request.getHeaders().getValuesAsList("Authorization").isEmpty()) {
				request.getHeaders().add(AuthRequestInterceptor.AUTHORIZATION_HEADER, authRequestInterceptor.addAutHeader());
			}
		}catch(Exception e) {
			log.error("Interceptor RestTemplate failed, >> {}", e);
		}finally {

			response = execution.execute(request, body);
			
		}
        
        
        return response;
    }

}
