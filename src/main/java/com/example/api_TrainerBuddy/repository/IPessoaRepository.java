package com.example.api_TrainerBuddy.repository;

import com.example.api_TrainerBuddy.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPessoaRepository extends JpaRepository<Pessoa, Integer> {
}
