package com.repairservices.homerepairservices.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.repairservices.homerepairservices.service.EmailService;

@RestController
public class EmailController {

	
	
	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping(value = "/sendemail", method = RequestMethod.POST)
	public String sendEmail(HttpServletRequest request,Model model){
		
		String message = "Hello debartha!! Kemon Aacho?";
		String subject = "Greeting mail";
		String to = "mail2debartha@gmail.com";
		boolean result = this.emailService.sendEmail(message,subject,to);
		if(result) {
	//	return new ModelAndView("save");
			return "success";
		}
		else
			return "fail";
		//	return new ModelAndView("index");	
		
	}
	
	
}
