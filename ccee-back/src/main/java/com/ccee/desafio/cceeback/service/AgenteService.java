package com.ccee.desafio.cceeback.service;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ccee.desafio.cceeback.dto.AgenteDTO;
import com.ccee.desafio.cceeback.dto.mapper.AgenteMapper;
import com.ccee.desafio.cceeback.model.Agente;
import com.ccee.desafio.cceeback.model.Agentes;
import com.ccee.desafio.cceeback.repository.AgenteRepository;
import com.ccee.desafio.cceeback.repository.AgentesRepository;

@Service
public class AgenteService {
    private AgentesRepository agentesRepository;
   
    private AgenteRepository agenteRepository;
    
    private final AgenteMapper agenteMapper;

    public AgenteService(AgentesRepository agentesRepository, AgenteRepository agenteRepository, AgenteMapper agenteMapper) {
        this.agentesRepository = agentesRepository;
        this.agenteRepository = agenteRepository;
        this.agenteMapper = agenteMapper;
    }

    public Agentes processarXml(final MultipartFile xmlFile) throws JAXBException, IOException {
        final JAXBContext jc = JAXBContext.newInstance(Agentes.class);
        final Unmarshaller unmarshaller = jc.createUnmarshaller();

        final StringReader reader = new StringReader(new String(xmlFile.getBytes(), StandardCharsets.UTF_8));
        final Agentes agentes = (Agentes) unmarshaller.unmarshal(reader);

        agentes.getAgente().stream().map(Agente::getCodigo).forEach(System.out::println);

        agentesRepository.save(agentes);

        return agentes;
    }

    public List<AgenteDTO> findByRegiao(String sigla){
        List<Agente> listaRegiao = this.agenteRepository.findByRegiaoSigla(sigla);
        return listaRegiao.stream()
                .map(agenteMapper::toDTO)
                .collect(Collectors.toList());

        
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
    Set<Object> seen = ConcurrentHashMap.newKeySet();
    return t -> seen.add(keyExtractor.apply(t));
}

    
}
