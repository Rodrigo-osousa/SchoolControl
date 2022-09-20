package com.schoolcontrol.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Student extends PersonalData{


    private String studentRecord;

    private Double mean;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Exam> exam;
}
