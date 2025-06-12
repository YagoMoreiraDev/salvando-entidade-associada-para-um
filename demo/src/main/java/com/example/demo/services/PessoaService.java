package com.example.demo.services;

import com.example.demo.dto.PessoaDepartamentoDTO;
import com.example.demo.entities.Departamento;
import com.example.demo.entities.Pessoa;
import com.example.demo.repositories.DepartamentoRepository;
import com.example.demo.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final DepartamentoRepository departamentoRepository;

    public PessoaService(PessoaRepository pessoaRepository, DepartamentoRepository departamentoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.departamentoRepository = departamentoRepository;
    }

    public PessoaDepartamentoDTO inserirNovo(PessoaDepartamentoDTO dto) {
        var pessoa = new Pessoa();
        pessoa.setNome(dto.getNome());
        pessoa.setSalario(dto.getSalario());

        Departamento departamento = departamentoRepository.getReferenceById(dto.getDepartamentoDTO().getId());
        pessoa.setDepartamento(departamento);
        pessoa = pessoaRepository.save(pessoa);

        return new PessoaDepartamentoDTO(pessoa);
    }
}

