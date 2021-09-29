package com.psl.dao;


import org.springframework.data.repository.CrudRepository;


import com.psl.entity.Student;


public interface StudentDao extends CrudRepository<Student, Long> {

}
