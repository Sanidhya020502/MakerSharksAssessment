package com.Assgn.MakerSharks.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assgn.MakerSharks.entity.User;
import com.Assgn.MakerSharks.repository.UserRepository;
import com.Assgn.MakerSharks.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserRepository userRepo;
	
	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		return userRepo.findById(id).orElse(null);
	}


	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<>();
		for(User i:userRepo.findAll()) {
			list.add(i);
		}
		
		return list;
	}

	@Override
	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	
}
