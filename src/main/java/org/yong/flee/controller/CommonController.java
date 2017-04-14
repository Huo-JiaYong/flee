package org.yong.flee.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yong.flee.model.User;
import org.yong.flee.service.UserService;

@Controller
@RequestMapping("/common")
public class CommonController {

	@Autowired
	private UserService uService;

	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	// public String add(@RequestParam("name")String
	// name,@RequestParam("age")Integer age) {
	public String userRegist(HttpSession session, User user, Model model) {

		if (uService.add(user)) {
			session.setAttribute("user", user);
			return "redirect:/user/center";
		} else {
			return "error";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goUserLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(HttpSession session, User user) {
		if (uService.userLogin(user) != null) {
			session.setAttribute("user", user);
			return "redirect:/user/center";
		}

		return "error";
	}

	@RequestMapping("/index")
	public String center() {
		return "index";
	}

	@RequestMapping("/throw")
	public String error() {
		throw new RuntimeException("this is my exception");
	}

}
