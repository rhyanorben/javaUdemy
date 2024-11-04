package org.example.secao20springboot.controllers;

import org.example.secao20springboot.models.entities.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public Calculadora somar(@PathVariable int a, @PathVariable int b) {
        return new Calculadora(a, b, a + b);
    }

    @GetMapping("/subtrair")
    public Calculadora subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return new Calculadora(a, b, a - b);
    }

}
