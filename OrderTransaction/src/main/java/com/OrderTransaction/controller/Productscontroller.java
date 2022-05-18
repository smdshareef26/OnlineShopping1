package com.app.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Products;
import com.app.repository.Productsrepository;
import com.app.service.Productsservice;

@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/api/v1")
@RestController
public class Productscontroller {
	
	 // @Autowired
		//Productsservice ps;
	    
	   // @GetMapping("/prod")
	    //public List<Products> prodlist()
	    
	   // {
	    //	return ps.prodlist();
	   // }
	
	  @Autowired
	    private Productsrepository Productsrepository;

	    @GetMapping("/prod")
	    public List<Products> getAllproducts() {
	        return Productsrepository.findAll();
	    }

	    
	    @PostMapping("/prod")
	    public Products createProducts(@Valid @RequestBody Products prod) {
	        return Productsrepository.save(prod);
	    }
	   
}
