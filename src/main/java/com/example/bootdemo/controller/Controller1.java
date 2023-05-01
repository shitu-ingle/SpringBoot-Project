package com.example.bootdemo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.bootdemo.dto.Product;
import com.example.bootdemo.repository.ProductRepository;

@RestController
public class Controller1 {
@Autowired
ProductRepository pr;

@PostMapping("/save")
public String save(@RequestBody Product p)
{
pr.save(p);
return "data save successfully";
}
@GetMapping("/fetchprobyid")
public Product fetchdatabyid(@RequestParam int id)
{
	Optional<Product> ou = pr.findById(id);
	Product p=ou.get();
	return p;
}
@GetMapping("/fetchpobyname")
public List<Product> findname(@RequestParam String name)
{
	List<Product> p=pr.findByName(name);
	return p;

}

@GetMapping("/fetchbycategory")
public List<Product> findByCategory(@RequestParam String category)
{
	List<Product> p=pr.findByCategory(category);
	return p;
}


@GetMapping("/fetchbycategoryg")
public List<Product> findByCategoryg(@RequestParam String category)
{
	List<Product> p=pr.findByCategoryGreaterThan(category);
	return p;
}

@GetMapping("/fetchbycategoryg")
public List<Product> findByCategoryl(@RequestParam String category)
{
	List<Product> p=pr.findByCategoryLessThan(category);
	return p;
}
}