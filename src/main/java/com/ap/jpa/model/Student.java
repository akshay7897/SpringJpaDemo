package com.ap.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private String gender;
	private Integer rank;
		
	
	public Student() {
		
	}
	
	public Student(Integer id, String name, String gender, Integer rank) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.rank = rank;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", rank=" + rank + "]";
	}
	
	
	

}
