package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.Model.Department;
import com.tectoro.Service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveDept(@RequestBody Department department)
	{
		departmentservice.saveDept(department);
		return ResponseEntity.ok("save");
		
	}

}
