package com.springmicroservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class SampleApiController {
	
	private Logger logger = LoggerFactory.getLogger(SampleApiController.class);
	@GetMapping("/sample-api")
	@Retry(name = "sample-api", fallbackMethod="hardCodedResponse")
	public String getSampleApi() {
		logger.info("Sample API call recieved");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
		return forEntity.getBody();
	}
	
	public String hardCodedResponse(Exception ex) {
		return "fallback-response";
	}

}
