package com.ozzuniversity.service;

import com.ozzuniversity.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAll();

    Student getById(Long id);

    Student editStudent(Student student, Long id);

    void deleteStudent(Long id);
}
