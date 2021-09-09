package com.repairservices.homerepairservices.controller;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.repairservices.homerepairservices.model.BookingModel;
import com.repairservices.homerepairservices.model.ServicesModel;
import com.repairservices.homerepairservices.model.Technician;
import com.repairservices.homerepairservices.model.UserModel;
import com.repairservices.homerepairservices.service.BookingService;
import com.repairservices.homerepairservices.service.EmailService;
import com.repairservices.homerepairservices.service.TechnicianService;
import com.repairservices.homerepairservices.service.UserService;

@RestController
public class ServicesController {

	
	@Autowired
	private BookingService service;
	
	@Autowired
	private	TechnicianService technicianService;
	
	@Autowired
	private UserService userService;
	

	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/home/electronic") 
	public ModelAndView electronic(Model model) {
		List<ServicesModel> li = service.getElectronicList();
		model.addAttribute("list",li);
		return new ModelAndView("electronic");
	}
	
	
	@RequestMapping("/home/electric") 
	public ModelAndView electric(Model model) {
		List<ServicesModel> li = service.getElectricList();
		model.addAttribute("list",li);
		return new ModelAndView("electric");
	}
	
	@RequestMapping("/home/plumbing") 
	public ModelAndView plumbing(Model model) {
		List<ServicesModel> li = service.getPlumbingList();
		model.addAttribute("list",li);
		return new ModelAndView("plumbing");
	}
	
	@RequestMapping("/home/carpenter") 
	public ModelAndView carpenter(Model model) {
		List<ServicesModel> li = service.getCarpenterList();
		model.addAttribute("list",li);
		
		return new ModelAndView("carpenter");
	}
	
	@RequestMapping(value = "/priorBooking", method = RequestMethod.POST)
	public ModelAndView electricBooking(HttpServletRequest request, Model model) {
		
		String subCategory = request.getParameter("service");
		String address = request.getParameter("address");
		String date = request.getParameter("serviceDate");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		UserModel um = userService.findDetails(name);
		ServicesModel sub = service.getCategoryId(subCategory);
		System.out.println(um);
		model.addAttribute("user", um);
		model.addAttribute("subCategory", subCategory);
		model.addAttribute("categoryId", sub.getId());
		model.addAttribute("address", address);
		model.addAttribute("date", date);
		return new ModelAndView("electricBooking");
	}
	@RequestMapping(value = "/serviceBooking", method = RequestMethod.POST)
	  public ModelAndView electricBookingFinal(@ModelAttribute(value = "electricService" ) BookingModel electricService,HttpServletRequest request, Model model) throws Exception {
		System.out.println(electricService);
		service.save(electricService);
		
		ServicesModel field = service.findById(electricService.getCategoryId());
		System.out.println(field);
		Technician tech = technicianService.findByField(field.getCategory());
		byte[] pict = java.util.Base64.getEncoder().encode(tech.getPhotograph());
    	String picture = new String(pict, "UTF-8");
    	tech.setPic(picture);
    	String ser = field.getSubCategory();
    	String name = request.getParameter("name");
    	String to = request.getParameter("email");
    	String message = "Dear " + name + "," + "\n" +"Your service booking for " + ser + " has been confirmed. " + "Technician " + tech.getUsername() + " will be reaching soon. "  + "\n"  + "Technician Mobile number: "+tech.getMobile() + "\n" + "Thanks & Regards" + "\n" + "Honey Chaudhary" + "\n" + "Home Repair Services";
    	String subject = "Booking Confirmed!!";
    	boolean result = this.emailService.sendEmail(message,subject,to);
    	if(!result) {
    				return new ModelAndView("index");
    			}
    	model.addAttribute("tech", tech);
		model.addAttribute("user", request.getParameter("name"));
	     return new ModelAndView("success");
	  }

	
	@RequestMapping(value = "/addservice")
	public ModelAndView addservice()
	{
		return  new ModelAndView("addService");
	}
	@RequestMapping(value = "/addservices", method = RequestMethod.POST)
	public ModelAndView addService(HttpServletRequest request)
	{
		String cat = request.getParameter("category");
		String sub = request.getParameter("subCategory");
		ServicesModel model = new ServicesModel();
		service.saveCategory(cat,sub);
		return  new ModelAndView("save");
	}
	
	@RequestMapping(value = "/updateservice")
	public ModelAndView updateservice( Model model)
	{
		model.addAttribute("sub", service.findAllSubCategory());
		return  new ModelAndView("updateservice");
	}
	
	@RequestMapping(value = "/updateservices", method = RequestMethod.POST)
	public ModelAndView updateService(HttpServletRequest request)
	{
		String cat = request.getParameter("category");
		String sub = request.getParameter("subCategory");
		String newSubCategory = request.getParameter("newSubCategory");
		ServicesModel model = service.getCategoryId(sub);
		model.setCategory(cat);
		model.setSubCategory(newSubCategory);
		service.saveUpdatedService(model);
		return  new ModelAndView("save");
	}
}
