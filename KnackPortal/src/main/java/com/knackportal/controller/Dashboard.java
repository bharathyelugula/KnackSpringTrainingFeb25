package com.knackportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Dashboard {
	
	@RequestMapping(value="/dashboard")
	private ModelAndView View() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Dashboard");
		return mv;
		

	}

}
