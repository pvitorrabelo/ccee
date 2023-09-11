package com.ccee.desafio.cceeback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccee.desafio.cceeback.model.Agentes;

@Repository
public interface AgentesRepository extends JpaRepository<Agentes, Long> {
    

}
