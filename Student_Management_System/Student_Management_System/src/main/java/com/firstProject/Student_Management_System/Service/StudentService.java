package com.firstProject.Student_Management_System.Service;

import com.firstProject.Student_Management_System.Model.Student;

import java.util.List;


    public interface StudentService {
        Student createStudent(Student student);
        List<Student> getAllStudents();
        Student getStudentById(Long id);
        Student updateStudent(Long id, Student student);
        void deleteStudent(Long id);
    }

