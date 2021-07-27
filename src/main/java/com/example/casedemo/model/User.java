package com.example.casedemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data

@Table(name = "use")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private int phone;

    @Column
    private String dateOfBith;

    @Column
    private String address;






}
