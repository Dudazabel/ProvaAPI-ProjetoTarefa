package com.weg.maria_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.weg.maria_api.entity.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

    @Query("""
            SELECT t
            FROM 
            """;)
}
