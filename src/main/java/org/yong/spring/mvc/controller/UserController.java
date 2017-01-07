package org.yong.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yong.spring.mvc.model.User;
import org.yong.spring.mvc.service.UserService;
import org.yong.spring.mvc.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService uService;

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value = "/goRegist", method = RequestMethod.GET)
	public String goAdd() {
		return "index";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	// public String add(@RequestParam("name")String name,@RequestParam("age")Integer age) {
	public String add(User user,Model model) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		model.addAttribute("user",user);
		uService.add();
		userServiceImpl.add(user);
		//return "redirect:/user/goRegist";
		return "result";
	}

	@RequestMapping("/index")
	public String center(){
		return "index";
	}
	
	@RequestMapping("/throw")
	public String error(){
		throw new RuntimeException("this is my exception");
	}
	
}
