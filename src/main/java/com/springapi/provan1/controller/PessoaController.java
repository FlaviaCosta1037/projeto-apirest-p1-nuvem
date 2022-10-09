package com.springapi.provan1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.provan1.entities.Pessoa;
import com.springapi.provan1.repository.PessoaRepository;

@RestController
@RequestMapping("/")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping(path="/usuarios")
    public List<Pessoa> pessoa() {
        List<Pessoa> pessoa = pessoaRepository.findAll();
        return pessoa;
    }

    @PostMapping(path="/usuarios/adicionar")
    public List<Pessoa> Post(@RequestBody Pessoa pessoa) {
        return pessoaRepository.saveAll(Arrays.asList(pessoa));
    }

    @PutMapping(path="/usuarios/editar")
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa) {

        Pessoa cadAtualizado = pessoaRepository.save(pessoa);

        return new ResponseEntity<Pessoa>(cadAtualizado, HttpStatus.OK);
    }

    @DeleteMapping(path="/usuarios/deletar")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long id) {
        pessoaRepository.deleteById(id);

        return new ResponseEntity<String>("User deletado com sucesso", HttpStatus.OK);
    }
}