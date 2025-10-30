package com.example.api_TrainerBuddy.model;
import jakarta.persistence.*;

@Entity
@Table(name = "cond_pagamento", schema = "cl203013")
public class CondPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cond_pagamento", nullable = false)
    private Integer id;

    @Column(name = "numero_do_cartao", nullable = false, length = 45)
    private String numeroDoCartao;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_plano", nullable = false)
    private Plano plano;

    @Column(name = "data_validade", nullable = false, length = 45)
    private String dataValidade;

    @Column(name = "cvv", nullable = false, length = 45)
    private String cvv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
