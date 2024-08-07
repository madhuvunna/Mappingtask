package project.mappingtask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.mappingtask.model.Organization;
import project.mappingtask.service.OrganizationService;

@RestController
@RequestMapping("/api")
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;
	
	@RequestMapping("/getOrganization")
	public List<Organization> getAllOrganization(){
		return organizationService.findAll();
	}
}
