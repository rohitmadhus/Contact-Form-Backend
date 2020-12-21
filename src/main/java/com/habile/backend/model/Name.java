package com.habile.backend.model;

public class Name {
	
	private String name;
	private String id;
	private String type;
	private Vname vname;
	
	public Name() {
		
	}
	public Name(String name, String id, String type, Vname vname) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.vname = vname;
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
	public Vname getVname() {
		return vname;
	}
	public void setVname(Vname vname) {
		this.vname = vname;
	}
}
