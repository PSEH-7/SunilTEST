package com.sapient.weatherforcasting.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateClient {

	@Bean
	public RestTemplate restClient() {
		return new RestTemplate();
	}
}
