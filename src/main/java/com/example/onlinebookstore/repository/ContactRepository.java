package com.example.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebookstore.entity.ContactData;



public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
