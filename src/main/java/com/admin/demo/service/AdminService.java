package com.admin.demo.service;

import java.util.List;

import com.admin.demo.binding.Admin;
import com.admin.demo.entity.AdminEntity;

public interface AdminService {

	Admin saveData(Admin admin);

	List<Admin> getAdmins();

}
