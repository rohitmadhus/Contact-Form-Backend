package com.habile.backend.model;

public class Age {
	
	private String name;
	private String id;
	private String type;
	private Vage vage;
	
	public Age() {
		
	}
	
	public Age(String name, String id, String type, Vage vage) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.vage = vage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Vage getVage() {
		return vage;
	}
	public void setVage(Vage vage) {
		this.vage = vage;
	}
	


}
