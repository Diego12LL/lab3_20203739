package com.example.lab3gtics.controlador;

import com.example.lab3gtics.entidad.Jugador;
import com.example.lab3gtics.repositorio.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class JugadorController {

    final JugadorRepository jugadorRepository;


    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping(value = {"/jugador"})
    public String listaJugadores(Model model) {
        model.addAttribute("listaJugadores", jugadorRepository.findAll());
        return "jugador/list";
    }

    @GetMapping("/crearJugador")
    public String crearJugador() {
        return "jugador/newForm";
    }

    @PostMapping("/guardarJugador")
    public String guardarJugador(Jugador jugador) {
        jugadorRepository.save(jugador);
        return "redirect:/jugador";
    }

    @GetMapping("/borrarJugador")
    public String borrarJugador(@RequestParam("id") int id) {

        Optional<Jugador> optional = jugadorRepository.findById(id);

        if (optional.isPresent()) {
            jugadorRepository.deleteById(id);
        }

        return "redirect:/jugador";
    }

}