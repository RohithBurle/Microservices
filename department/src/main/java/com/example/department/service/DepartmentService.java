package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.model.Department;
import com.example.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	 @Autowired
	 private DepartmentRepository departmentRepository;

	    public Department saveDepartment(Department department) {
	        return departmentRepository.save(department);
	    }

	    public Department getDepartmentById(Long id) {
	        return departmentRepository.findById(id).get();
	    }

}
