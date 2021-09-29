package com.psl.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dao.StudentDao;
import com.psl.entity.Student;

@Service("studentService")
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	

	public void addStudent(Student student) {
		studentDao.save(student);
	}
	public List<Student> getStudents() {
		Iterable<Student> iterable = studentDao.findAll();
		List<Student> studentList = new LinkedList<>();
		iterable.forEach(stud -> studentList.add(stud));
		return studentList;
	}
	
//	public void deleteStudent(String name) {
//		studentDao.deleteByName(name);		
//	}
	

//	public String getStudent(String name) {
//		Optional<Student> student = studentDao.findByName(name);
//		if (student.isPresent())
//			return student.get().getName();
//		else 
//			return "No such Student Exists";
//	}
	
	

	
}

