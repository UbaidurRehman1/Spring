package com.ubaid.springHibernate.service;

import java.util.List;

import com.ubaid.springHibernate.entity.Customer;

public interface CustomerService
{
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int id);
	public void deleteCustomer(int customerId);
}