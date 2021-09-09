package com.repairservices.homerepairservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repairservices.homerepairservices.model.ContactUsModel;

@Repository
public interface ContactusRepository extends JpaRepository<ContactUsModel,Long>{

}
