package tn.csf.annuaire.models;

import java.time.LocalDate;

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
	private LocalDate experation; 
	@Column 
	private double amount; 
	@Column 
	private String payment; 
	
	
	@ManyToOne (optional=false)
	@JoinColumn (name="idmembership")
	private User user;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getExperation() {
		return experation;
	}
	public void setExperation(LocalDate experation) {
		this.experation = experation;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Membership [id=" + id + ", experation=" + experation + ", amount=" + amount + ", payment=" + payment
				+ ", user=" + user + "]";
	}
	
}