package org.yong.flee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yong.flee.model.User;
import org.yong.flee.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {


	@Autowired
	private UserService uService;
	
	@RequestMapping(value = "/goRegist", method = RequestMethod.GET)
	public String goAdd() {
		return "index";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	// public String add(@RequestParam("name")String name,@RequestParam("age")Integer age) {
	public String add(User user,Model model) {
		model.addAttribute("user",user);
		uService.add(user);
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
