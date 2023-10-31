package com.admin.demo.service;

import java.util.List;

import com.admin.demo.binding.Plan;

public interface PlanService {

	Plan saveData(Plan plan);

	List<Plan> getPlans();
}
