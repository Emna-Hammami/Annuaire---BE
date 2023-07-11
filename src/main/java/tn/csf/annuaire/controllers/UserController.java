package tn.csf.annuaire.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.services.*;

//mark class as Controller  
@RestController //api
@CrossOrigin(origins = "*")

public class UserController {
	//autowire the ArticleService class  
			@Autowired  
			UserServices userServices;  

			//creating a get mapping that retrieves all the Article detail from the database   
			@GetMapping("/user")
			private List<User> getAllUsers()   
			{  
				return userServices.getAllUsers();  
			}  

			//creating a get mapping that retrieves the detail of a specific article  
			@GetMapping("/user/{id}")  
			private User getUser(@PathVariable("id") long id)   
			{  
				return userServices.getUsersById(id);  
			}  

			//creating a delete mapping that deletes a specified article  
			@DeleteMapping("/user/{id}")  
			private void deleteUser(@PathVariable("id") long id)   
			{  
				userServices.delete(id);  
			} 

			//create new article
			@PostMapping("/user")  
			private Long saveUser(@RequestBody User a)   
			{  
				userServices.saveOrUpdate(a);  
				return a.getId();  
			} 

			//creating put mapping that updates the article detail
			@PutMapping("/user")  
			private User update(@RequestBody  User a)   
			{  
				userServices.saveOrUpdate(a);  
				return a;  
			}  

			
			//creating a get mapping that retrieves the detail of a specific article  
			@GetMapping("/usersbyspeciality/{id}")  
			private List<User> getUsersBySpeciality(@PathVariable("id") int id)   
			{  
				return userServices.getUsersBySpeciality(id);  
			}  

			//creating a get mapping that retrieves the detail of a specific article  
			@GetMapping("/usersbyusername/{username}")  
			private Optional<User> getUsersByUsername(@PathVariable("username") String username)   
			{  
				return userServices.getUsersByUsername(username);  
			}  	
		
			@GetMapping("/usersbyspecialityandemail")  
			private List<User> getUsersBySpecialityAndEmail(@RequestParam int id,
					@RequestParam String email)   
			{  
				return userServices.getUsersBySpecialityAndByEmail(id, email);  
			}  

}
