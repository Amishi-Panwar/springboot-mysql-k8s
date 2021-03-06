package com.psl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.dao.StudentDao;
import com.psl.entity.Student;
import com.psl.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		System.out.println("aaa");
		studentService.addStudent(student);
		return "User added successfully";
	}
	
	
	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
	
