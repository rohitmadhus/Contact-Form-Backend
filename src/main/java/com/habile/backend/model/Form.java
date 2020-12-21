package com.habile.backend.model;

public class Form {
	
	private String name;
	private Name nameObj;
	private Age age;
	private City city;
	
	public Form() {
		
	}
	public Form(String name, Name nameObj, Age age, City city) {
		super();
		this.name = name;
		this.nameObj = nameObj;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Name getNameObj() {
		return nameObj;
	}
	public void setNameObj(Name nameObj) {
		this.nameObj = nameObj;
	}
	public Age getAge() {
		return age;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	

}
