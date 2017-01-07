package org.yong.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yong.spring.mvc.dao.UserMapper;
import org.yong.spring.mvc.model.User;

@Service
public class UserServiceImpl {

	@Autowired
	private UserMapper mapper;
	
	public boolean add(User user) {
		mapper.add(user);
		return true;
	}
	
}
