package com.example.ProyectoSantander.controller;

import com.example.ProyectoSantander.entity.Cliente;
import com.example.ProyectoSantander.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/RestTempClientes")
public class RestTempClienteControler {

    private final ClienteService service;
    private final RestTemplate restTemplate;

    public  RestTempClienteControler(ClienteService service, RestTemplate restTemplate) {
        this.service = service;
        this.restTemplate = restTemplate;
    }

    // Endpoint original GET /api/clientes
    @GetMapping
    public List<Cliente> listarClientes() {
        return service.listarClientes();
    }

    // Nuevo endpoint que llama al GET /api/clientes
    @GetMapping("/consumirse")
    public Cliente[] consumirGetInterno() {
        String url = "http://localhost:8080/api/clientes"; // URL del endpoint GET
        Cliente[] clientes = restTemplate.getForObject(url, Cliente[].class);
        return clientes;
    }
}
