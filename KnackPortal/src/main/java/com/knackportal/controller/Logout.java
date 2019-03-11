package com.knackportal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logout {

	@RequestMapping("/logout")
    public ModelAndView logout(HttpSession session ) {
    ModelAndView mv=new ModelAndView();
       session.invalidate();
       mv.setViewName("login");
       return mv;
    }
}
