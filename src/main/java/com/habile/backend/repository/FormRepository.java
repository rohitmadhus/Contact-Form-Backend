package com.habile.backend.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.habile.backend.model.Age;
import com.habile.backend.model.City;
import com.habile.backend.model.Form;
import com.habile.backend.model.Name;
import com.habile.backend.model.Vage;
import com.habile.backend.model.Vcity;
import com.habile.backend.model.Vname;

public class FormRepository {
	FormRepository(){
		
	}
	public Form createForm1 () {
		Vname vn = new Vname(true,"alpha");
		Vage va = new Vage(false,10,20);
		Vcity vc =  new Vcity(true,false);
		Name n = new Name("Name","name","str",vn);
		Age a = new Age("Name","age","number",va);
		City c =  new City("City","city","list",Arrays.asList("allergy1", "allergy2"),vc);
		Form f = new Form("Contact Us",n,a,c);
		return f;
	}
	public  Form formStructure(){		
		return createForm1();
		
	}

}
