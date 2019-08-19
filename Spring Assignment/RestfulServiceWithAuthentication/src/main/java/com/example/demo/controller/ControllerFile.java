package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HystrixBasedService;


@RestController
public class ControllerFile {
	
	@Autowired
	private HystrixBasedService service;
	
	@GetMapping("/message")
	public String userAuthentication(){
		return this.service.displayMessage();
	}
}
