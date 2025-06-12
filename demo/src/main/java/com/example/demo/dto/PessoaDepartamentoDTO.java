package com.example.demo.dto;

import com.example.demo.entities.Pessoa;

public class PessoaDepartamentoDTO {

    private Long id;
    private String nome;
    private Double salario;

    private DepartamentoDTO departamentoDTO;

    public PessoaDepartamentoDTO() {
    }

    public PessoaDepartamentoDTO(Long id, String nome, Double salario, DepartamentoDTO departamentoDTO) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamentoDTO = departamentoDTO;
    }

    public PessoaDepartamentoDTO(Pessoa entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
        salario = entidade.getSalario();
        departamentoDTO = new DepartamentoDTO(entidade.getDepartamento());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public DepartamentoDTO getDepartamentoDTO() {
        return departamentoDTO;
    }
}
