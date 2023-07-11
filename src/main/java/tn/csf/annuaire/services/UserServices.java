package tn.csf.annuaire.services;

import java.util.ArrayList;  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.repository.*;

//defining the business logic  
@Service 


public class UserServices {
	@Autowired //It allows Spring to resolve and inject collaborating beans into our bean (bean=class) 
	UserRepository userRepository;    

	//getting all article record by using the method findaAll() of CrudRepository  
	public List<User> getAllUsers()   
	{  
		List<User> Users = new ArrayList<User>();  
		userRepository.findAll().forEach(a -> Users.add(a));  
		return Users;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public User getUsersById(long id)   
	{  
		return userRepository.findById((long) id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(User a)   
	{  
		userRepository.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(long id)   
	{  
		userRepository.deleteById((long) id);  
	}

	public List<User> getUsersBySpeciality(int id) {
		// TODO Auto-generated method stub
		return userRepository.findBySpeciality(id);
	}

	public Optional<User> getUsersByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	public List<User> getUsersBySpecialityAndByEmail(int id, String email) {
		// TODO Auto-generated method stub
		return userRepository.findBySpecialityAndEmail(id,email);
	}

	

}
