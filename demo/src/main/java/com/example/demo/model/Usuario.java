package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String email;
    private String senha;

    private Carrinho carrinho;
    private List<Compra> compras;
}
