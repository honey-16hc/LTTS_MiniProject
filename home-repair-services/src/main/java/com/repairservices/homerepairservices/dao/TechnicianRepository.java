package com.repairservices.homerepairservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repairservices.homerepairservices.model.Technician;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician,Long> {

	Technician findByUsername(String name);

	Technician findByField(String field);

}
