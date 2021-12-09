package com.example.onlinebookstore.controller;
import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.onlinebookstore.entity.CheckoutData;
import com.example.onlinebookstore.entity.ContactData;
import com.example.onlinebookstore.entity.LoginData;
import com.example.onlinebookstore.entity.UserData;
import com.example.onlinebookstore.repository.CheckRepository;
import com.example.onlinebookstore.repository.ContactRepository;
import com.example.onlinebookstore.repository.UserRepository;




@Controller




public class HomeController {
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	@GetMapping("/action")
	public String action()
	{
		return "action";
	}
	
	@GetMapping("/novel")
	public String novel()
	{
		return "novel";
	}
	
	@GetMapping("/regional")
	public String regional()
	{
		return "regional";
	}
	
	@GetMapping("/story")
	public String story()
	{
		return "story";
	}
	
	@GetMapping("/business")
	public String business()
	{
		return "business";
	}
	
	@GetMapping("/child")
	public String child()
	{
		return "child";
	}
	
	@GetMapping("/bhagat")
	public String bhagat()
	{
		return "bhagat";
	}
	
	@GetMapping("/pritam")
	public String pritam()
	{
		return "pritam";
	}
	
	@GetMapping("/tagore")
	public String tagore()
	{
		return "tagore";
	}
	
	@GetMapping("/narayan")
	public String narayan()
	{
		return "narayan";
	}
	
	@GetMapping("/harray")
	public String harray()
	{
		return "harray";
	}
	
	@GetMapping("/avenger")
	public String avenger()
	{
		return "avenger";
	}
	
	@GetMapping("/cruel")
	public String cruel()
	{
		return "cruel";
	}
	
	@GetMapping("/glass")
	public String glass()
	{
		return "glass";
	}
	
	@GetMapping("/about")
	public String aboutus()
	{
		return "about";
	}
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/checkoutnote";
	}
	
	
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData u, HttpSession session)
	{
		con.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/home";
	}
	
}
	