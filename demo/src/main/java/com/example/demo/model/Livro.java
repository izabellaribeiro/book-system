package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
public class Livro implements Serializable {
    @Id
    private Long id;
    private String titulo;
    private String nomeAutor;
    private String texto; // aquele que geralmente está presente no livro;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
