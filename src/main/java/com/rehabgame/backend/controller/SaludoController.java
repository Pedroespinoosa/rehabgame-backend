package com.rehabgame.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo-PedroEspinosa")
    public String saludo() {
        return "¡Hola mundo desde la rama de PedroEspinosa!";
    }
}