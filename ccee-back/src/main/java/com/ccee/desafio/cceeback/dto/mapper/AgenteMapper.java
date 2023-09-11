package com.ccee.desafio.cceeback.dto.mapper;

import org.springframework.stereotype.Component;

import com.ccee.desafio.cceeback.dto.AgenteDTO;
import com.ccee.desafio.cceeback.model.Agente;

@Component
public class AgenteMapper {
     public AgenteDTO toDTO(Agente agente) {
        if (agente == null) {
            return null;
        }
        
        return new AgenteDTO(agente.getCodigo(), agente.getData());
    }
}
