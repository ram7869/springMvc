package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.dto.Employee;

@Controller
public class EmployeeController {
	
	
	@RequestMapping("/show")
	public ModelAndView showEmployee(){
		ModelAndView m= new ModelAndView();
		Employee employee= new Employee(109,"ram", 90000);
		m.addObject("emp",employee);
		m.setViewName("emp");
		return m;
	}

}
