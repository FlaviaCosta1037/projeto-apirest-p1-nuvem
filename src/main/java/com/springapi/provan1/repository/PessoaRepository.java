package com.springapi.provan1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springapi.provan1.entities.Pessoa;

@RepositoryRestResource(collectionResourceRel= "pessoa", path = "pessoa")
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    

}