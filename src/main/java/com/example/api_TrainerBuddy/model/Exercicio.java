package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exercicios", schema = "cl203013")
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}