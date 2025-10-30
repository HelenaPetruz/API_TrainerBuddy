package com.example.api_TrainerBuddy.model;
import jakarta.persistence.*;

@Entity
@Table(name = "treinos_salvos")
public class TreinosSalvos {

    @ManyToOne
    @JoinColumn(name = "id_pessoa", nullable = false)
    private int usuario;

    @ManyToOne
    @JoinColumn(name = "id_treino_do_buddy", nullable = false)
    private int treinoDoBuddy;

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getTreinoDoBuddy() {
        return treinoDoBuddy;
    }

    public void setTreinoDoBuddy(int treinoDoBuddy) {
        this.treinoDoBuddy = treinoDoBuddy;
    }
}
