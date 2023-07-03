package tn.csf.annuaire.models;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table; 

@Entity

@Table

public class Membership {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	@Column 
	private int id;  
	@Column
	private int duration; //nbre de mois
	@Column
	private double price;
	@Column 
	private String methodOfPayment;
	
	@ManyToOne (optional=false)
	@JoinColumn (name="idMembership", referencedColumnName="id")
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}
	@Override
	public String toString() {
		return "Membership [id=" + id + ", duration=" + duration + ", price=" + price + ", methodOfPayment="
				+ methodOfPayment + "]";
	}
	

}
