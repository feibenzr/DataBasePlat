package com.unionpay.nx.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.code.Trigger;
import com.unionpay.nx.controller.DisplayMsg;
import com.unionpay.nx.entity.User;
import com.unionpay.nx.services.EChartTest;
import com.unionpay.nx.services.MyService;

@ContextConfiguration(locations = { "classpath:application.xml" })  
@RunWith(SpringJUnit4ClassRunner.class)

public class Mytest {
	private static Logger logger = Logger.getLogger(Mytest.class);
	
	@Autowired 
	private MyService myService;
	  
	@Autowired 
	private EChartTest eChartTest;
	  
	@Test
	public void test(){
		logger.info("*********something useful output!!");
		System.out.print(myService.getUser(1));
	}
	
	@Test
	public void testGetAll(){
		logger.info("*********something useful output!!");
		List<User> list = myService.getAllUser();
		for(int i = 0; i < list.size(); i++)
		System.out.println(list.get(i).getName()+"---"+list.get(i).getAge());
	}
	 
	@Test
	public void testEChart(){
		logger.info("*********test EChart");
		Option option = eChartTest.test();
		System.out.println(option);
	}
	@Test
	public void testUpload() throws ParseException{
		logger.info("*********test Upload");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");  
	    String date = null;
		String time1 = "2017-01-01";
		date = sdf.format(time1);
		System.out.println("*************"+date);
	}
}
