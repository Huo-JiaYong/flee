package org.yong.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yong.spring.mvc.dao.UserDao;

@Component
public class UserService {

	@Autowired
	private UserDao dao;

	public boolean add() {
		return dao.add();
	}

	public boolean delete() {
		return dao.delete();
	}

}
