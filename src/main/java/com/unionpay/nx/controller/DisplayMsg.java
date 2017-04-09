package com.unionpay.nx.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.json.GsonUtil;
import com.unionpay.nx.entity.User;
import com.unionpay.nx.services.EChartTest;
import com.unionpay.nx.services.MyService;

@Controller
@RequestMapping("/v1")
public class DisplayMsg {
	private static Logger logger = Logger.getLogger(DisplayMsg.class);
	
	@Autowired
	private MyService myService;
	
	@Autowired 
	private EChartTest eChartTest;
	
	//首页
	@RequestMapping("/main")
	public ModelAndView showMain(){
		logger.info("only for display !!!");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "main" ); 
	       return modelAndView;  
	}
	
	//年度指标
	@RequestMapping("/index1")
	public ModelAndView showIndex(){
		logger.info("only for display !!!");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "index1" ); 
	       return modelAndView;  
	}
	
	@RequestMapping("/showInfo")
	public ModelAndView showUser(){
		logger.info("only for test1 !!!");
		List<User> list = myService.getAllUser();
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "showInfo" ); 
	       modelAndView.addObject("list",list);  
	       return modelAndView;  
	}
	@RequestMapping("/uploadfile")
	public ModelAndView uploadfile(){
		logger.info("only for test2 !!!");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "upload" ); 
	       return modelAndView;  
	}
	
	//重要通知
	@RequestMapping("/message")
	public ModelAndView message(){
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "message" ); 
	       return modelAndView;  
	} 
	
	@RequestMapping("/eChart")
	public ModelAndView getEchart(){
		logger.info("only for EChart !!!");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName( "test" ); 
	       return modelAndView;  
	}
	

}
