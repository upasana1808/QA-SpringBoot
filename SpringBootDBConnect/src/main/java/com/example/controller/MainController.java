package com.example.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Product;

@RestController
public class MainController {
	public List<Product> list=new ArrayList();//list is empty
	//Product p1=new Product(101,"Mobile","Apple");
	//list.add(p1);
	
	
	@PostMapping("/create")
	public boolean create(@RequestBody Product prod)
	{
		return this.list.add(prod);
	}
	
	@GetMapping("/products")
	public List<Product> getList()
	{
		return this.list;
	}
	
	@PutMapping("/update/{id}")
	public Product update(@PathVariable int id,@RequestBody Product prod)
	{
		this.list.remove(id);//remove prod with that id=3
		this.list.add(id,prod);//added a new product at 3rd position
		return this.list.get(id);//reading the product at 3rd position
		
	}
	
	
	@GetMapping("/upasana")
	public String home()
	{
		return "My home is in India";
	}

}
