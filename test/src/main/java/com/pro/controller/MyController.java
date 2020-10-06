package com.pro.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.entity.Pet;
import com.pro.entity.PetUser;
import com.pro.services.UserService;
import com.pro.services.UserServiceImp;

@Controller
public class MyController {

	UserService us = new UserServiceImp();

	@RequestMapping(value = "/userregn")
	public String userRegn() {
		return "userregn";


	@RequestMapping(value = "/Login")
	public String logIn() {
		return "Login";
	}

	@RequestMapping(value = "/addPet")
	public String addPet() {
		return "AddPet";
	}



	@RequestMapping(value = "/registered")
	public ModelAndView registered(@RequestParam("userName") String username, @RequestParam("password1") String pass) {

		PetUser pu = new PetUser(username, pass);
		boolean b = us.createUser(pu);

		if (b) {
			return new ModelAndView("registered", "msg", "Registraion Successfull please<hr>");
		} else {
			return new ModelAndView("userregn", "msg", "username already exist try with another username <hr>");
		}
	}



	
	
	
	@RequestMapping(value = "/signIn")
	public ModelAndView signIn(@RequestParam("userName") String username, @RequestParam("password") String pass,
			HttpServletRequest req) {
		PetUser pu = new PetUser(username, pass);
		boolean b = us.signIn(pu, req);
	//	ArrayList<Pet> petList = us.getPetDTO();
		HttpSession httpSession = req.getSession(false);
		//httpSession.setAttribute("availPetList", petList);
		String id = (String) httpSession.getAttribute("loginID");
		if (id != null) {
			if (b) {
				return new ModelAndView("pet_home2"/* "petList", petList*/);
			} else {
				return new ModelAndView("Login", "msg", "login failed <hr>");
			}
		} else {
			return new ModelAndView("Login", "msg", "login first <hr>");
		}
	}

	@RequestMapping(value = "/myPets")
	public ModelAndView myPets(HttpServletRequest req) {

		HttpSession httpSession = req.getSession(false);
		String id = (String) httpSession.getAttribute("loginID");

		System.out.println(id);

		if (id.isEmpty()) {
			return new ModelAndView("Login", "msg", "login first <hr>");

		} else {
			ArrayList<Pet> myPetList = us.getMyPetDTO(id);
			return new ModelAndView("MyPet", "myPetList", myPetList);
		}

	}
	@RequestMapping(value = "/buy")
	public ModelAndView buy(HttpServletRequest req) {
		
		HttpSession httpSession = req.getSession(false);
		String id = (String) httpSession.getAttribute("loginID");
	
		
		if (id.isEmpty()) {
			return new ModelAndView("Login", "msg", "login first <hr>");
			
		} else {
			String petId=req.getParameter("id");
			boolean b= us.buy(petId);
			if(b) {
			return new ModelAndView("pet_home");
			}else {
				return new ModelAndView("pet_home");
			}
			
		}
		
	}


	@RequestMapping(value = "/petData")
	public ModelAndView addPet(@RequestParam("PET_NAME") String petName,@RequestParam("PET_AGE") String petAge,@RequestParam("PET_PLACE") String petPlace, HttpServletRequest req) {

		HttpSession httpSession = req.getSession(false);
		String id = (String) httpSession.getAttribute("loginID");

		if (id.isEmpty()) {
			return new ModelAndView("Login", "msg", "login first <hr>");

		} else {
			Pet pet=new Pet(petName, petAge, petPlace,Integer.parseInt(id));
			boolean b = us.addPet(pet);
			if (b) {
				return new ModelAndView("AddPet", "msg", "<hr>saved successfully..");
			} else {
				return new ModelAndView("AddPet", "msg", "something went wrong try again");
			}
		}

	}
	@RequestMapping(value = "/Logout")
	public ModelAndView logOut(HttpServletRequest req) {
		
		HttpSession httpSession = req.getSession(false);
	
		
		httpSession.invalidate();
		return new ModelAndView("index", "msg", "logged out...");	
	}

}
