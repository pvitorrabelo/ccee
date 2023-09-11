package com.ccee.desafio.cceeback.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@XmlRootElement(name = "agente")
@NoArgsConstructor(force = true)
@XmlAccessorType(XmlAccessType.FIELD)
public class Agente implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @XmlElement
    private Long codigo;
    
    @XmlElement
    private Date data;
    
    @XmlElement
    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "agente_id")
    @ElementCollection(targetClass = Regiao.class)
    private List<Regiao> regiao;
}
