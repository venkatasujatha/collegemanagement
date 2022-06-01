package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
