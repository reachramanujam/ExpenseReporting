package com.practice.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping(value ="/showMessage.html")
	public ModelAndView home()
	{
		ModelAndView model = new ModelAndView("showMessage");
		Map<String, Object> map = model.getModel();
		map.put("message", "Hello world from Spring Web MVC");
		
		return model;
		
		//return "showMessage";
		
		
	}
}
