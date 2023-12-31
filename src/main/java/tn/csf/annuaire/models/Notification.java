package tn.csf.annuaire.models;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;  

@Entity

@Table

public class Notification {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	@Column // c une colonne dans la BD
	private int id;  
	@Column  
	private String title;
	@Column
	private String description;
	
	@ManyToOne (optional=false)
	@JoinColumn (name="idnotification")
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	

}
