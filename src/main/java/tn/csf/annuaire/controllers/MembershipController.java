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

public class MembershipController {
	//autowire the ArticleService class  
		@Autowired  
		MembershipServices membershipServices;  

		//creating a get mapping that retrieves all the Article detail from the database   
		@GetMapping("/membership")
		private List<Membership> getAllMemberships()   
		{  
			return membershipServices.getAllMemberships();  
		}  

		//creating a get mapping that retrieves the detail of a specific article  
		@GetMapping("/membership/{id}")  
		private Membership getMembership(@PathVariable("id") int id)   
		{  
			return membershipServices.getMembershipsById(id);  
		}  

		//creating a delete mapping that deletes a specified article  
		@DeleteMapping("/membership/{id}")  
		private void deleteMembership(@PathVariable("id") int id)   
		{  
			membershipServices.delete(id);  
		} 

		//create new article
		@PostMapping("/article")  
		private int saveMembership(@RequestBody Membership a)   
		{  
			membershipServices.saveOrUpdate(a);  
			return a.getId();  
		} 

		//creating put mapping that updates the article detail
		@PutMapping("/article")  
		private Membership update(@RequestBody  Membership a)   
		{  
			membershipServices.saveOrUpdate(a);  
			return a;  
		}  

}
