package com.pro.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pro.DAO.UserDAO;
import com.pro.DAO.UserDaoImp;
import com.pro.entity.Pet;
import com.pro.entity.PetUser;

public class UserServiceImp implements UserService {
	UserDAO ud = new UserDaoImp();

	public boolean createUser(PetUser pu) {

		return ud.createUser(pu);
	}

	public boolean signIn(PetUser pu,HttpServletRequest req) {

		return ud.signIn(pu,req);
	}

	public ArrayList<Pet> getPetDTO() {

		return ud.getPetDTO();
	}

	public ArrayList<Pet> getMyPetDTO(String id) {
		// TODO Auto-generated method stub
		return ud.getMyPetDTO(id);
	}

	public boolean addPet(Pet pet) {
		// TODO Auto-generated method stub
		return ud.addPet(pet);
	}

	public boolean buy(String id) {
		// TODO Auto-generated method stub
		return ud.buy(id);
	}



}
