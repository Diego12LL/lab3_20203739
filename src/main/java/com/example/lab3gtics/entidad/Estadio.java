package com.example.lab3gtics.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estadio")
@Getter
@Setter
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstadio",nullable = false)
    private Integer idEstadio;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "provincia",nullable = false, length = 45)
    private String provincia;

    @Column(name = "club",nullable = false, length = 45)
    private String club;
}