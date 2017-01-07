package org.yong.spring.mvc.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public boolean add() {
		System.out.println("ADD function");
		return true;
	}

	public boolean delete() {
		System.out.println("DELETE function");
		return true;
	}
}
