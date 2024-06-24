/**
 * 
 */
package com.vinod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.entity.User;
import com.vinod.entity.UserRequest;
import com.vinod.service.UserService;

/**
 * 
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
@Autowired
UserService service;

@PostMapping("/saveUser")
public ResponseEntity<String> saveData(@RequestBody UserRequest requestClass ){
	 String message = service.saveUser(requestClass);
	 return ResponseEntity.ok().body(message);
	
}

@GetMapping("/getUser")
public ResponseEntity<List<User>> getUser(){
	 List<User> users= service.getAllUsers();
	 return ResponseEntity.ok().body(users);
	
}

}
