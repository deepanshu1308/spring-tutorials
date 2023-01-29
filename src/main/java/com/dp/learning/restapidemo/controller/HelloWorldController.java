package com.dp.learning.restapidemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dp.learning.restapidemo.domain.User;
import com.dp.learning.restapidemo.service.UserService;

@RestController
@RequestMapping("/v1/api")
public class HelloWorldController {
	
	private UserService userService;
	
	@Autowired
	public HelloWorldController(UserService userService){
		this.userService = userService;
	}


	@GetMapping(value="/hello", produces="application/json")
	public String getGreetings() {
		return "hello world";
	}
	
	@GetMapping(value="/helloWithName/{name}", produces="application/json")
	public String getGreetingsWithName(@PathVariable("name") String name) {
		return "hello "+name;
	}
	
	@GetMapping(value="/helloWithName2", produces="application/json")
	public String getGreetingsWithRequestParamName(@RequestParam("fname") String firstName,
												@RequestParam("lname") String lastName) {
		return "hello "+firstName+ " "+ lastName;
	}
	
	@PostMapping(value="/addUser", consumes="application/json", produces="application/json")
	public User addUser(@RequestBody User user) {
		return userService.addUsers(user);
	}
	
}
