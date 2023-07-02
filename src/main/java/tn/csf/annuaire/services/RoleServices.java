package tn.csf.annuaire.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.repository.*;

//defining the business logic  
@Service 


public class RoleServices {
	@Autowired //It allows Spring to resolve and inject collaborating beans into our bean (bean=class) 
	RoleRepository roleRepository;    

	//getting all article record by using the method findaAll() of CrudRepository  
	public List<Role> getAllRoles()   
	{  
		List<Role> roles = new ArrayList<Role>();  
		roleRepository.findAll().forEach(a -> roles.add(a));  
		return roles;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Role getRolesById(int id)   
	{  
		return roleRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Role a)   
	{  
		roleRepository.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		roleRepository.deleteById(id);  
	} 

}
