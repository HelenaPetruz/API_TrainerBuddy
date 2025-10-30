package com.example.api_TrainerBuddy.controller;

import com.example.api_TrainerBuddy.model.Exercicio;
import com.example.api_TrainerBuddy.repository.IExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercicios")
public class ExercicioControl {

    @Autowired
    IExercicioRepository exercicioRepository;

    @GetMapping("/todos")
    public List<Exercicio> buscarTodos(){
        return exercicioRepository.findAll();
    }

    @GetMapping("/{idNivelDificuldade}")
    public Optional<Exercicio> buscarPorNivelDificuldade(@PathVariable(value = "idNivelDificuldade") int idNivelDificuldade){
        return exercicioRepository.findByIdNivelDificuldade(idNivelDificuldade);
    }

    @GetMapping("/{nome}")
    public Optional<Exercicio> buscarPorNome(@PathVariable(value = "nome") String nome){
        return exercicioRepository.findByNome(nome);
    }

}
