package com.habile.backend.model;

import java.util.List;

public class ContactUs {
	
	private String name;
	private int age;
	private List<String> cities;
	public ContactUs(String name, int age, List<String> cities) {
		super();
		this.name = name;
		this.age = age;
		this.cities = cities;
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
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	

}
