package com.vinod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.entity.User;
import com.vinod.entity.UserRequest;
import com.vinod.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public String saveUser(UserRequest requestClass) {
		String message = "Save Failed";
        System.out.println(requestClass);
        if(requestClass != null) {
            User user = new User();
            user.setName(requestClass.getName());
            user.setUsername(requestClass.getUsername());
            user.setEmail(requestClass.getEmail());
            user.setPhone(requestClass.getPhone());
            user.setWebsite(requestClass.getWebsite());
            userRepo.save(user);
            System.out.println(user);
            message = "Employee details Saved Successfully";
        }
        return message;
    }

	public List<User> getAllUsers() {
		return userRepo.vinod();
	}

}
