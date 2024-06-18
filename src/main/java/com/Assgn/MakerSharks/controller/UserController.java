package com.Assgn.MakerSharks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assgn.MakerSharks.entity.User;
import com.Assgn.MakerSharks.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<User> getUserByUserId(@PathVariable Integer id){
		User user = userService.getUserById(id);
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/fetch/name/{username}")
	public ResponseEntity<User> getUserByUserId(@PathVariable String username){
		User user = userService.findByUsername(username);
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/fetch")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	

}
