package com.tectoro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Department;
import com.tectoro.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentrepository;

	@Override
	public Department saveDept(Department department) {
		
		return departmentrepository.save(department);
		
	}

}
