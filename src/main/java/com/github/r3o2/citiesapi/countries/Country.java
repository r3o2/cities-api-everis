package com.github.r3o2.citiesapi.countries;

import javax.persistence.*;

@Entity
@Table (name = "pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    //é necessário mapear por causa do banco de dados capturado
    @Column(name = "sigla")
    private String code;

    //não necessário mapear por causa do banco de dados capturado
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
