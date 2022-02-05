package com.ZYTRUST.Induccion;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.modelos.Producto;
import com.ZYTRUST.Induccion.servicios.ClienteService;
import com.ZYTRUST.Induccion.servicios.ProductoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class InduccionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InduccionApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ClienteService clienteService, ProductoService productoService){

		return args -> {
			productoService.CreateProducto(new Producto("1","Salsa Tomate","Salsa de tomate Rojo",new BigDecimal(10.5)));
			productoService.CreateProducto(new Producto("2","Chocolate","Chocolate Tottus",new BigDecimal(27.5)));
			productoService.CreateProducto(new Producto("3","Galletas Margarita","Galletas en six PACK Marca Margaritas",new BigDecimal(11.5)));

			clienteService.CreateCliente(new Cliente("1","Sebastian","86283476192","Jr Unidad 23"));
			clienteService.CreateCliente(new Cliente("2","Matias","82723591028","Jr Unidad 24"));
			clienteService.CreateCliente(new Cliente("3","Gerardo","86882067961","Jr Unidad 25"));
		};
	}

}
