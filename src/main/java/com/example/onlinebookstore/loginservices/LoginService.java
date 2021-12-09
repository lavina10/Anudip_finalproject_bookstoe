package com.example.onlinebookstore.loginservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinebookstore.logindomain.Login;
import com.example.onlinebookstore.loginrepository.loginRepository;

@Service
public class LoginService {
	@Autowired
	private loginRepository repo;
	  
	  public Login login(String username, String password) {
	  Login user = repo.findByEmailAndPassword(username, password);
	  return user;
	 
	}

}
