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
import com.knackportal.model.LoginBean;

@Controller
public class Login {

	@Autowired
	public EmployeeDaoImpl empDaoImp;

	@RequestMapping(value = "/loginview")
	public ModelAndView Registration() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;

	}

	@RequestMapping(value = "/login1")
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") LoginBean login) {

		ModelAndView mv = new ModelAndView();

		// System.out.println();
		EmployeeDetails emp = empDaoImp.checkLogin(login.getId(), login.getPassword());
		Integer eid = emp.getId();// database
		String epsd = emp.getPassword();// database
		Integer neid = login.getId();// user entered
		String npsd = login.getPassword();// user entered
		if (eid.equals(neid) && (epsd.equals(npsd))) {
			mv.addObject("emp", emp);
			mv.setViewName("dashboard");
			return mv;
		} else {
			mv.setViewName("loginview");
			return mv;
		}

	}

	@RequestMapping(value = "/Sucessful")
	public ModelAndView Sucessful() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Sucessful");
		return mv;

	}

}
