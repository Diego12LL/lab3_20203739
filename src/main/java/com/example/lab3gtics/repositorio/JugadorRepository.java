package com.example.lab3gtics.repositorio;
import com.example.lab3gtics.entidad.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
}