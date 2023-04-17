package com.example.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.chat.domain.UsuariosRepo;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@Autowired
	private UsuariosRepo ur;
	
	@RequestMapping("/")
	public String viewChat(@RequestParam(name = "u", required = false) Long usuarioId) {
		if (usuarioId == null || !ur.existsById(usuarioId))
			return "login.html";
		return "view_chat.html";
	}
}
