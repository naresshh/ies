package com.admin.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.demo.binding.Admin;
import com.admin.demo.entity.AdminEntity;
import com.admin.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repo;

	@Override
	public Admin saveData(Admin admin) {

		AdminEntity entity = new AdminEntity(admin.getFullName(), admin.getEmailId(), admin.getMobileNumber(),
				admin.getGender(), admin.getDob(), admin.getSsn());

		AdminEntity adminEntity = repo.save(entity);

		return new Admin(adminEntity.getFullName(), adminEntity.getEmailId(), adminEntity.getMobileNumber(),
				adminEntity.getGender(), adminEntity.getDob(), admin.getSsn());

	}

	@Override
	public List<Admin> getAdmins() {
		List<AdminEntity> adminEntities = repo.findAll();
		return adminEntities.stream().map(this::mapToAdmin).collect(Collectors.toList());
	}

	private Admin mapToAdmin(AdminEntity adminEntity) {
		Admin admin = new Admin();
		admin.setFullName(adminEntity.getFullName());
		admin.setEmailId(adminEntity.getEmailId());
		admin.setGender(adminEntity.getGender());
		admin.setMobileNumber(adminEntity.getMobileNumber());
		admin.setDob(adminEntity.getDob());
		admin.setSsn(adminEntity.getSsn());
		return admin;
	}
}
