//package com.distribuida.model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class AutorTest {
//    private Autor autor;
//
//    @BeforeEach
//    public void setUp(){
//        autor = new Autor(
//                1,
//                "Juan",
//                "Rodriguez",
//                "Ecuador",
//                "pifo",
//                "0987654321",
//                "Rodrigop@gmail.com"
//        );
//    }
//    @Test
//    public void testClientConstructorAndGetters(){
//        assertAll("Pruebas unitarias constructor Autor",
//                () ->assertEquals(1,autor.getIdAutor()),
//                () ->assertEquals("pedor",autor.getNombre()),
//                () ->assertEquals("Rodriguez",autor.getApellido()),
//                () ->assertEquals("Ecuador",autor.getPais()),
//                () ->assertEquals("pifo",autor.getDireccion()),
//                () ->assertEquals("Rodrigop@gmail.com",autor.getCorreo()),
//                () ->assertEquals("0987654321",autor.getTelefono())
//
//
//        );
//    }
//
//
//}
