package tn.csf.annuaire.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository  

import tn.csf.annuaire.models.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Integer>{

}

