package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello(){
		ModelAndView m = new ModelAndView();
		m.setViewName("hello");
		m.addObject("id", 101);
		m.addObject("name","balram");
		m.addObject("salary", 92000);
		return m;
	}

}
