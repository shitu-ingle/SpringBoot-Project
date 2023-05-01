package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByName(String name);
	List<Product> findByCategory(String category);
	List<Product> findByCategoryGreaterThan(String category);
	List<Product> findByCategoryLessThan(String category);
	List<Product> findByCategoryGreaterThanEqual(String category);
	
}
