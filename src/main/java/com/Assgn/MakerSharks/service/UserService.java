package com.Assgn.MakerSharks.service;

import java.util.List;

import com.Assgn.MakerSharks.entity.User;

public interface UserService {

	public User createUser(User user);
	public User getUserById(Integer id);
	public User findByUsername(String username); 
	public List<User> getAllUsers();
}
