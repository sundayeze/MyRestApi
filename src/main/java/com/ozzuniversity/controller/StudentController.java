package com.ozzuniversity.controller;

import com.ozzuniversity.model.Student;
import com.ozzuniversity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){


        return studentService.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student> allStudent(){


        return studentService.getAll();
    }

    @GetMapping("/student/{id}")
    public Student byId(@PathVariable("id") Long id){


        return studentService.getById(id);
    }


    @PutMapping("/student/{id}")
    public Student update(@PathVariable("id") Long id, @RequestBody Student student){


        return studentService.editStudent(student, id) ;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long id){

        studentService.deleteStudent(id);

        return "Student deleted successfully";
    }

}
