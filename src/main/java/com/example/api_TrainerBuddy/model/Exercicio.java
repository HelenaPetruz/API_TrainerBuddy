package com.example.api_TrainerBuddy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exercicios", schema = "cl203013")
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exercicios", nullable = false)
    private Integer id;

    @Column(name = "nome_exercicio", nullable = false, length = 45)
    private String nome;

    @Column(name = "descricao", nullable = false, length = 1000)
    private String descricao;

    @Column(name = "imagem", length = 100)
    private String imagem;

    @Column(name = "link_IA", length = 150)
    private String linkIA;

    @Column(name = "video", length = 45)
    private String video;


    @ManyToOne
    @JoinColumn(name = "id_nivel_dificuldade_id", nullable = false)
    private NivelDificuldade nivelDificuldade;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getLinkIA() {
        return linkIA;
    }

    public void setLinkIA(String linkIA) {
        this.linkIA = linkIA;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public NivelDificuldade getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(NivelDificuldade nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}