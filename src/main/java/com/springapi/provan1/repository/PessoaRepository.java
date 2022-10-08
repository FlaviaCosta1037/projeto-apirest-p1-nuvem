package com.springapi.provan1.repository;

import com.springapi.provan1.entities.Pessoa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    @Query(value= "select * from bd_dados", nativeQuery = true)
    List<Pessoa> findAllAtivas();

}