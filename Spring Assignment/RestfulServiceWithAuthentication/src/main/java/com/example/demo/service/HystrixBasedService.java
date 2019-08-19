package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Repository
public class HystrixBasedService {

	@Autowired
	private RestTemplate template;
	
	@HystrixCommand(fallbackMethod = "myCallBack")
	public String displayMessage() {
		return "Valid User";
	}
	
	public String myCallBack() {
		return "Invalid User";
	}
}
