package com.example.demo.model;

import com.example.demo.model.enumerator.StatusCarrinho;
import com.example.demo.model.item.Item;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "compra_id")
    private List<Item> itens;
    private Date dataCriacao;
    private StatusCarrinho status;
    private Long usuarioId;
}
