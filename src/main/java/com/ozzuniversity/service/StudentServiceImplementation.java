package com.ozzuniversity.service;

import com.ozzuniversity.model.Student;
import com.ozzuniversity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public List<Student> getAll() {

        return studentRepository.findAll();
    }


    @Override
    public Student getById(Long id) {


        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(Student student, Long id) {

        Student existingStudent = studentRepository.findById(id).get();

        existingStudent.setFullname(student.getFullname());
        existingStudent.setLevel(student.getLevel());

        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long id) {

        studentRepository.deleteById(id);
    }
}
