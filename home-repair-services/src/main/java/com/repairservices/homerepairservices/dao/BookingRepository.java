package com.repairservices.homerepairservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repairservices.homerepairservices.model.BookingModel;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel,Long> {

}
