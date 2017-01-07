package org.yong.flee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yong.flee.dao.UserMapper;
import org.yong.flee.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public boolean add(User user) {
		mapper.add(user);
		return true;
	}
	
}
