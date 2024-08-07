package project.mappingtask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import project.mappingtask.model.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationService{
	
	@Autowired
	private OrganizationService organizationService;
//
//			@Override
//		public ResponseEntity<Object>getAllOrganization(){
//		List<Organization>org = organizationService.findAll() ;
//		{
//			if(org.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//			}
//			
//		}
//		return new ResponseEntity<>(org, HttpStatus.OK);
//	}

			@Override
			public List<Organization> findAll() {
				return organizationService.findAll();
			}



}
