package com.example.demo.controller;


	


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

	
	@RestController
	@RequestMapping("/sr")

		public class CustomerController {
		
		@Autowired
		private CustomerService service;
		@PostMapping("/addCustomer")
		public Customer addCustomer(@RequestBody Customer customer) {
			return service.saveCustomer(customer);
		}
		
			
		
		@PostMapping("/addCustomers")
		public List <Customer> addCustomers(@RequestBody List<Customer> Customers){
			return service.saveCustomers(Customers);
		}
		@GetMapping("/Customers")
		public List<Customer> findallCustomers(){
			return service.getCustomers();
		}
		
		
		@GetMapping("/CustomerById/{id}")
		public Customer findCustomerById(@PathVariable int id) {
			return service.getCustomerById(id);
		}
		
		@GetMapping("/Customer/{name}")
		public Customer findCustomerByName(@PathVariable String name) {
			return service.getCustomerByName(name);
		}
		
		@PutMapping("/update")
		public Customer updateCustomer(@RequestBody Customer Customer) {
			return service.updateCustomer(Customer);
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteCustomer(@PathVariable int id) {
			return service.deleteCustomer(id);
			
		}
		
		
		
		

	}



