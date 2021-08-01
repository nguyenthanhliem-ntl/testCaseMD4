package com.example.casedemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "point")
@Data
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private int student_id;

    @Column
    private  int minister_id;

    @Column
    private int subject_id;

    @Column
    private float point;

    @ManyToMany(mappedBy = "pointList")
    private List<Student> studentList;

    @ManyToOne
    @JoinColumn(name = "minister_id")
    private Minister minister;
}
