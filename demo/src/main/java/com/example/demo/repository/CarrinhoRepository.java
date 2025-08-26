package com.example.demo.repository;

import com.example.demo.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    Optional<Carrinho> findByUsuarioId(Long usuarioId);
}
