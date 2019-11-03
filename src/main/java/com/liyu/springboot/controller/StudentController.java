package com.liyu.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyu.springboot.entity.Student;
import com.liyu.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping(value = "students")
    public String student(Model model, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size)throws Exception{
        PageHelper.startPage(start,size,"id asc");
        List<Student> studentList = studentService.getAll();
        PageInfo<Student> page = new PageInfo<>(studentList);
        model.addAttribute("page", page);

        return "Student/StudentView";
    }

    @RequestMapping("/perpareInsert")
    public String perpareInsert()throws Exception{
        return "Student/StudentAdd";
    }

    /**
     * 新增
     * @param student
     * @return
     * @throws Exception
     */
    @PostMapping(value = "students")
    public String studentInsert(Student student)throws Exception{
        boolean success = studentService.addStudent(student);

        return "redirect:students";
    }
    @RequestMapping("/perpareUpdate")
    public String perpareUpdate(Model model,String id)throws Exception{
        Student student = studentService.getStudentById(id);
        model.addAttribute("name",student.getName());
        model.addAttribute("id",student.getId());
        return "Student/StudentEdit";
    }
    /**
     * 修改
     */
    @RequestMapping("/students/update")
    public String studentUpdate(Student student)throws Exception{
        boolean success = studentService.changeStudent(student);

        return "redirect:/students";
    }
    @RequestMapping(value = "/student/delete")
    public String studentDelete(String id)throws Exception{
        boolean success = studentService.deleteStudentById(id);
        return "redirect:/students";
    }
    @GetMapping(value="query")
    public String queryStu(Model model,String id)throws Exception{
        try{
            Student student = studentService.getStudentById(id);
            model.addAttribute("s",student);
        }catch(RuntimeException e ){
            throw new Exception(e);
        }
        return "Student/StudentQuery";
    }
}
