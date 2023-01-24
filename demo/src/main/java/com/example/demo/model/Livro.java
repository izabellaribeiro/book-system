package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Livro {
    @Id
    private Long id;
    private String titulo;
    private String nomeAutor;
    private String texto; // aquele que geralmente está presente no livro;
    //private Categoria categoria;
}
