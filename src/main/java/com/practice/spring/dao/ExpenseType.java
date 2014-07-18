package com.practice.spring.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class ExpenseType {

	private int id;	
	
	@NotEmpty(message="ExpenseType name should not be empty")
	private String name;
	@Size(min=5, max=100, message="Should be betweeb 3 and 100 characters")
	private String description;	
	
	public ExpenseType() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public ExpenseType(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}



	public ExpenseType(String name, String description) {		
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "ExpenseType [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
