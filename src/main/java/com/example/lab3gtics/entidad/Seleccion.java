package com.example.lab3gtics.entidad;

import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seleccion")
@Getter
@Setter
public class Seleccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSeleccion",nullable = false)
    private Integer idSeleccion;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "tecnico",nullable = false, length = 45)
    private String tecnico;


    @Column(name = "estadio_idEstadio")
    private Integer idEstadio;


}
