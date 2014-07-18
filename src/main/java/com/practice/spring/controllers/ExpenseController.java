package com.practice.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.spring.dao.Expense;
import com.practice.spring.dao.ExpenseType;
import com.practice.spring.service.ExpenseTypeService;

@Controller
public class ExpenseController {

	@Autowired
	private ExpenseTypeService expenseTypeService;
	
	@RequestMapping(value="/addexpense", method=RequestMethod.GET)
	public String addExpense(Model model){
		model.addAttribute("expense", new Expense());
		//Fetch the ExpenseType avaliable in the system
		//List<ExpenseType> expenseTypeList = expenseTypeService.fetchAll();
		//model.addAttribute("expenseTypeList", expenseTypeList);
		//Dispatch me to the view
		return "addexpense";
	}
	
	
	@RequestMapping(value="/expense/docreate", method=RequestMethod.POST)
	public String doCreate(Model model){
		return null;
	}
	
}
