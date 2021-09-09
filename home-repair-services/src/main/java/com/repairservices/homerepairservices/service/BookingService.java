package com.repairservices.homerepairservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repairservices.homerepairservices.dao.BookingRepository;
import com.repairservices.homerepairservices.dao.ServiceRepository;
import com.repairservices.homerepairservices.model.BookingModel;
import com.repairservices.homerepairservices.model.ServicesModel;

@Service
public class BookingService {

	
	@Autowired
	private BookingRepository bookingRepo;
	
	
	@Autowired
	private ServiceRepository serviceRepo;


	public List<ServicesModel> getElectricList() {
		String category = "electric";
		List<ServicesModel> list = serviceRepo.findByCategory(category);
		return list;
	}


	public List<ServicesModel> getElectronicList() {
		String category = "electronic";
		List<ServicesModel> list = serviceRepo.findByCategory(category);
		return list;
	}


	public List<ServicesModel> getPlumbingList() {
		String category = "plumbing";
		List<ServicesModel> list = serviceRepo.findByCategory(category);
		return list;
	}


	public List<ServicesModel> getCarpenterList() {
		String category = "carpenter";
		List<ServicesModel> list = serviceRepo.findByCategory(category);
		return list;
	}


	public void save(BookingModel electricService) {
		bookingRepo.save(electricService);
		
	}


public ServicesModel getCategoryId(String subCategory) {
		return serviceRepo.findBySubCategory(subCategory);
	}


public void saveCategory(String category,String sub) {
	ServicesModel sm = new ServicesModel();
	sm.setCategory(category);
	sm.setSubCategory(sub);
	serviceRepo.save(sm);
}


public List<ServicesModel> findAllSubCategory() {
	return serviceRepo.findAll();
}


public void saveUpdatedService(ServicesModel model) {
	serviceRepo.save(model);
	
}


public ServicesModel findById(Long categoryId) {
	return serviceRepo.findCategoryById(categoryId);
}
}
