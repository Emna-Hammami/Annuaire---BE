package tn.csf.annuaire.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.repository.*;

//defining the business logic  
@Service 

public class MembershipServices {
	@Autowired //It allows Spring to resolve and inject collaborating beans into our bean (bean=class) 
	MembershipRepository membershipRepository;    

	//getting all article record by using the method findaAll() of CrudRepository  
	public List<Membership> getAllMemberships()   
	{  
		List<Membership> Memberships = new ArrayList<Membership>();  
		membershipRepository.findAll().forEach(a -> Memberships.add(a));  
		return Memberships;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Membership getMembershipsById(int id)   
	{  
		return membershipRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Membership a)   
	{  
		membershipRepository.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		membershipRepository.deleteById(id);  
	} 

}
