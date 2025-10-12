package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil", nullable = false)
    private Integer id;

    @Column(name = "adm")
    private byte adm;

    @Column(name = "ativado")
    private byte ativado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte getAdm() {
        return adm;
    }

    public void setAdm(byte adm) {
        this.adm = adm;
    }

    public byte getAtivado() {
        return ativado;
    }

    public void setAtivado(byte ativado) {
        this.ativado = ativado;
    }
}