package com.liyu.springboot.service;

import com.liyu.springboot.Dao.StudentMapper;
import com.liyu.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getStudentById(String id) {

        return studentMapper.getOne(id);
    }

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public boolean addStudent(Student student) {
        studentMapper.insert(student);
        return true;
    }

    @Override
    public boolean changeStudent(Student student) {
        studentMapper.update(student);
        return true;
    }

    @Override
    public boolean deleteStudentById(String id) {
        studentMapper.delete(id);
        return true;
    }
}
