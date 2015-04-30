package ie.cit.group3.controller;


import java.sql.Date;
import java.util.List;

import ie.cit.group3.JdbcTemplateTestApplication;
import ie.cit.group3.domain.ChObject;
import ie.cit.group3.domain.Image;
import ie.cit.group3.domain.Participant;
import ie.cit.group3.domain.Role;
import ie.cit.group3.entity.User;
import ie.cit.group3.service.ChObjectService;
import ie.cit.group3.service.ImageService;
import ie.cit.group3.service.ParticipantService;
import ie.cit.group3.service.RolesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Browse")
public class TraceyController {
	
	@Autowired
	ChObjectService chobject;
	
	@Autowired
	RolesService roles;
	
	@Autowired
	ParticipantService participants;
	
	@Autowired
	ImageService images;
	
	

	
	
	@RequestMapping(value="/listall/users", method = RequestMethod.GET) 
	
	public String findByUsername(ModelMap model) {	

		 
		 
		 User listuser = new User();
		 listuser.setId(1234);
		 listuser.setUsername("Tracey");
		 
			 
		 model.addAttribute("user", listuser);
		 
	    return "displayUserProfile" ;	
	}    
}             