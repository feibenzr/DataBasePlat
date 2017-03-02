package com.unionpay.nx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unionpay.nx.services.MyService;

@Controller
@RequestMapping("/view")
public class DisplayMsg {
	@Autowired
	private MyService myService;
	
	@RequestMapping("/showInfo")
	public ModelAndView  showUser(){
		String name = myService.getUser(1);
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "showInfo" ); 
	       modelAndView.addObject("name",name);  
	       return modelAndView;  
	}
	

}
