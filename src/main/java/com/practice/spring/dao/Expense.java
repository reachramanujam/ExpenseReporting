package com.practice.spring.dao;

import java.util.Date;


public class Expense 
{
	private int id;
	private String name;
	private String description;
	private Float amount;
	private Date dateOcurred;
	private int day;
	private int month;
	private int year;
	private int expenseType;
	
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
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Date getDateOcurred() {
		return dateOcurred;
	}
	public void setDateOcurred(Date dateOcurred) {
		this.dateOcurred = dateOcurred;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(int expenseType) {
		this.expenseType = expenseType;
	}
	
	
	
	
}
