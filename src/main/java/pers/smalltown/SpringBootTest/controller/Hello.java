package pers.smalltown.SpringBootTest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.smalltown.SpringBootTest.model.User;
import pers.smalltown.SpringBootTest.service.UserService;

@Controller

public class Hello {
	Logger log = LoggerFactory.getLogger(Hello.class);
	@Autowired
	UserService userService;
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public @ResponseBody String index() {
		System.out.println("index...");
		List<User> result = userService.findAll();
		System.out.println(result);
//		return "index...hello"+result;
		return "hello_page";
	}
	
	@RequestMapping(value="/")
	public String defaultMethod() {
		log.info("default method");
		return "hello_page";
	}
}
