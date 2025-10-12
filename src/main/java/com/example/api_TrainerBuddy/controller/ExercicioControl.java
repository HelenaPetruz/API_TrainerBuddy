package com.example.api_TrainerBuddy.controller;

import com.example.api_TrainerBuddy.model.Exercicio;
import com.example.api_TrainerBuddy.repository.IExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioControl {

    @Autowired
    IExercicioRepository exercicioRepository;

    @GetMapping("")
    public List<Exercicio> buscarTodos(){
        return exercicioRepository.findAll();
    }

}
