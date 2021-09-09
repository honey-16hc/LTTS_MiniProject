package com.repairservices.homerepairservices.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="contactus")
public class ContactUsModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String subject;
	private String comment;
	private Date date= new Date();
	
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public ContactUsModel() {
		super();
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ContactUsModel(Long id, String username, String email, String subject, String comment, Date date) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.subject = subject;
		this.comment = comment;
		this.date = date;
	}
	@Override
	public String toString() {
		return "ContactUsModel [id=" + id + ", username=" + username + ", email=" + email + ", subject=" + subject
				+ ", comment=" + comment + ", date=" + date + "]";
	}
	
	
}
