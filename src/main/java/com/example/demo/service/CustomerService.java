package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
	public class CustomerService { 
		@Autowired
		private CustomerRepository repository;
		
		public Customer saveCustomer(Customer customer) {
			return repository.save(customer);
		}

		public List<Customer> saveCustomers(List<Customer> Customers){
			return repository.saveAll(Customers);
		}
		
		public List<Customer> getCustomers(){
			return repository.findAll();
		}
		
		public Customer getCustomerById(int id){
			return repository.findById(id).orElse(null);
		}
		
		public Customer getCustomerByName(String name) {
			return repository.findByName(name);
		}
		
		public String deleteCustomer(int id) {
			repository.deleteById(id);
			return "Customer removed from table" +id;
		}
		
		public Customer updateCustomer(Customer Customer) {
			Customer existingCustomer=repository.findById(Customer.getId()).orElse(Customer);
			existingCustomer.setName(Customer.getName());
			existingCustomer.setGender(Customer.getGender());
			existingCustomer.setAge(Customer.getAge());
			return repository.save(existingCustomer);
			
		}
		
		
	}



