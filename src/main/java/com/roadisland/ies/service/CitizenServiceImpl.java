package com.roadisland.ies.service;

import org.springframework.stereotype.Service;

import com.roadisland.ies.entity.CitizenRequest;
import com.roadisland.ies.entity.CitizenResponse;

@Service
public class CitizenServiceImpl implements CitizenService {

	@Override
	public CitizenResponse getStateName(CitizenRequest request) {

		CitizenResponse response = new CitizenResponse();
		response.setName(request.getName());
		response.setDob(request.getDob());
		response.setGender(request.getGender());
		response.setSsn(request.getSsn());

		if (request.getSsn().startsWith("1")) {
			response.setStateName("NewJersey");
		} else if (request.getSsn().startsWith("2")) {
			response.setStateName("Ohio");
		} else if (request.getSsn().startsWith("3")) {
			response.setStateName("Texas");
		} else if (request.getSsn().startsWith("4")) {
			response.setStateName("California");
		} else if (request.getSsn().startsWith("5")) {
			response.setStateName("RoadIsland");
		} else if (request.getSsn().startsWith("6")) {
			response.setStateName("Kentucky");
		} else {
			response.setSsn("Invalid SSN");
		}
		return response;
	}

}
