package com.example.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chat.domain.Usuario;
import com.example.chat.domain.UsuariosRepo;
import com.example.chat.util.Cores;

@RestController
@CrossOrigin
@RequestMapping("/u")
public class UsuarioRest {
	
	@Autowired
	private UsuariosRepo ur;
	
	@GetMapping
	public List<Usuario> todos() {
		return ur.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario buscar(@PathVariable Long id) {
		return ur.findById(id).orElse(null);
	}
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		Usuario existente = ur.findFirstByNome(usuario.getNome());
		
		if (existente != null) {
			return existente;
		}
		
		usuario.setCor(Cores.sequencial((int)ur.count()));
		return ur.save(usuario);
	}
	
	@PutMapping
	public Usuario atualizar(@RequestBody Usuario usuario) {
		return ur.save(usuario);
	}
}
