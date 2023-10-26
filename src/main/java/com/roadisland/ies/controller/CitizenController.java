package com.roadisland.ies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roadisland.ies.entity.CitizenRequest;
import com.roadisland.ies.entity.CitizenResponse;
import com.roadisland.ies.service.CitizenService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class CitizenController {
	
	@Autowired
	private CitizenService service;
	
    @Operation(
            summary = "Create User REST API",
            description = "Create User REST API is used to save user in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
	@PostMapping("/getStateName")
	public ResponseEntity<CitizenResponse> getStateName(@RequestBody CitizenRequest request) {
		
		CitizenResponse response = service.getStateName(request);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}


}
