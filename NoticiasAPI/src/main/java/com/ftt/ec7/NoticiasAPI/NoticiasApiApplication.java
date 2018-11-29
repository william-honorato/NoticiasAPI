package com.ftt.ec7.NoticiasAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ftt.ec7.Noticias.Controller.NoticiasController;

@SpringBootApplication
public class NoticiasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticiasApiApplication.class, args);
		NoticiasController nc = new NoticiasController();
		System.out.print(nc.RetornarNoticias());
		
	}
}
