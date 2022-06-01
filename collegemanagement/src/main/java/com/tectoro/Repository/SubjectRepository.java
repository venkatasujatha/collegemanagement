package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
