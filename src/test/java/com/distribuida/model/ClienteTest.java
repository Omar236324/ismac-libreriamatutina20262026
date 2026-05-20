package com.distribuida.model;

import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(
                 1,
                 "170123456",
                "Bob",
                 "Esponja",
                "En el mar",
                "0987654321",
                "jkdbv@gmail.com"
    );
    }
    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias constructor Cliente",
                () ->assertEquals(1,cliente.getIdCliente()),
        () ->assertEquals("170123456",cliente.getCedula()),
        () ->assertEquals("Bob",cliente.getNombre()),
        () ->assertEquals("Esponja",cliente.getApellido()),
        () ->assertEquals("jkdbv@gmail.com",cliente.getCorreo()),
        () ->assertEquals("0987654321",cliente.getTelefono())


        );
    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1723456789");
        cliente.setNombre("bob2");
        cliente.setApellido("Esponja2");
        cliente.setDireccion(" en el mar 2");
        cliente.setTelefono("0934562378");
        cliente.setCorreo("Besponja@correo.com");



            assertAll("Pruebas unitarias constructor Cliente",
                    () ->assertEquals(2,cliente.getIdCliente()),
                    () ->assertEquals("1723456789",cliente.getCedula()),
                    () ->assertEquals("bob2",cliente.getNombre()),
                    () ->assertEquals("Esponja2",cliente.getApellido()),
                    () ->assertEquals("Besponja@correo.com",cliente.getCorreo()),
                    () ->assertEquals("0934562378",cliente.getTelefono())

            );
            System.out.println(cliente.toString());

    }


    @Test

    public void testClienteTosString(){
        String str = cliente.toString();
        assertAll("Validar datos del cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("170123456")),
                () -> assertTrue(str.contains("bob")),
                () -> assertTrue(str.contains("Esponja")),
                () ->assertTrue(str.contains("En el mar")),
                () -> assertTrue(str.contains("0987654321")),
                () -> assertTrue(str.contains("jkdbv@gmail.com"))



        );
    }

}
