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
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Carrinho> buscarOuCriarCarrinho(@PathVariable Long usuarioId) {
        Carrinho carrinho = carrinhoService.buscarOuCriarCarrinho(usuarioId);
        return ResponseEntity.ok(carrinho);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Carrinho> adicionarItem(
            @PathVariable("id") Long carrinhoId,
            @RequestBody Item item) {
        Carrinho response = carrinhoService.adicionarAoCarrinho(carrinhoId, item);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carrinho> atualizarCarrinho(@RequestBody Carrinho carrinho){
        Carrinho response = carrinhoService.atualizarCarrinho(carrinho);
        return ResponseEntity.ok(response);
    }
}
