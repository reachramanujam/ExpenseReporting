package com.practice.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.dao.ExpenseType;
import com.practice.spring.dao.ExpenseTypeDao;

@Service("ExpenseTypeService")
public class ExpenseTypeService 
{
	@Autowired
	private ExpenseTypeDao expenseTypeDao;

	public void setExpenseTypeDao(ExpenseTypeDao expenseTypeDao) {
		this.expenseTypeDao = expenseTypeDao;
	}

	public List<ExpenseType> fetchAll()
	{
		return expenseTypeDao.fetchAll();
	}
	
	public void create(ExpenseType expenseType)
	{
		expenseTypeDao.add(expenseType);
	}
	
}
