package com.example.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebookstore.entity.CheckoutData;



public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
