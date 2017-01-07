package org.yong.spring.aop.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yong.spring.aop.service.BossService;

@Controller
public class SmartBoss {

	@Autowired
	private BossService uService;

	@RequestMapping("/boss")
	public String login() {
		uService.login();
		return "result";
	}
	
}
