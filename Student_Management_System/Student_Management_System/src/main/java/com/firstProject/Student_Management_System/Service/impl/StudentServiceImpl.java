package com.firstProject.Student_Management_System.Service.impl;


import com.firstProject.Student_Management_System.Exception.ResourceNotFoundException;
import com.firstProject.Student_Management_System.Model.Student;
import com.firstProject.Student_Management_System.Repository.StudentRepository;
import com.firstProject.Student_Management_System.Service.StudentService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student createStudent(Student student) {
        if (student.getEmail() != null && repo.existsByEmail(student.getEmail())) {
            throw new IllegalArgumentException("Email already in use");
        }
        return repo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = getStudentById(id);
        existing.setName(student.getName());
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        return repo.save(existing);
    }

    @Override
    public void deleteStudent(Long id) {
        Student existing = getStudentById(id);
        repo.delete(existing);
}
}
