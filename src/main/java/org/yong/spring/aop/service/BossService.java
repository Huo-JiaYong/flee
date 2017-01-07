package org.yong.spring.aop.service;

import org.springframework.stereotype.Component;

@Component
public class BossService {

	public boolean login() {
		// 验证用户信息
		System.out.println("Vaild...");
		// 确认登陆
		System.out.println("Successful");
		return true;
	}
}
