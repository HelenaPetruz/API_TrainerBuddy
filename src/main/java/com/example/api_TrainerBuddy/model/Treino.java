package com.example.api_TrainerBuddy.model;
import jakarta.persistence.*;

@Entity
@Table(name = "treino", schema = "cl203013")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_treino", nullable = false)
    private Integer id;

}
