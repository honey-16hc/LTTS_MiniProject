package com.repairservices.homerepairservices.controller;

import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.repairservices.homerepairservices.model.BookingModel;
import com.repairservices.homerepairservices.model.ServicesModel;
import com.repairservices.homerepairservices.model.Technician;
import com.repairservices.homerepairservices.model.UserModel;
import com.repairservices.homerepairservices.security.UserDetailService;
import com.repairservices.homerepairservices.service.TechnicianService;
import com.repairservices.homerepairservices.service.UserService;

@RestController
public class TechnicianController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDetailService userDetailsService;
	
	@Autowired
	private TechnicianService technicianService;
	
	//@ModelAttribute(value = "technician" ) Technician technician,
	@RequestMapping(value = "/home/techniciansignup", method = RequestMethod.POST)
    public ModelAndView fileUpload(HttpServletRequest request, Model model, @RequestParam("photograph") MultipartFile photograph) {
        try {
        	Technician technician = new Technician();
            byte[] image = photograph.getBytes();
            technician.setPhotograph(image);
            technician.setAddress(request.getParameter("address"));
            technician.setEmail(request.getParameter("email"));
            technician.setField(request.getParameter("field"));
            technician.setMobile(Long.parseLong(request.getParameter("mobile")));
            technician.setPassword(request.getParameter("password"));
            technician.setUsername(request.getParameter("name"));
            technician.setRole("Technician");
            int saveImage = technicianService.saveImage(technician);
            if (saveImage == 1) {
                return new ModelAndView("success");
            } else {
                return new ModelAndView("vendorRegistration");
            }
        } catch (Exception e) {
            return new ModelAndView("vendorRegistration");
        }
    }
	
	
	
	@RequestMapping(value = "/home/vendorsignup")
	public ModelAndView technician() {
		
		return new ModelAndView("vendorRegistration");
	}
	
	@RequestMapping(value = "/home/technicians")
	 public ModelAndView getDbDetils(Model model) {
	        try {
	        	//String name = "shyam";
	        	//Technician imagesObj = technicianService.getTechnicianData(name);
	            //model.addAttribute("id", imagesObj.getId());
	         //   model.addAttribute("name", imagesObj.getUsername());
	         //   byte[] encode = java.util.Base64.getEncoder().encode(imagesObj.getPhotograph());
	         //   model.addAttribute("image", new String(encode, "UTF-8"));
	            
	            
	            List<Technician> techs = technicianService.findAll();
	            List<Technician> list = new  ArrayList<Technician>();
	            for(Technician t: techs) {
	            	byte[] pict = java.util.Base64.getEncoder().encode(t.getPhotograph());
	            	String picture = new String(pict, "UTF-8");
	            	t.setPic(picture);
	            	list.add(t);
	            }
	            
	            model.addAttribute("list",list);
	            
	            
	            return new ModelAndView("technicians");
	        } catch (Exception e) {
	            model.addAttribute("message", "Error in getting image");
	            return new ModelAndView("index");
	        }
	    }
	
	@RequestMapping("/home/techniciansignin")
	public ModelAndView login(Model model, Principal principal, HttpServletRequest request) {
		
		return new ModelAndView("technicianLogin");
	}

	
	@RequestMapping(value = "/home/techniciansignin", method = RequestMethod.POST)
	public ModelAndView createAuthenticationToken(HttpServletRequest request,Model model) throws Exception{
		
		try {
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		 authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		
			final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			
			UserModel user = userService.findDetails(username);
			if((user.getRole()).equalsIgnoreCase("Technician")) {
				
				Technician tech = technicianService.getTechnicianData(username);
				byte[] pict = java.util.Base64.getEncoder().encode(tech.getPhotograph());
            	String picture = new String(pict, "UTF-8");
            	tech.setPic(picture);
				model.addAttribute("user", tech);
				return new ModelAndView("technicianHome");
			}
			else
				return	new ModelAndView("index");
		}
		catch(Exception e) {
			return new ModelAndView("index");
		}
	}
	
	@RequestMapping(value = "/updatetechniciandetails")
	public ModelAndView updateservice( Model model,HttpServletRequest request) throws Exception
	{
		Long id =  Long.parseLong(request.getParameter("userId"));
		String username = request.getParameter("name");
		Technician tech = technicianService.getTechnicianData(username);
		byte[] pict = java.util.Base64.getEncoder().encode(tech.getPhotograph());
    	String picture = new String(pict, "UTF-8");
    	tech.setPic(picture);
		model.addAttribute("user", tech);
		return  new ModelAndView("updatetechniciandetails");
	}
	
	@RequestMapping(value = "/updatetechniciandata", method = RequestMethod.POST)
	public ModelAndView updateService(HttpServletRequest request, @RequestParam("photograph") MultipartFile photograph)
	{
		try {
			String username = request.getParameter("name");
			Technician tech = technicianService.getTechnicianData(username);
            byte[] image = photograph.getBytes();
            tech.setPhotograph(image);
            tech.setAddress(request.getParameter("address"));
            tech.setEmail(request.getParameter("email"));
            tech.setField(request.getParameter("field"));
            tech.setMobile(Long.parseLong(request.getParameter("mobile")));
            int saveImage = technicianService.saveImage(tech);
            if (saveImage == 1) {
                return new ModelAndView("save");
            } else {
                return new ModelAndView("updatetechniciandetails");
            }
        } catch (Exception e) {
            return new ModelAndView("updatetechniciandetails");
        }
	}
}
