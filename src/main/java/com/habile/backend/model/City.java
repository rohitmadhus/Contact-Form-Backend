package com.habile.backend.model;

import java.util.List;

public class City {
	private String city;
	private String id;
	private String type;
	private List<String> values;
	private Vcity vcity;
	
	public City() {
		
	}
	public City(String city,String type, String id, List<String> values, Vcity vcity) {
		super();
		this.city = city;
		this.id = id;
		this.values = values;
		this.type = type;
		this.vcity = vcity;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	public Vcity getVcity() {
		return vcity;
	}
	public void setVcity(Vcity vcity) {
		this.vcity = vcity;
	}


}
