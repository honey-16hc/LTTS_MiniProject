package com.repairservices.homerepairservices.controller;

import java.security.Principal;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.repairservices.homerepairservices.model.UserModel;
import com.repairservices.homerepairservices.security.CustomAuthenticationSuccessHandler;
import com.repairservices.homerepairservices.security.UserDetailService;
import com.repairservices.homerepairservices.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@Autowired
	private UserDetailService userDetailsService;
	
	

	
	@RequestMapping("/home")
	public ModelAndView registerUser() {
		
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/registration")
	public ModelAndView signup() {
		
		
		return new ModelAndView("registration");
	}
	@RequestMapping("/home/admin")
	public ModelAndView login(Model model, Principal principal, HttpServletRequest request) {
		/* referer = request.getHeader("Referer"); //Get previous URL before call '/login'
		String s =referer;
		System.out.println(s);
        //save referer URL to session, for later use on CustomAuthenticationSuccesshandler
        request.getSession().setAttribute(CustomAuthenticationSuccessHandler.REDIRECT_URL_SESSION_ATTRIBUTE_NAME, referer); 
    	
         if(principal == null)
        		 log = new ModelAndView("index");
		*/
		return new ModelAndView("login");
	}

	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		Long mobile = Long.parseLong(request.getParameter("mobile"));
		System.out.println(name);
		String role = "customer";
		userService.save(name,email,password,mobile,role,address);
		return new ModelAndView("save");
	}
	
	
	@RequestMapping(value = "/home/adminsignin", method = RequestMethod.POST)
	public ModelAndView createAuthenticationToken(HttpServletRequest request) throws Exception{
		
		try {
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		 authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		
			final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			
			UserModel user = userService.findDetails(username);
			if((user.getRole()).equalsIgnoreCase("admin"))
				return new ModelAndView("adminHome");
			else
				return	new ModelAndView("index");
		}
		catch(Exception e) {
			return new ModelAndView("index");
		}
	}
	
	
	
	@RequestMapping(value="/contact", method = RequestMethod.POST)
	public ModelAndView contactUs(HttpServletRequest request) {
		
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String comment = request.getParameter("comment");
		userService.saveContactus(username,email,subject,comment);
		return new ModelAndView("save");
	}
	
}
