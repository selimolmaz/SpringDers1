package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.User;
@RestController
@RequestMapping(path = "/testBodyRequest")
public class RequestBody {
	// kullanıcıdan obje alabildiğimiz bir yapı olacak
	@PostMapping(path = "/user")
	public User saveUser(@org.springframework.web.bind.annotation.RequestBody User user) {
		System.out.println(user.getName());
		user.setPassword("");
		return user;
	}
	
	@PostMapping(path = "/users")
	public List<User> saveAllUser(@org.springframework.web.bind.annotation.RequestBody List<User> users) {
		
		users.forEach(user -> user.setPassword(""));
		return users;
	}
}
