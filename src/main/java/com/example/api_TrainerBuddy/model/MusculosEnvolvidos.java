package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musculos_envolvidos")
public class MusculosEnvolvidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_musculos_envolvidos", nullable = false)
    private Integer id;

    @Column(name = "nome_musculo", length = 45)
    private String nome;

    @Column(name = "imagem", length = 100)
    private String imagem;

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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
