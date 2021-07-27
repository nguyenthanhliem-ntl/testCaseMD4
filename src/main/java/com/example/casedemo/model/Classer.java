package com.example.casedemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "class")

public class Classer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String nameClass;

    public Classer() {
    }

    public Classer(Long id, String nameClass) {
        Id = id;
        this.nameClass = nameClass;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
    @OneToMany(targetEntity = Teacher.class)
    private List<Teacher> teachers;
}
