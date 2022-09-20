package com.schoolcontrol.controller;

import com.schoolcontrol.model.Student;
import com.schoolcontrol.request.StudentDTO;
import com.schoolcontrol.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/newStudent")
    public Student newStudent(StudentDTO studentDTO) {
        return studentService.newStudent(studentDTO);
    }

    @GetMapping("allActiveStudents")
    public List<Student> allActiveStudents() {
        return studentService.allStudentsActive();
    }
}
