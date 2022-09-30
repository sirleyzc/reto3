package com.reto3.reto3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")


public class HolaMundoController {
    /**
     * @return
     */
    @GetMapping("/hola")
    public String saludar() {
        return "<h1>Hola Mundo, estoy en sprin boot</h1>";
    }
}