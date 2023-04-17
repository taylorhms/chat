package com.example.chat.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepo extends JpaRepository<Usuario, Long> {

	public Usuario findFirstByNome(String nome);
}
