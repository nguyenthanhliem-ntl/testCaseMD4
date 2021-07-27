package com.example.casedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student extends Persion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long Id;

    public Student(Long id) {
        Id = id;
    }

    public Student(String name, String email, String password, int phoneNumber, String dateOfBirth, String address, String identity, int idRole, Long id) {
        super(name, email, password, phoneNumber, dateOfBirth, address, identity, idRole);
        Id = id;
    }

    public Student() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
