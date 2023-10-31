package com.admin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.demo.binding.Admin;
import com.admin.demo.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	@PostMapping("/save")
	public ResponseEntity<Admin> saveData(@RequestBody Admin admin) {
		
		Admin a = service.saveData(admin);
		return new ResponseEntity<>(a,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAdmins")
	public List<Admin> getAllAdmins(){
		
		List<Admin> admins = service.getAdmins();
		return admins;
	}
}
