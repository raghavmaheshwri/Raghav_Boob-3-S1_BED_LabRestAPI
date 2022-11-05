package com.gl.studentManagement.service;

import java.util.List;

import com.gl.studentManagement.entities.Student;

public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);
	
}
