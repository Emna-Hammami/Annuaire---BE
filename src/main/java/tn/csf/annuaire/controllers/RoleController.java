package tn.csf.annuaire.controllers;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.services.*;

//mark class as Controller  
@RestController //api
@CrossOrigin(origins = "*")

public class RoleController {
	//autowire the ArticleService class  
		@Autowired  
		RoleServices roleServices;  

		//creating a get mapping that retrieves all the Article detail from the database   
		@GetMapping("/role")
		private List<Role> getAllRoles()   
		{  
			return roleServices.getAllRoles();  
		}  

		//creating a get mapping that retrieves the detail of a specific article  
		@GetMapping("/role/{id}")  
		private Role getRole(@PathVariable("id") int id)   
		{  
			return roleServices.getRolesById(id);  
		}  

		//creating a delete mapping that deletes a specified article  
		@DeleteMapping("/role/{id}")  
		private void deleteRole(@PathVariable("id") int id)   
		{  
			roleServices.delete(id);  
		} 

		//create new article
		@PostMapping("/role")  
		private int saveRole(@RequestBody Role a)   
		{  
			roleServices.saveOrUpdate(a);  
			return a.getId();  
		} 

		//creating put mapping that updates the article detail
		@PutMapping("/role")  
		private Role update(@RequestBody  Role a)   
		{  
			roleServices.saveOrUpdate(a);  
			return a;  
		}  

}
