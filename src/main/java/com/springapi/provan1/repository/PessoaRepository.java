package com.springapi.provan1.repository;

import com.springapi.provan1.entities.Pessoa;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


}