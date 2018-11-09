package com.tedu.controller;



import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView doGet(){
		
		return null;
	}
}
