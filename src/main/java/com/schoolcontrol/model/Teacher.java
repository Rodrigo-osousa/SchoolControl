package com.schoolcontrol.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
    public class Teacher extends PersonalData {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "room")
    private List<ClassRoom> classRooms;


}
