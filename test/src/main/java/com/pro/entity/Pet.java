package com.pro.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PETS")
public class Pet implements Serializable{

	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator = "auto")
	int ID;
 String PET_NAME;
 String PET_AGE ;
 String PET_PLACE ;
 int PET_OWNERID ;


public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getPET_NAME() {
	return PET_NAME;
}
public void setPET_NAME(String pET_NAME) {
	PET_NAME = pET_NAME;
}
public String getPET_AGE() {
	return PET_AGE;
}
public void setPET_AGE(String pET_AGE) {
	PET_AGE = pET_AGE;
}
public String getPET_PLACE() {
	return PET_PLACE;
}
public void setPET_PLACE(String pET_PLACE) {
	PET_PLACE = pET_PLACE;
}


 public int getPET_OWNERID() {
	return PET_OWNERID;
}
public void setPET_OWNERID(int pET_OWNERID) {
	PET_OWNERID = pET_OWNERID;
}
public Pet() {
	// TODO Auto-generated constructor stub
}
public Pet(String pET_NAME, String pET_AGE, String pET_PLACE, int pET_OWNERID) {
	super();
	PET_NAME = pET_NAME;
	PET_AGE = pET_AGE;
	PET_PLACE = pET_PLACE;
	PET_OWNERID = pET_OWNERID;
}

}
