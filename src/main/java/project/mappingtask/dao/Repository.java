package project.mappingtask.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.mappingtask.model.Organization;

public interface Repository extends JpaRepository<Organization, Integer>{

}
