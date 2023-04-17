package com.example.chat.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagensRepo extends JpaRepository<Mensagem, Long> {

}
