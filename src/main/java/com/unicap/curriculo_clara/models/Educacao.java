package com.unicap.curriculo_clara.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table (name = "educacao")
public class Educacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String curso;
    private String instituicao;
    private String anoConclusao;

}
