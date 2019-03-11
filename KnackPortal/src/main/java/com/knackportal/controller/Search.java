package com.knackportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.knackportal.dao.impl.EmployeeDaoImpl;
import com.knackportal.model.EmployeeDetails;

@Controller
public class Search {

	@Autowired
	public EmployeeDaoImpl empDaoImp;

	@RequestMapping(value = "/search")
	public ModelAndView finder(@RequestParam("emp") String emp) {
		List<EmployeeDetails> emp1 = (List<EmployeeDetails>) empDaoImp.getEmp(emp); 
		ModelAndView mv = new ModelAndView();
		mv.addObject("emp", emp1);
		mv.setViewName("search");
		return mv;
	}
}