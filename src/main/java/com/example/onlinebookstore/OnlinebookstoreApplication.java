package com.example.onlinebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinebookstoreApplication {

	public static void main(String[] args) {
		try 
		{
		
		SpringApplication.run(OnlinebookstoreApplication.class, args);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Oops!Sorry,Someting went to wrong");
		}
		finally
		{
			System.out.println("An error has occured Requested page not found!");
		}
	}

}
