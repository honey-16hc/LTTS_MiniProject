package com.repairservices.homerepairservices.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity(name="technician")
public class Technician {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String password;
	private Long mobile;
	private String role;
	private String address;
	private Date date= new Date();
	private String field;
	@Lob
	private byte[] photograph;
	
	@Transient
	private String pic;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public byte[] getPhotograph() {
		return photograph;
	}
	public void setPhotograph(byte[] photograph) {
		this.photograph = photograph;
	}
	@Override
	public String toString() {
		return "Technician [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", role=" + role + ", address=" + address + ", date=" + date + ", field="
				+ field + ", photograph=" + Arrays.toString(photograph) + "]";
	}
	public Technician() {
		super();
	}
	public Technician(Long id, String username, String email, String password, Long mobile, String role, String address,
			Date date, String field, byte[] photograph) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.role = role;
		this.address = address;
		this.date = date;
		this.field = field;
		this.photograph = photograph;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
	
}
