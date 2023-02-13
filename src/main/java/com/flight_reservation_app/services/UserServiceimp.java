package com.flight_reservation_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation_app.entities.User;
import com.flight_reservation_app.repository.UserRepository;
@Service
public class UserServiceimp implements UserService {

	@Autowired
	private UserRepository ur;
	@Override
	public void saverecord(User user) {
	  ur.save(user);
	}

}
