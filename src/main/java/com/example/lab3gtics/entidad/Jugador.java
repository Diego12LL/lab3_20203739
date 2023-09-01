package com.example.lab3gtics.entidad;

import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jugador")
@Getter
@Setter
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador",nullable = false)
    private Integer idJugador;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "edad",nullable = false)
    private Integer edad;

    @Column(name = "posicion",nullable = false, length = 45)
    private String posicion;

    @Column(name = "club",nullable = false, length = 45)
    private String club;

    @Column(name = "sn_idSeleccion")
    private Integer idseleccion;


}