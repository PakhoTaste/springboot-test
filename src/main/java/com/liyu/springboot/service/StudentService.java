package com.liyu.springboot.service;

import com.liyu.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    Student getStudentById(String id);
    List<Student> getAll();
    boolean addStudent(Student student);
    boolean changeStudent(Student student);
    boolean deleteStudentById(String id);
}
