package com.practice.spring.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.spring.dao.ExpenseType;
import com.practice.spring.service.ExpenseTypeService;

@Controller
public class ExpenseTypeController
{
	@Autowired
	private ExpenseTypeService expenseTypeService;
	
	public void setExpenseTypeService(ExpenseTypeService expenseTypeService) {
		this.expenseTypeService = expenseTypeService;
	}

	@RequestMapping(value="/expensetypelist", method=RequestMethod.GET)
	public String showExpenseType(Model model){
		List<ExpenseType> expenseTypeList = expenseTypeService.fetchAll();
		model.addAttribute("expenseTypeList", expenseTypeList);
		return "expensetypelist";
	}
	
	@RequestMapping("/createexpensetype")
	public String createExpenseType(Model model){
		model.addAttribute("expenseType", new ExpenseType());
		return "createexpensetype";
	}
	
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid ExpenseType expenseType, BindingResult result){
		if(result.hasErrors()) {			
			/*System.out.println("Form doesn't validated");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error : errors)
			{
				System.out.println(error);
			}*/
			return "createexpensetype";
		}		
		else
			System.out.println(expenseType);
		this.expenseTypeService.create(expenseType);
		
		return "expensetypelist";
	}
}
