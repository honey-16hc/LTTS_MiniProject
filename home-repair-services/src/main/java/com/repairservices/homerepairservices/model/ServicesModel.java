package com.repairservices.homerepairservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="services")
public class ServicesModel {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="sub_category")
	private String subCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public ServicesModel(Long id, String category, String subCategory) {
		super();
		this.id = id;
		this.category = category;
		this.subCategory = subCategory;
	}

	public ServicesModel() {
		super();
	}

	@Override
	public String toString() {
		return "ServicesModel [id=" + id + ", category=" + category + ", subCategory=" + subCategory + "]";
	}

	
	

}
