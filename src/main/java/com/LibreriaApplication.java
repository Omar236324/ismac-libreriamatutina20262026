package com;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("HOLA MUNOD DESDE SPRINT BOOT!!!....");

		Cliente cliente= new Cliente(
				1
				,"1709234536"
				,"alan"
				,"britoo"
				,"quito"
				,"0987325456"
				,"abrito@correo.com"
		);
		System.out.println(cliente.toString());




	}



}
