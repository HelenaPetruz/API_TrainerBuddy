package com.example.api_TrainerBuddy.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "treino", schema = "cl203013")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_treino", nullable = false)
    private Integer id;

    @Column(name = "nome_treino", nullable = false, length = 45)
    private String nome;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "treino_do_buddy")
    private int treinoDoBuddy;

    @OneToMany(mappedBy = "treinoDoBuddy")
    private List<TreinosSalvos> treinosSalvos;

    public List<TreinosSalvos> getTreinosSalvos() {
        return treinosSalvos;
    }

    public void setTreinosSalvos(List<TreinosSalvos> treinosSalvos) {
        this.treinosSalvos = treinosSalvos;
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getTreinoDoBuddy() {
        return treinoDoBuddy;
    }

    public void setTreinoDoBuddy(int treinoDoBuddy) {
        this.treinoDoBuddy = treinoDoBuddy;
    }
}
