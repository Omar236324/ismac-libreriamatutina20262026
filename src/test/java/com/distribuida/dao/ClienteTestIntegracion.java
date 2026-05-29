package com.distribuida.dao;

import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class ClienteTestIntegracion {

    @Autowired
    private ClienteDAO clienteDAO;

    @Test
    public void finALL() {
        List<Cliente> clientes = clienteDAO.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0);
        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }


    }

    @Test
    public void finOne(){
    Optional<Cliente> cliente = clienteDAO.findById(1);
    assertTrue(cliente.isPresent(), "El cliente con id = 1, deberia existir");
    System.out.println(cliente.toString());
    }

    @Test
    public void save( ){
        Cliente cliente = new Cliente(0,
                "1723546789","juan","taipe",
                "Av. por ahi","0923546734","jtaipe@gmal.com");
        Cliente clienteGuardado = clienteDAO.save(cliente);
        assertNotNull(clienteGuardado.getIdCliente(),"El cliente guardado debe tener un id.");
        assertEquals("1723546789",clienteGuardado.getCedula());
        assertEquals("juan",clienteGuardado.getNombre());


    }
    @Test
    public void update(){
        Optional<Cliente> cliente = clienteDAO.findById(46);
        assertTrue(cliente.isPresent(),"el cliente de id=44 debe de existir para ser actualizado");

        cliente.orElse(null).setCedula("173489542312");
        cliente.orElse(null).setNombre("juan4");
        cliente.orElse(null).setApellido("taipe4");
        cliente.orElse(null).setDireccion("Av 33");
        cliente.orElse(null).setTelefono("0967235412");
        cliente.orElse(null).setCorreo("jtaipe33@gmal.com");

        Cliente clienteActualizar = clienteDAO.save(cliente.orElse(null));

        assertEquals("juan4",clienteActualizar.getNombre());
        assertEquals("taipe4", clienteActualizar.getApellido());


    }

    @Test
    public void delete(){
        if(clienteDAO.existsById(46)){
            clienteDAO.deleteById(46);
        }
        assertFalse(clienteDAO.existsById(44),"el id deberia haberse eliminado");
    }


}
