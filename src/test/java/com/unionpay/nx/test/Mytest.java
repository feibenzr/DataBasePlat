package com.unionpay.nx.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unionpay.nx.services.MyService;

@ContextConfiguration(locations = { "classpath:application.xml" })  
@RunWith(SpringJUnit4ClassRunner.class)

public class Mytest {
	@Autowired 
	private MyService myService;
	
	@Test
	public void test(){
		System.out.print(myService.getUser(3));
	}
}
