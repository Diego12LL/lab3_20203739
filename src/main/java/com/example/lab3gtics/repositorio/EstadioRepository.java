package com.example.lab3gtics.repositorio;
import com.example.lab3gtics.entidad.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {
}