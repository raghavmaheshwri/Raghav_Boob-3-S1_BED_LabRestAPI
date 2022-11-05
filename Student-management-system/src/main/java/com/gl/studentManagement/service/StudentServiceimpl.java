package com.gl.studentManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.studentManagement.entities.Student;
import com.gl.studentManagement.repository.StudentRepository;

@Repository
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Transactional
	public Student findById(int theId) {
		Student student = new Student();
		
		student = studentRepository.findById(theId).get();

		return student;
	}

	@Transactional
	public void save(Student thestudent) {
		
		studentRepository.save(thestudent);
	}

	@Transactional
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
		
	}

}
