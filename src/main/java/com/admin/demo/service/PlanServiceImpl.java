package com.admin.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.demo.binding.Plan;
import com.admin.demo.entity.PlanEntity;
import com.admin.demo.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository repo;

	@Override
	public Plan saveData(Plan plan) {

		PlanEntity entity = new PlanEntity(plan.getPlanName(), plan.getPlanStartDate(), plan.getPlanEndDate(),
				plan.getPlanCategory());

		PlanEntity planEntity = repo.save(entity);

		return new Plan(planEntity.getPlanName(), planEntity.getPlanStartDate(), planEntity.getPlanEndDate(),
				planEntity.getPlanCategory());
	}

	@Override
	public List<Plan> getPlans() {
		List<PlanEntity> planEntities = repo.findAll();
		return planEntities.stream().map(this::mapToAdmin).collect(Collectors.toList());
	}

	private Plan mapToAdmin(PlanEntity planEntity) {
		Plan plan = new Plan();
		plan.setPlanName(planEntity.getPlanName());
		plan.setPlanStartDate(planEntity.getPlanStartDate());
		plan.setPlanEndDate(planEntity.getPlanEndDate());
		plan.setPlanCategory(planEntity.getPlanCategory());
		return plan;
	}

}
