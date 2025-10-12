package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "plano")
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano", nullable = false)
    private Integer id;

    @Column(name = "nome_plano", length = 45)
    private String nome;

    @Column(name = "valor")
    private BigDecimal valor;

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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}