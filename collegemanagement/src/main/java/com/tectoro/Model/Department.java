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
public class Department {
	@Id
	private int id;
	private String dname;
	private String hodname;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="dept_teacher",
	joinColumns = {@JoinColumn(name="dept_id")},
	inverseJoinColumns = {@JoinColumn(name="teacher_id")})
	private List<Teacher> teacher;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="dept_student",
	joinColumns = {@JoinColumn(name="dept_id")},
	inverseJoinColumns = {@JoinColumn(name="student_id")})
	
	private List<Student> student1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getHodname() {
		return hodname;
	}

	public void setHodname(String hodname) {
		this.hodname = hodname;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudent1() {
		return student1;
	}

	public void setStudent1(List<Student> student1) {
		this.student1 = student1;
	}

	public Department(int id, String dname, String hodname, List<Teacher> teacher, List<Student> student1) {
		super();
		this.id = id;
		this.dname = dname;
		this.hodname = hodname;
		this.teacher = teacher;
		this.student1 = student1;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", hodname=" + hodname + ", teacher=" + teacher
				+ ", student1=" + student1 + "]";
	}

		

}
