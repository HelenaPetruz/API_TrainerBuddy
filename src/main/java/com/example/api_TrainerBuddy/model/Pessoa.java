package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpessoa", nullable = false)
    private Integer id;

    @Column(name = "nome_usuario", length = 45)
    private String nome;

    @Column(name = "cpf", length = 45)
    private String cpf;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "senha", length = 130)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "id_plano")
    private Plano plano;

    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;

    @OneToMany(mappedBy = "usuario")
    private List<Faturamento> faturamentos;

    public List<Faturamento> getFaturamentos() {
        return faturamentos;
    }

    public void setFaturamentos(List<Faturamento> faturamentos) {
        this.faturamentos = faturamentos;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}