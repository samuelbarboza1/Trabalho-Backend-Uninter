package com.example.demorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demorest.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
