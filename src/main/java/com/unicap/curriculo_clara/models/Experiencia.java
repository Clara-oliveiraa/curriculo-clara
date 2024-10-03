package com.unicap.curriculo_clara.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ValueGenerationType;

import java.time.LocalDate;

@Entity
@Data //gera automatica getters; setters; construtor; toString(); equals(); hashcode().
@Table(name = "experiencia_Profissional")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String cargo;
    private String empresa;
    private String periodo;

}


