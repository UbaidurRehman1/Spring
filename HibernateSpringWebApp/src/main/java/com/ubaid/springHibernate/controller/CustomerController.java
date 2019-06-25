package com.ubaid.springHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ubaid.springHibernate.entity.Customer;
import com.ubaid.springHibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController
{

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/list")
	public String showList(Model model)
	{
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "customer-list";
	}
}
