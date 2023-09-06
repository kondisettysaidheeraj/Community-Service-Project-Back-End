package com.dheeraj.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dheeraj.Spring.Entity.User;
import com.dheeraj.Spring.Service.UserService;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/signup")
	
	public User singup(@RequestBody User user)
	{
		
		return userService.singup(user);
	}
	
	@GetMapping("/login")
	public boolean login(@RequestParam String email,@RequestParam String password)
	{
		return userService.login(email,password);
		
	}
}
