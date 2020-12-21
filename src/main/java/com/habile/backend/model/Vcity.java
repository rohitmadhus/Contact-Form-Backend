package com.habile.backend.model;

public class Vcity {
	private boolean isMandatory;
	private boolean isMultiSelection;
	public Vcity() {
		
	}
	public Vcity(boolean isMandatory, boolean isMultiSelection) {
		super();
		this.isMandatory = isMandatory;
		this.isMultiSelection = isMultiSelection;
	}
	public boolean isMandatory() {
		return isMandatory;
	}
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public boolean isMultiSelection() {
		return isMultiSelection;
	}
	public void setMultiSelection(boolean isMultiSelection) {
		this.isMultiSelection = isMultiSelection;
	}

}
