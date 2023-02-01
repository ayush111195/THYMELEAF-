package com.springboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/about")
	
	public String about(Model model)
	{
	System.out.println("INSIDE THE ABOUT HANDLER");
	
	model.addAttribute("name", "Ayush");
	model.addAttribute("currentDate", new Date().toLocaleString());

		return "about" ;
		//about.html
	}
	
	//HANDLING ITERATION---->>>
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model m)
	{
		//CREATE A LIST--->>
		List<String> names = List.of("AYUSH,ANKIT,ARPIT,AMAN");
		m.addAttribute("listofname", names);
		return "iterate";
		
	}
	
	 //HANDLER FOR CONDITIONAL---->>>
	
	@GetMapping("/condition")
	public String conditinolalHandler( Model m)
	{
		System.out.println("//HANDLER FOR CONDITIONAL---->>>");
		
		m.addAttribute("isActive", true);
		m.addAttribute("gander", "f");
		List<Integer> list=List.of(333,877,656,776);
		m.addAttribute("mylist", list);
		return"condition";
		
	}
}
