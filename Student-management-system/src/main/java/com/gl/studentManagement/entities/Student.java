package com.gl.studentManagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	private String fname;
	
	private String lname;
	
	private String course;
	
	private String country;
	
    public Student(String firstName, String lastName, String course, String country) {
		
		this.fname = firstName;
		this.lname = lastName;
		this.course = course;
		this.country = country;
	}

	
	
	
}
