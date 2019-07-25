package com.ubaid.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubaid.app.entity.Customer;
import com.ubaid.app.rest.exception.CustomerNotFoundException;
import com.ubaid.app.service.CustomerServiceI;

@RestController
@RequestMapping("/api")
public class CustomerRestController
{
	@Autowired
	@Qualifier("customerServiceImp")
	CustomerServiceI custSer;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return custSer.getCustomers();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId)
	{
		Customer customer = custSer.getCustomer(customerId);
		if(customer == null)
			throw new CustomerNotFoundException("The customer of id " + customerId + " is not found");
		return custSer.getCustomer(customerId);
	}
	
	public Customer addCustomer()
	{
		
		return null;
	}
}
