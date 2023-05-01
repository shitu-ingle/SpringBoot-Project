package com.example.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Account;
import com.example.bootdemo.repository.AccountRepository;

@RestController
public class AccountController {
	@Autowired
	AccountRepository ar;
	
	@PostMapping("/save1")
	public String savedata(@RequestBody Account a)
	{
		ar.save(a);
		return "data inserted ";
	}
	@GetMapping("/login")
	public String login(@RequestBody Account a)
	{
		Account account=ar.findByEmailAndPassword(a.getEmail(),a.getPassword());
		if(account!=null)
		{
			return "Login Successfully ";
		}
		else
				
		return "Login unsucessfull ";
		
		
	}
}
