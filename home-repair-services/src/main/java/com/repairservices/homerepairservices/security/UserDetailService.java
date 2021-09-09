package com.repairservices.homerepairservices.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.repairservices.homerepairservices.dao.UserRepository;
import com.repairservices.homerepairservices.model.UserModel;

@Service
public class UserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel user = repository.findByUsername(username);
		//CustomUserDetails userDetails = null;
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());

	}

}
