package com.example.onlinebookstore.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinebookstore.entity.UserData;
import com.example.onlinebookstore.repository.UserRepository;



@RestController
@RequestMapping("/sign")



public class ApiController {
	@Autowired
	UserRepository ss;
	@GetMapping("/users")
	public List<UserData>get(){
	return ss.findAll();
	}


}
