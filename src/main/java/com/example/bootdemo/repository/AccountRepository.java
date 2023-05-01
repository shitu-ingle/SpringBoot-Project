package com.example.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	Account findByEmailAndPassword(String email, String password);

}
