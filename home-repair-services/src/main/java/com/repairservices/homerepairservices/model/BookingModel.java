package com.repairservices.homerepairservices.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="booking")
public class BookingModel {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="category_id")
	private Long categoryId;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="booking_date")
	private Date bookingDate= new Date();
	
	
	@Column(name="service_date")
	private Date serviceDate;
	
	@Column(name="address")
	private String address;
	
	@Column(name="status")
	private String status;
	
	@Column(name="cost")
	private Double cost;
	
	
	@ManyToOne()
	@JoinColumn(name="user_id", referencedColumnName = "id", insertable = false, updatable = false)
	private UserModel user = null;
	
	
	@ManyToOne()
	@JoinColumn(name="category_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ServicesModel service = null;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public Date getServiceDate() {
		return serviceDate;
	}


	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public UserModel getUser() {
		return user;
	}


	public void setUser(UserModel user) {
		this.user = user;
	}


	public ServicesModel getService() {
		return service;
	}


	public void setService(ServicesModel service) {
		this.service = service;
	}


	public BookingModel(Long id, Long categoryId, Long userId, Date bookingDate, Date serviceDate, String address,
			String status, Double cost, UserModel user, ServicesModel service) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.serviceDate = serviceDate;
		this.address = address;
		this.status = status;
		this.cost = cost;
		this.user = user;
		this.service = service;
	}


	public BookingModel() {
		super();
	}


	@Override
	public String toString() {
		return "BookingModel [id=" + id + ", categoryId=" + categoryId + ", userId=" + userId + ", bookingDate="
				+ bookingDate + ", serviceDate=" + serviceDate + ", address=" + address + ", status=" + status
				+ ", cost=" + cost + ", user=" + user + ", service=" + service + "]";
	}
	
	
	
	
}
