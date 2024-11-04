package org.example.secao20springboot.controllers;

import org.example.secao20springboot.models.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/clientes/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "115.052.788-41");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "112.678.245-85");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
        return new Cliente(id, "João", "112.678.856-92");
    }

}
