package com.ccee.desafio.cceeback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "compra")
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection(targetClass = BigDecimal.class)
    @CollectionTable(name = "valores_compra", joinColumns = @JoinColumn(name = "compra_id"))
    @Column(name = "valor", nullable = false)
    @XmlElement(name = "valor")
    private List<BigDecimal> valores;  

}
