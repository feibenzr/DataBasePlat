package com.unionpay.nx.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unionpay.nx.dao.UserMapper;
import com.unionpay.nx.entity.User;

@Service 
public class MyService {

	@Autowired 
	private UserMapper userMapper;
	
	public String getUser(int i){
		User user = userMapper.selectByPrimaryKey(i);
		return user.toString();
	}
}
