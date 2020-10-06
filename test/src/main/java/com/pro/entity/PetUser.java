package com.pro.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PET_USER")
public class PetUser implements Serializable{
	
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator = "auto")
	int ID;
	String USER_NAME;
	String USER_PASSWD;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PASSWD() {
		return USER_PASSWD;
	}
	public void setUSER_PASSWD(String uSER_PASSWD) {
		USER_PASSWD = uSER_PASSWD;
	}
	
//	 @OneToMany(cascade=CascadeType.ALL)
//	    @JoinColumn(name="Pet_ID")
//	    private List<Pet> petDetails;
//	 
//	 
//	 
//	 
//	public List<Pet> getPetDetails() {
//		return petDetails;
//	}
//	public void setPetDetails(List<Pet> petDetails) {
//		this.petDetails = petDetails;
//	}
//	
//	
//	
//	public PetUser(int iD, String uSER_NAME, String uSER_PASSWD, List<Pet> petDetails) {
//		super();
//		ID = iD;
//		USER_NAME = uSER_NAME;
//		USER_PASSWD = uSER_PASSWD;
//		this.petDetails = petDetails;
//	}
	
	public PetUser(String uSER_NAME, String uSER_PASSWD) {
		super();
	
		USER_NAME = uSER_NAME;
		USER_PASSWD = uSER_PASSWD;
	}
	
	
	public PetUser() {
		// TODO Auto-generated constructor stub
	}

}
