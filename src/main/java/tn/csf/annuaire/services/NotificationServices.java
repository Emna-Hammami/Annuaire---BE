package tn.csf.annuaire.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.*;
import tn.csf.annuaire.repository.*;

//defining the business logic  
@Service 

public class NotificationServices {
	@Autowired //It allows Spring to resolve and inject collaborating beans into our bean (bean=class) 
	NotificationRepository notificationRepository;    

	//getting all article record by using the method findaAll() of CrudRepository  
	public List<Notification> getAllNotifications()   
	{  
		List<Notification> Notifications = new ArrayList<Notification>();  
		notificationRepository.findAll().forEach(a -> Notifications.add(a));  
		return Notifications;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Notification getNotificationsById(int id)   
	{  
		return notificationRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Notification a)   
	{  
		notificationRepository.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		notificationRepository.deleteById(id);  
	} 

}
