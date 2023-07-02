package tn.csf.annuaire.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.repository.*;


//defining the business logic  
@Service 

public class SpecialityServices {

	@Autowired //It allows Spring to resolve and inject collaborating beans into our bean (bean=class) 
	SpecialityRepository specialityRepository;

	//getting all Speciality record by using the method findaAll() of CrudRepository  
	public List<Speciality> getAllSpecialities()   
	{  
		List<Speciality> specialities = new ArrayList<Speciality>();  
		specialityRepository.findAll().forEach(a -> specialities.add(a));  
		return specialities;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Speciality getSpecialitiesById(int id)   
	{  
		return specialityRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Speciality a)   
	{  
		specialityRepository.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		specialityRepository.deleteById(id);  
	} 

}