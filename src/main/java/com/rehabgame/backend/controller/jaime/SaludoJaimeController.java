package com.rehabgame.backend.controller.jaime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoJaimeController {

    @GetMapping("/saludo-jaime")
    public String saludar() {
        return "¡Compañeros soy Jaime!";
    }
}
