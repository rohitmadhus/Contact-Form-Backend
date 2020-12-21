package com.habile.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	/** if using id 
	@id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	**/
	@Id
	@Column(name= "name")
	private String name;
	@Column(name= "age")
	private int age;
	@Column(name= "city")
	private String city;
	
	public User() {
		
	}
	
	public User(String name, int age, String cities) {
		super();
		this.name = name;
		this.age = age;
		this.city = cities;
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
	public String getCities() {
		return city;
	}
	public void setCities(String city) {
		this.city = city;
	}

}
