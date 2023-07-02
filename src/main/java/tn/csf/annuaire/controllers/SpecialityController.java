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
@CrossOrigin(origins = "*")//* pour tout le monde et @ip pour des machines bien définies


public class SpecialityController {
	//autowire the ArticleService class  
		@Autowired  
		SpecialityServices specialityServices;  

		//creating a get mapping that retrieves all the Speciality detail from the database   
		@GetMapping("/speciality")
		private List<Speciality> getAllSpecialities()   
		{  
			return specialityServices.getAllSpecialities();  
		}  

		//creating a get mapping that retrieves the detail of a specific Speciality  
		@GetMapping("/speciality/{id}")  
		private Speciality getSpeciality(@PathVariable("id") int id)   
		{  
			return specialityServices.getSpecialitiesById(id);  
		}  

		//creating a delete mapping that deletes a specified Speciality  
		@DeleteMapping("/speciality/{id}")  
		private void deleteSpeciality(@PathVariable("id") int id)   
		{  
			specialityServices.delete(id);  
		} 

		//create new Speciality
		@PostMapping("/speciality")  
		private int saveSpeciality(@RequestBody Speciality a)   
		{  
			specialityServices.saveOrUpdate(a);  
			return a.getId();  
		} 

		//creating put mapping that updates the Speciality detail
		@PutMapping("/speciality")  
		private Speciality update(@RequestBody  Speciality a)   
		{  
			specialityServices.saveOrUpdate(a);  
			return a;  
		}  


}
