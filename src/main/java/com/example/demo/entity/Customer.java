package com.example.demo.entity;


	
	

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name= "customer_data_tbl")
	public class Customer {
	
		public Customer() {
			
		}
		

		@Id

		private int id;
		
		private int age;
		private String gender;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		

	}

	


