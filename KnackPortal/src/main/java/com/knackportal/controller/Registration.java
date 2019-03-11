package com.knackportal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.knackportal.dao.impl.EmployeeDaoImpl;
import com.knackportal.model.EmployeeDetails;



@Controller
public class Registration {
	
	@Autowired
	public EmployeeDaoImpl empDaoImp;
	
	
	@RequestMapping(value="/Registration")
	public ModelAndView Registration() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registration");
		return mv;
		
	}
	
	@RequestMapping(value = "/Register")
	public ModelAndView Create(@ModelAttribute("Emp") EmployeeDetails emp) {
		empDaoImp.create(emp.getId(), emp.getName(), emp.getMobilenumber(),emp.getAddress(),
				emp.getDepartment(), emp.getPassword(),emp.getRole());
		ModelAndView mv = new ModelAndView("Sucessful");
		return mv;

	}
	
	
}
