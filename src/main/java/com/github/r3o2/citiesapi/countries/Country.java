package com.github.r3o2.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;
 //é necessário mapear por causa do banco de dados
    @Column(name = "sigla")
    private String code;
    //não necessário mapear por causa do banco de dados
    private Integer bacen;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
