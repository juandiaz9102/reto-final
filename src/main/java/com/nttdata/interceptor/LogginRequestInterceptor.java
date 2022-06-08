package com.nttdata.interceptor;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Slf4j
public class LogginRequestInterceptor implements Interceptor {
	
	private final ObjectMapper objectMapper= new ObjectMapper();

	@Override
	public Response intercept(Chain chain) throws IOException {

		Request request = chain.request();

		try {

			log.info("Intercepted headers: {} from URL: {}", request.headers(), request.url());

			if (null != request.body())
				log.info("Intercepted payload: {} from URL: {}", request.body(),request.url());

		} catch (Exception e) {
			log.error("Interceptor loggin failed {}", e);
		}
		return chain.proceed(request);
	}

}
