package com.example.onlinebookstore.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebookstore.logindomain.Login;



public interface loginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}


