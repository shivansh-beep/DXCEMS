package com.pro.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.pro.entity.Pet;
import com.pro.entity.PetUser;

public interface UserDAO {
	public boolean createUser(PetUser pu);

	public boolean signIn(PetUser pu,HttpServletRequest req);
	public ArrayList<Pet> getPetDTO();

	public ArrayList<Pet> getMyPetDTO(String id);

	public boolean addPet(Pet pet);

	public boolean buy(String id);

	
}
