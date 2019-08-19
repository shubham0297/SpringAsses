package com.training.model;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDetails {
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String pass;
	
	@org.hibernate.validator.constraints.Email
	private String email;
	
}
