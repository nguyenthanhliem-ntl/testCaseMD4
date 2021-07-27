package com.example.casedemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "gender")
@Data
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String name;


}
