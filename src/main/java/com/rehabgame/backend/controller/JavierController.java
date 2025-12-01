package com.rehabgame.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavierController {

    @GetMapping("/javier")
    public String hello() {
        return "Si, se llama JavierController";
    }
}
