package com.ccee.desafio.cceeback.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@XmlRootElement
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Agentes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @XmlAttribute
    private String versao;
    
    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "agentes_id")
    @ElementCollection(targetClass = Agente.class)
    @XmlElement
    private Collection<Agente> agente;
}
