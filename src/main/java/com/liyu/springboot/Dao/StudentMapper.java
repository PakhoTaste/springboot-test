package com.liyu.springboot.Dao;

import com.liyu.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
@Mapper
public interface StudentMapper {
    List<Student> getAll();
    Student getOne(String id);
    boolean insert(Student student);
    boolean update(Student student);
    boolean delete(String id);
}
