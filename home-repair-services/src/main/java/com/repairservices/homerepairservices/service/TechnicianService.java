package com.repairservices.homerepairservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repairservices.homerepairservices.dao.TechnicianRepository;
import com.repairservices.homerepairservices.model.Technician;
import com.repairservices.homerepairservices.model.UserModel;

@Service
public class TechnicianService {

	
	@Autowired
	private TechnicianRepository technicianRepository;

	@Autowired
	private UserService userService;
	
	
	public int saveImage(Technician technician) {
		technicianRepository.save(technician);
		UserModel um = userService.findDetails(technician.getUsername());
		if((um.getRole()).equalsIgnoreCase("Technician")) {
		um.setAddress(technician.getAddress());
        um.setEmail(technician.getEmail());
        um.setMobile(technician.getMobile());
        userService.save(um);
		}
		return 1;
	}


	public Technician getTechnicianData(String name) {
		return technicianRepository.findByUsername(name);
	}


	public List<Technician> findAll() {
		return technicianRepository.findAll();
	}


	public Technician findByField(String field) {
		return technicianRepository.findByField(field);
	}


	


}
