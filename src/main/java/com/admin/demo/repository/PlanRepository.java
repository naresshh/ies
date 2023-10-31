package com.admin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.demo.entity.PlanEntity;

public interface PlanRepository extends JpaRepository<PlanEntity, Integer>{

}
