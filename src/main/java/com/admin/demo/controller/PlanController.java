package com.admin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.demo.binding.Plan;
import com.admin.demo.service.PlanService;

@RestController
public class PlanController {

	@Autowired
	private PlanService service;

	@PostMapping("/savePlan")
	public ResponseEntity<Plan> saveData(@RequestBody Plan plan) {

		Plan p = service.saveData(plan);
		return new ResponseEntity<>(p, HttpStatus.CREATED);
	}

	@GetMapping("/getPlans")
	public List<Plan> getAllAdmins() {

		List<Plan> plans = service.getPlans();
		return plans;
	}
}
