package com.example.casedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher extends Persion {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long Id;

    public Teacher() {
    }

    public Teacher(Long id) {
        Id = id;
    }

    public Teacher(String name, String email, String password, int phoneNumber, String dateOfBirth, String address, String identity, int idRole, Long id) {
        super(name, email, password, phoneNumber, dateOfBirth, address, identity, idRole);
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
    @ManyToOne
    @JoinColumn(name = "classer_id")
    private Classer classer;
}
