package com.weg.maria_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.weg.maria_api.entity.Projeto;
import com.weg.maria_api.entity.Tarefa;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

    @Query("""
            SELECT t.id, t.titulo,
            FROM Tarefa t
            JOIN FETCH t.projeto
            WHERE t.projeto.id = :projetoId
            """)
    List<Tarefa> listarTarefasIdProjeto(@Param("projetoId") Long projetoId);
}
