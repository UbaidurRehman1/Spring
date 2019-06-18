package com.ubaid.springMVC.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer
{
	private String firstName;
	
	@NotNull(message=" is required")
	@Size(min=1, message=" is required")
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
