package com.ftt.ec7.NoticiasAPI;

import java.awt.List;
import java.util.ArrayList;

import javax.validation.Valid;
import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ftt.ec7.Noticias.Controller.NoticiasController;
import com.ftt.ec7.Noticias.Model.NoticiasModel;

@Controller
public class NoticiasAPI {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
		
	@GetMapping(path = "/noticias")
	public String ListarNoticias() {
		
		return new NoticiasController().RetornarNoticias();
		
	}
	
	@PostMapping
	public String SalvarNoticia(@RequestBody String noticia) {
		
		return new NoticiasController().SalvarNoticia(noticia);
	}
	
	@PutMapping(path = "/{id}")
	public String AtualizarNoticia(@PathVariable String id, @RequestBody String noticia) {
		
		return new NoticiasController().SalvarNoticia(noticia);
	}
	
	@DeleteMapping(path = "/{id}")
	public String ExcluirNoticia(@PathVariable String id) {
		return new NoticiasController().ExcluirNoticia(id);
	}
	
}