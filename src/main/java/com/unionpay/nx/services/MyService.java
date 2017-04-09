package com.unionpay.nx.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unionpay.nx.dao.UserMapper;
import com.unionpay.nx.entity.User;

@Service 
public class MyService {

//	public static MyService myService;
	@Autowired 
	private UserMapper userMapper;
	
//	//spring初始化  
//    @PostConstruct 
//    public void init(){
//    	myService = this;
//    	myService.userMapper = this.userMapper;
//    }
//	
	public String getUser(int i){
		User user = userMapper.selectByPrimaryKey(i);
		return user.toString();
	}
	
	public List<User> getAllUser(){
		List<User> list = userMapper.getAllUser();
		return list;
	}
}
