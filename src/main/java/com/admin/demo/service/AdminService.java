package com.admin.demo.service;

import java.util.List;

import com.admin.demo.binding.Admin;

public interface AdminService {

	Admin saveData(Admin admin);

	List<Admin> getAdmins();

}
