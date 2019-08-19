package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrixDashboard
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class RestfulServiceWithAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulServiceWithAuthenticationApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}
