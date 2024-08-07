package project.mappingtask.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import project.mappingtask.model.Organization;

public interface OrganizationService {

	 public List<Organization> findAll();

//	ResponseEntity<Object> getAllOrganization();

}
