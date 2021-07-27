package com.example.casedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends Persion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long Id;

    public Admin() {
    }

    public Admin(Long id) {
        Id = id;
    }

    public Admin(String name, String email, String password, int phoneNumber, String dateOfBirth, String address, String identity, int idRole, Long id) {
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
