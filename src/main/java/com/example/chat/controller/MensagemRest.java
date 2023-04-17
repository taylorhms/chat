package com.example.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chat.domain.Mensagem;
import com.example.chat.domain.MensagensRepo;

@RestController
@CrossOrigin
@RequestMapping("/m")
public class MensagemRest {
	
	@Autowired
	private MensagensRepo mr;
	
	@GetMapping
	public List<Mensagem> todas() {
		return mr.findAll();
	}
	
	@PostMapping
	public Mensagem salvar(@RequestBody Mensagem mensagem) {
		return mr.save(mensagem);
	}
}
