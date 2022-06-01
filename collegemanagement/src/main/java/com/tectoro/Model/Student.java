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
public class Student {
	@Id
	private int sid;
	private String sname;
	private int mobileno;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="student_subject",
			joinColumns = {@JoinColumn(name="student_id")},
			inverseJoinColumns = {@JoinColumn(name="subject1_id")})
	
	private List<Subject> subject;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="dept_student",
	joinColumns = {@JoinColumn(name="student_id")},
	inverseJoinColumns = {@JoinColumn(name="dept_id")})
	
	private List<Department> department1;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<Department> getDepartment1() {
		return department1;
	}

	public void setDepartment1(List<Department> department1) {
		this.department1 = department1;
	}

	public Student(int sid, String sname, int mobileno, List<Subject> subject, List<Department> department1) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mobileno = mobileno;
		this.subject = subject;
		this.department1 = department1;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mobileno=" + mobileno + ", subject=" + subject
				+ ", department1=" + department1 + "]";
	}

		
}
