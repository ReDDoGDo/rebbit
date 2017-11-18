package com.rubydbase.rebbit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseControl {
	
	private static final Logger logger = LoggerFactory.getLogger(BaseControl.class);
	
	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
	@RequestMapping("/signin")
	public String signin() {
		return "/signin";
	}
	
}
