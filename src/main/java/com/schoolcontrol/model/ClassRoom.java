package com.schoolcontrol.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String room;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classRoom")
    private List<Student> student;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "classRoom")
    private List<Teacher> teacher;
}
