package com.jichengyue.foodsafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jichengyue.foodsafe.pojo.User;
import com.jichengyue.foodsafe.service.impl.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/index")
	public String index(Model model){
		List<User> userList = homeService.getAllUser();
		model.addAttribute(userList);
		return "/home/index";
	}
}
