//package com.gl.studentManagement.controller;
//
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.gl.studentManagement.entities.Student;
//
//@Controller()
//@RequestMapping("/")
//public class HomeController {
//	
//	@RequestMapping("/")
//	public String hello() {
//		List<Student> theStudents = studentService.findAll();
//		
//
//		// add to the spring model
//		theModel.addAttribute("Students", theStudents);
//
//		return "list-Students";
//	}
//}
