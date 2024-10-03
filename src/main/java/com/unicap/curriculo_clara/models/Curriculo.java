package com.unicap.curriculo_clara.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Curriculo")
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String linkedin;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "curriculo_id") // Adiciona a chave estrangeira na tabela
    private List<Experiencia> experiencias;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "curriculo_id")
    private List<Educacao> educacoes;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "curriculo_id")
    private List<Habilidade> habilidades;

}
