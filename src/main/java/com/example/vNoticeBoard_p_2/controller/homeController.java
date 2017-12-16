package com.example.vNoticeBoard_p_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}

}
