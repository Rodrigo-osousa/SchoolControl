package com.schoolcontrol.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Double grade;

    private String examDate;

    private String teacher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_record")
    private Student student;

}
