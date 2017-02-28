package com.unionpay.nx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unionpay.nx.services.MyService;

@Controller
@RequestMapping("/user")
public class DisplayMsg {
	@Autowired
	private MyService myService;
	
	@RequestMapping("/showInfo")
	public String showUser(){
		String name = myService.getUser(1);
		return name;
	}
	

}
