package com.repairservices.homerepairservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repairservices.homerepairservices.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{

	UserModel findByUsername(String username);


}
