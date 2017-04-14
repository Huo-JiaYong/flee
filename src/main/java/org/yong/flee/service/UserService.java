package org.yong.flee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yong.flee.dao.UserMapper;
import org.yong.flee.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	/**
	 * 新增用户
	 * @param user 用户信息
	 * @return 
	 */
	public boolean add(User user) {
		mapper.add(user);
		return true;
	}

	/**
	 * 根据手机和密码获取用户
	 * @param user 用户信息
	 * @return
	 */
	public User userLogin(User user){
		return mapper.getUserByTelAndPassword(user);
	}
	
}
