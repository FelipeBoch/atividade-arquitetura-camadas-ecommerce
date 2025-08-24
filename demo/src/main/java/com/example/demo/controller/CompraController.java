package com.example.demo.controller;

import com.example.demo.model.Compra;
import com.example.demo.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    //podemos pedir o id do usuario se precisar
    @GetMapping
    public ResponseEntity<List<Compra>> listarCompras(){
        List<Compra> response = compraService.listarCompras();
        return ResponseEntity.ok(response);
    }
}
