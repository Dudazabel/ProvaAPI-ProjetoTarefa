package com.weg.maria_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.weg.maria_api.entity.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

    @Query(value = """
            SELECT t 
            
            """;)

}
