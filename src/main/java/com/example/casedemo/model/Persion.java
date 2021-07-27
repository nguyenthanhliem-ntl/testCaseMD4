package com.example.casedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;



public class Persion {
    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private int phoneNumeber;

    @Column
    private String dateOfBirth;

    @Column
    private String address;

    @Column
    private String identity;

    @Column
    private int idRole;

    public Persion() {
    }

    public Persion(String name, String email, String password, int phoneNumber, String dateOfBirth, String address, String identity, int idRole) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumeber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.identity = identity;
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumeber() {
        return phoneNumeber;
    }

    public void setPhoneNumeber(int phoneNumeber) {
        this.phoneNumeber = phoneNumeber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
}
