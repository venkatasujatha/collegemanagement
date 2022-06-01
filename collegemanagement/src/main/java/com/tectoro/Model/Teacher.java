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

public class Teacher {
	
	
	@Id
	private int tid;
	private String tname;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="dept_teacher",
			joinColumns = {@JoinColumn(name="teacher_id")},
			inverseJoinColumns = {@JoinColumn(name="dept_id")}) 
	private List<Department> department;
	
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="subject_teacher",
	joinColumns = {@JoinColumn(name="teacher1_id")},
	inverseJoinColumns = {@JoinColumn(name="subject_id")})

	private List<Subject> subject;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public Teacher(int tid, String tname, List<Department> department, List<Subject> subject) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.department = department;
		this.subject = subject;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", department=" + department + ", subject=" + subject + "]";
	}

		
}
