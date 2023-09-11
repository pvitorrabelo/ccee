package com.ccee.desafio.cceeback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccee.desafio.cceeback.model.Agente;

@Repository
public interface AgenteRepository extends JpaRepository<Agente, Long> {
    
    
    List<Agente> findByRegiaoSigla(String sigla);
}
