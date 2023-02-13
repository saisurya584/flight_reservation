package com.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app.entities.User;
import com.flight_reservation_app.repository.UserRepository;
import com.flight_reservation_app.services.UserServiceimp;

@Controller
public class UserController {
	@Autowired
	private UserServiceimp usi;
	@Autowired
	private UserRepository ur;
	
	@RequestMapping("/show")
	public String show()
	{
		return"login/login";
	}
	@RequestMapping("/showReg")
	public String showReg()
	{
		return"login/showReg";
	}

	@RequestMapping("/saveuser")
	public String savedate(@ModelAttribute("user") User user)
	{
		usi.saverecord(user);
		return"login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailid") String email,@RequestParam("password") String password,Model model)
	{  
		try {
		User user = ur.findByEmail(email);
		if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
	     return"findflights";
		}
		}
		catch(Exception e)
		{
			model.addAttribute("msg", "invaild password/email");
		}
		return"login/login";
	}
}
