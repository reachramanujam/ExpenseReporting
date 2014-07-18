package com.practice.spring.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDaoTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/spring/beans/beans.xml");
		ExpenseTypeDao expenseTypeDAO = (ExpenseTypeDao)context.getBean("expenseTypeDAO");
		
		//ExpenseType addExpenseType = new ExpenseType("Movie", "Expense Incurred on Movie");
		
		//expenseTypeDAO.add(addExpenseType);
		
		//ExpenseType addExpenseType = new ExpenseType(2, "Dinning", "Expense Incurred on Restaurants");
		
		//expenseTypeDAO.update(addExpenseType);
		
		
		List<ExpenseType> expenseTypeList = expenseTypeDAO.fetchAll();
		
		for(ExpenseType expenseType : expenseTypeList)
		{
			System.out.println(expenseType);
		}
		
		
		ExpenseType expenseType = expenseTypeDAO.fetchById(1);
		System.out.println(expenseType);
		
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
