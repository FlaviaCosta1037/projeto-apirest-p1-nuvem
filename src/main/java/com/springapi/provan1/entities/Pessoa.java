package com.springapi.provan1.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private Long idade;
    private Double peso;
    private Double altura;
    private String email;
    private String fone;

    public Pessoa() {
    }

    public Pessoa(String nome, Long idade, Double peso, Double altura, String email, String fone) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.email = email;
        this.fone = fone;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdade() {
        return idade;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura
                + ", email=" + email + ", fone=" + fone + "]";
    }
}
