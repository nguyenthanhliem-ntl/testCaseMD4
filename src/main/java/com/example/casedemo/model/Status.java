package com.example.casedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;

    @Column
    private String statused;

    public Status() {
    }

    public Status(Long id, String statused) {
        Id = id;
        this.statused = statused;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStatused() {
        return statused;
    }

    public void setStatused(String statused) {
        this.statused = statused;
    }
}
