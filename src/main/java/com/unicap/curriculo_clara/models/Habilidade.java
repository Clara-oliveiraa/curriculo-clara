package com.unicap.curriculo_clara.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table( name = "habilidade")
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeHabilidade;
    private String nivel;
}
