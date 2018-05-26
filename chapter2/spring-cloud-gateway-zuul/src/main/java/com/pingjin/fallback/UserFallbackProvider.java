package com.pingjin.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackProvider implements ZuulFallbackProvider {

	@Override
	public ClientHttpResponse fallbackResponse() {
		return new ClientHttpResponse() {

			@Override
			public InputStream getBody() throws IOException {
				return new ByteArrayInputStream("spring-cloud-comsumer-movie-feign 微服务不可用,请稍后重试.".getBytes());
			}

			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
				MediaType mt = new MediaType("application", "json", Charset.forName("UTF-8"));
				headers.setContentType(mt);
				return headers;
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return this.getStatusCode().value();
			}

			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.OK;
			}

			@Override
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return this.getStatusCode().getReasonPhrase();
			}
			
		};
	}

	@Override
	public String getRoute() {
		return "spring-cloud-comsumer-movie-feign";
	}

}
