package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
