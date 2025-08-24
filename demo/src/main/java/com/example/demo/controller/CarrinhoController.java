package com.example.demo.controller;

import com.example.demo.model.Carrinho;
import com.example.demo.model.item.Item;
import com.example.demo.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    //Podemos pedir o id do usuario para encontrar o carrinho
    //Caso o carrinho nao exista, dai criamos o carrinho e retornamos nesse mesmo endpoint
    @GetMapping
    public ResponseEntity<Carrinho> buscarCarrinho(){
        Carrinho response = carrinhoService.buscarCarrinho();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Carrinho> adicionarItem(@RequestBody Item item){
        Carrinho response = carrinhoService.adicionarAoCarrinho(item);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carrinho> atualizarCarrinho(@RequestBody Carrinho carrinho){
        Carrinho response = carrinhoService.atualizarCarrinho(carrinho);
        return ResponseEntity.ok(response);
    }
}
