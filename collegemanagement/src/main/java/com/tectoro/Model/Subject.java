package com.tectoro.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int id;
	private String sname;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="subject_teacher",
			joinColumns = {@JoinColumn(name="subject_id")},
			inverseJoinColumns = {@JoinColumn(name="teacher1_id")})
	private List<Teacher> teacher;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="student_subject",
			joinColumns = {@JoinColumn(name="subject1_id")},
			inverseJoinColumns = {@JoinColumn(name="student_id")})
	
	private List<Student> student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Subject(int id, String sname, List<Teacher> teacher, List<Student> student) {
		super();
		this.id = id;
		this.sname = sname;
		this.teacher = teacher;
		this.student = student;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", sname=" + sname + ", teacher=" + teacher + ", student=" + student + "]";
	}

		
		

}
