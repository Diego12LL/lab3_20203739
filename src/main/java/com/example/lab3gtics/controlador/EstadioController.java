package com.example.lab3gtics.controlador;

import com.example.lab3gtics.entidad.Estadio;

import com.example.lab3gtics.repositorio.EstadioRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class EstadioController {

    final EstadioRepository estadioRepository;


    public EstadioController(EstadioRepository estadioRepository) {
        this.estadioRepository = estadioRepository;
    }

    @GetMapping(value = {"/estadio"})
    public String listaEstadios(Model model) {
        model.addAttribute("listaEstadios", estadioRepository.findAll());
        return "estadio/list";
    }

    @GetMapping("/crearEstadio")
    public String crearEstadio() {
        return "estadio/newForm";
    }

    @PostMapping("/guardarEstadio")
    public String guardarEstadio(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/estadio";
    }

    @GetMapping("/borrarEstadio")
    public String borrarEstadio(@RequestParam("id") int id) {

        Optional<Estadio> optional = estadioRepository.findById(id);

        if (optional.isPresent()) {
            estadioRepository.deleteById(id);
        }

        return "redirect:/estadio";
    }

}