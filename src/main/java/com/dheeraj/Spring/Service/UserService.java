package com.dheeraj.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dheeraj.Spring.Entity.User;
import com.dheeraj.Spring.Repository.UserRepository;



@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	public User singup(User user)
	{
		return userRepo.save(user);
	}

	public boolean login(String email, String password) {
	     User userEmail=userRepo.findByuserEmail(email);

	     if(userEmail!=null) {
	    	if(userEmail.getPasword().equals(password)) {
	    	 return true;
	    	}
	     }
		
		return false;
	}

}
