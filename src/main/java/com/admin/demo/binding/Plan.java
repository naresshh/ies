package com.admin.demo.binding;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Plan {

	private Integer id;
	private String planName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate planStartDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate planEndDate;
	private String planCategory;
	public Plan() {
		// TODO Auto-generated constructor stub
	}
	
	public Plan(String planName, LocalDate planStartDate, LocalDate planEndDate, String planCategory) {
		super();
		this.planName = planName;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.planCategory = planCategory;
	}

//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getPlanCategory() {
		return planCategory;
	}
	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}
	
	
}
