package com.repairservices.homerepairservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repairservices.homerepairservices.model.ServicesModel;

@Repository
public interface ServiceRepository extends JpaRepository<ServicesModel,Long>{

	List<ServicesModel> findByCategory(String category);

	ServicesModel findBySubCategory(String subCategory);

	ServicesModel findCategoryById(Long categoryId);

	

}
