package com.habile.backend.model;

public class Vage {
	
	private boolean isMandatory;
	private int minInclusive;
	private int maxInclusive;
	
	public Vage() {
		
	}
	public Vage(boolean isMandatory, int minInclusive, int maxInclusive) {
		super();
		this.isMandatory = isMandatory;
		this.minInclusive = minInclusive;
		this.maxInclusive = maxInclusive;
	}
	public boolean isMandatory() {
		return isMandatory;
	}
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public int getMinInclusive() {
		return minInclusive;
	}
	public void setMinInclusive(int minInclusive) {
		this.minInclusive = minInclusive;
	}
	public int getMaxInclusive() {
		return maxInclusive;
	}
	public void setMaxInclusive(int maxInclusive) {
		this.maxInclusive = maxInclusive;
	}
	

}
