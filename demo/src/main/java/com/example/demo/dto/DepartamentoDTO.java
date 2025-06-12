package com.example.demo.dto;

import com.example.demo.entities.Departamento;

public class DepartamentoDTO {

    private Long id;
    private String nome;

    public DepartamentoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public DepartamentoDTO(Departamento entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
