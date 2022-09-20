package com.schoolcontrol.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String joiningDate;

    private boolean active;

    private String email;

    private String password;

}
