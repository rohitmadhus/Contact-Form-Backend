
package com.habile.backend.controller;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habile.backend.model.Age;
import com.habile.backend.model.City;
import com.habile.backend.model.Form;
import com.habile.backend.model.Name;
import com.habile.backend.model.Vage;
import com.habile.backend.model.Vcity;
import com.habile.backend.model.Vname;
import com.habile.backend.model.ContactUs;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class FormController {
	public static ArrayList<ContactUs> contactedPpl = new ArrayList<ContactUs>();
	
	public Form createForm1 () {
		Vname vn = new Vname(true,"alpha");
		Vage va = new Vage(false,10,20);
		Vcity vc =  new Vcity(false,true);
		Name n = new Name("Name","name","str",vn);
		Age a = new Age("Age","age","number",va);
		City c =  new City("City","city","list",Arrays.asList("chennai", "bangalore"),vc);
		Form f = new Form("Contact Us",n,a,c);
		return f;
	}
	public Form createForm2 () {
		Vname vn = new Vname(true,"alpha");
		Vage va = new Vage(false,10,100);
		Vcity vc =  new Vcity(true,false);
		Name n = new Name("Name","name","str",vn);
		Age a = new Age("Age","age","number",va);
		City c =  new City("City","city","list",Arrays.asList("chennai", "bangalore","calicut"),vc);
		Form f = new Form("Contact Us",n,a,c);
		return f;
	}	
	public Form createForm3 () {
		Vname vn = new Vname(true,"alpha");
		Vage va = new Vage(false,10,50);
		Vcity vc =  new Vcity(true,true);
		Name n = new Name("Name","name","str",vn);
		Age a = new Age("Age","age","number",va);
		City c =  new City("City","city","list",Arrays.asList("chennai", "bangalore","kochi"),vc);
		Form f = new Form("Contact Us",n,a,c);
		return f;
	}
	
	@GetMapping("/form/{id}")
	public Form getForm(@PathVariable int id){
		switch(id) {
		case 1 : return createForm1();
		case 2 : return createForm2();
		case 3 : return createForm3();
		default : return createForm1();
		}	
	}

	@PostMapping("/form")
	public void addUser(@RequestBody ContactUs contact) {
		System.out.println(contact.toString());
		contactedPpl.add(contact);
		for(ContactUs data : contactedPpl) {
			System.out.println(data.getCities()+"-"+data.getName()+"-"+data.getAge());			
		}				
	}
	
	
	
	

}
