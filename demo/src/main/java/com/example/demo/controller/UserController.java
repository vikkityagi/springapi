package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@ControllerAdvice
public class UserController {
	
	@Autowired
	UserRepository repo;
	
	
	@PostMapping(path="/add")
	public UserModel addUser(@RequestBody UserModel usermodel) {
		repo.save(usermodel);
		return usermodel;
	}
	
	
	@GetMapping(path = "/shows")
	public List<UserModel> getUsers() {
		return repo.findAll();
	}
	
	
//	@PostMapping(path="/login")
//	@ExceptionHandler(Exception.class)
//	public UserModel loginUser(@RequestBody UserModel usermodel,Exception ex, 
//            HttpServletRequest request, HttpServletResponse response) {
//		UserModel  uname = repo.findByName(usermodel.getName());
//		UserModel uemail = repo.findByUseremail1(usermodel.getUseremail());
//		System.out.println(uname);
//		System.out.println(uname.getUseremail());
//		System.out.println(usermodel.getUseremail());
//		if(uname.getUseremail().equals(usermodel.getUseremail())) {
//			return repo.findById(101).orElse(uemail);
//		}else {
//			return null;
//		}
//		
//	}
	
	@PostMapping(path="/show")
	public UserModel getUser(@RequestBody UserModel usermodel) {
		return repo.findById(usermodel.getEid()).orElse(null);
	}
	
	@GetMapping(path="/check")
	public long count() {
		return repo.count();
	}
	
}
