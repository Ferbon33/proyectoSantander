package com.example.ProyectoSantander.service;


import com.example.ProyectoSantander.entity.Cliente;
import com.example.ProyectoSantander.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    public Optional<Cliente> obtenerCliente(Long id) {
        return repository.findById(id);
    }

    public Cliente guardarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        repository.deleteById(id);
    }
}
