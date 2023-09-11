package com.ccee.desafio.cceeback.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ccee.desafio.cceeback.dto.AgenteDTO;
import com.ccee.desafio.cceeback.model.Agente;
import com.ccee.desafio.cceeback.service.AgenteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/agentes")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AgenteController {
    
    private final AgenteService agenteService;
    
    @PostMapping("processarFile")
    public void process(@RequestPart("file") MultipartFile file) throws Exception {
        agenteService.processarXml(file);
    }

    @GetMapping
    public List<AgenteDTO> findByRegiao(@PathParam("sigla")String sigla) {
        return  agenteService.findByRegiao(sigla);
    }
}
