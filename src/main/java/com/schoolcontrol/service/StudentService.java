package com.schoolcontrol.service;

import com.schoolcontrol.model.Student;
import com.schoolcontrol.repository.StudentRepository;
import com.schoolcontrol.request.StudentDTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student newStudent(StudentDTO studentDTO) {
        Student newStudent = new Student();
        newStudent.setName(studentDTO.getName());
        newStudent.setEmail(studentDTO.getEmail());
        newStudent.setPassword(studentDTO.getPassword());
        newStudent.setActive(true);
        newStudent.setJoiningDate(dateTodayFormatted());
        newStudent.setMean(0.0);

        return studentRepository.save(newStudent);
    }

    public List<Student> allStudentsActive(){
        return studentRepository.findAllByActive(true);
    }

    private String dateTodayFormatted(){
       LocalDateTime newDate = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       return newDate.format(formatter);

    }

}
