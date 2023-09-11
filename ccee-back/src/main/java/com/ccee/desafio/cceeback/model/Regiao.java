package com.ccee.desafio.cceeback.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity
@XmlRootElement(name = "regiao")
@XmlAccessorType(XmlAccessType.FIELD)
public class Regiao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @XmlAttribute
    private String sigla;
    
    @XmlElement
    @OneToOne(cascade=CascadeType.PERSIST)
    private Geracao geracao;

    @XmlElement
    @OneToOne(cascade=CascadeType.PERSIST)
    private Compra compra;

    @XmlElement
    @OneToOne(cascade=CascadeType.PERSIST)
    private PrecoMedio precoMedio;

    
    
}
