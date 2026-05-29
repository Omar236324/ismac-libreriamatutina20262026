package com.distribuida.service;

import com.distribuida.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public List<Cliente> findAll() {
        return List.of();
    }

    @Override
    public Cliente findOne(int id) {
        return null;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente update(int id, Cliente cliente) {

        Cliente clienteExistente =findOne(id);

        if(clienteExistente == null){
            return null;
        }
        clienteExistente.setCedula(cliente.getCedula());
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setApellido(cliente.getApellido());
        clienteExistente.setDireccion(cliente.getDireccion());
        clienteExistente.setTelefono(cliente.getTelefono());
        clienteExistente.setCorreo(cliente.getCorreo());
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
