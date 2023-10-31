package com.roadisland.ies.service;

import com.roadisland.ies.entity.CitizenRequest;
import com.roadisland.ies.entity.CitizenResponse;

public interface CitizenService {

	CitizenResponse getStateName(CitizenRequest request);

}
