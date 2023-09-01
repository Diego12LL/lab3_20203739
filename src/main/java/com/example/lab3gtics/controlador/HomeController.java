package com.example.lab3gtics.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller

public class HomeController {

    @RequestMapping(value = {""})
    public String empleado() {
        return "mensajito";
    }
}