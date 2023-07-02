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

public class NotificationController {
	//autowire the ArticleService class  
		@Autowired  
		NotificationServices notificationServices;  

		//creating a get mapping that retrieves all the Article detail from the database   
		@GetMapping("/notification")
		private List<Notification> getAllNotifications()   
		{  
			return notificationServices.getAllNotifications();  
		}  

		//creating a get mapping that retrieves the detail of a specific article  
		@GetMapping("/notification/{id}")  
		private Notification getNotifications(@PathVariable("id") int id)   
		{  
			return notificationServices.getNotificationsById(id);  
		}  

		//creating a delete mapping that deletes a specified article  
		@DeleteMapping("/notification/{id}")  
		private void deleteNotification(@PathVariable("id") int id)   
		{  
			notificationServices.delete(id);  
		} 

		//create new article
		@PostMapping("/notification")  
		private int saveNotification(@RequestBody Notification a)   
		{  
			notificationServices.saveOrUpdate(a);  
			return a.getId();  
		} 

		//creating put mapping that updates the article detail
		@PutMapping("/notification")  
		private Notification update(@RequestBody  Notification a)   
		{  
			notificationServices.saveOrUpdate(a);  
			return a;  
		}  


}
