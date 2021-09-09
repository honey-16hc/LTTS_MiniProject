package com.repairservices.homerepairservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repairservices.homerepairservices.dao.ContactusRepository;
import com.repairservices.homerepairservices.dao.UserRepository;
import com.repairservices.homerepairservices.model.ContactUsModel;
import com.repairservices.homerepairservices.model.UserModel;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private ContactusRepository contactusRepository;
	
	
	public void save(String name, String email, String password, Long mobile, String role, String address) {
		UserModel userModel = new UserModel();
		userModel.setEmail(email);
		userModel.setUsername(name);
		userModel.setMobile(mobile);
		userModel.setPassword(password);
		userModel.setRole(role);
		userModel.setAddress(address);
		repo.save(userModel);
	}


	public UserModel findDetails(String name) {
		return repo.findByUsername(name);
	}


	public void save(UserModel um) {
	repo.save(um);
		
	}


	public void saveContactus(String username, String email, String subject, String comment) {
		ContactUsModel cm = new ContactUsModel();
		cm.setUsername(username);
		cm.setComment(comment);
		cm.setEmail(email);
		cm.setSubject(subject);
		
		contactusRepository.save(cm);
	}


}
