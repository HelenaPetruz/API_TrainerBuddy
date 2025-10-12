package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "nivel_dificuldade")
public class NivelDificuldade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnivel_dificuldade", nullable = false)
    private Integer id;

    @Column(name = "nome_nivel_dificuldade", nullable = false, length = 45)
    private String nome;

    @OneToMany(mappedBy = "nivelDificuldade")
    private List<Exercicio> exercicios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
}