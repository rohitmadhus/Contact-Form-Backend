package com.habile.backend.model;

public class Vname {
	
	private boolean isMandatory;
	private String stringType;
	public Vname() {
		
	}
	public Vname(boolean isMandatory, String stringType) {
		this.isMandatory = isMandatory;
		this.stringType = stringType;
	}
	public boolean isMandatory() {
		return isMandatory;
	}
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public String getStringType() {
		return stringType;
	}
	public void setStringType(String stringType) {
		this.stringType = stringType;
	}
	
	


}
