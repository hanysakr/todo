package com.equitativa.assignment.model;

public enum StatusEnum {
	
	TODO(1), DONE(2);
	
	private int id;
	
	private StatusEnum(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
}
