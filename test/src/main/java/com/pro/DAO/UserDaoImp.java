package com.pro.DAO;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.pro.connection.SessionCon;
import com.pro.entity.Pet;
import com.pro.entity.PetUser;

public class UserDaoImp implements UserDAO {

	Session ss = new SessionCon().getConnection();

	public boolean createUser(PetUser pu) {

		ss.save(pu);

		try {
			ss.beginTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean signIn(PetUser pu, HttpServletRequest req) {
		// TODO Auto-generated method stub
		Criteria cr = ss.createCriteria(PetUser.class);
		cr.add(Restrictions.eq("USER_NAME", pu.getUSER_NAME()));
	
		PetUser pu1 = (PetUser) cr.uniqueResult();

		if (pu1 != null) {
			int id = pu1.getID();
			String id1 = Integer.toString(id);
			HttpSession httpSession = req.getSession(false);
			httpSession.setAttribute("loginID", id1);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Pet> getPetDTO() {
		Criteria cr = ss.createCriteria(Pet.class);
		
		ArrayList<Pet> al = (ArrayList<Pet>) cr.list();
		return al;
	}

	public ArrayList<Pet> getMyPetDTO(String id) {
		int pId = Integer.valueOf(id);
		Criteria cr = ss.createCriteria(Pet.class);
		cr.add(Restrictions.eq("PET_OWNERID", pId));
		ArrayList<Pet> al = (ArrayList<Pet>) cr.list();
		return al;
	}

	public boolean addPet(Pet pet) {
		
		
		ss.save(pet);

		try {
			ss.beginTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean buy(String id) {
		Pet pet=(Pet) ss.load(Pet.class, Integer.parseInt(id));
	
		ss.delete(pet);
		
		try {
			ss.beginTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

