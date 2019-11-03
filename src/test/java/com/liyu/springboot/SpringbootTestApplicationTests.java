package com.liyu.springboot;

import com.liyu.springboot.entity.Student;
import com.liyu.springboot.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Autowired
    private StudentService studentService;
    @Test
    void contextLoads() {
        Student student = studentService.getStudentById("001");
        System.out.println(student);
        List<Student> all = studentService.getAll();
        System.out.println(all);

    }

}
