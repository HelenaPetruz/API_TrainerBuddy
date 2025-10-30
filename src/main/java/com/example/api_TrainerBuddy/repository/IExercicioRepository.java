package com.example.api_TrainerBuddy.repository;

import com.example.api_TrainerBuddy.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IExercicioRepository extends JpaRepository<Exercicio, Integer> {

    @Query("select e from exercicios e where e.nome_exercicio like ?1%")
    public Optional<Exercicio> findByNome(String nome);

    @Query("select e from exercicios e where e.id_nivel_dificuldade_id = ?1%")
    public Optional<Exercicio> findByIdNivelDificuldade(int idNivelDificuldade);

}
