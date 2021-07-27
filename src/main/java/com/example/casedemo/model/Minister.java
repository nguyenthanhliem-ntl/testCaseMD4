package com.example.casedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "minister")
public class Minister extends Persion{

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long Id;

    public Minister() {
    }

    public Minister(Long id) {
        Id = id;
    }

    public Minister(String name, String email, String password, int phoneNumber, String dateOfBirth, String address, String identity, int idRole, Long id) {
        super(name, email, password, phoneNumber, dateOfBirth, address, identity, idRole);
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
