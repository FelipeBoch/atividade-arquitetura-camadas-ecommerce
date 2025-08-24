package com.example.demo.controller;

import com.example.demo.model.enumerator.FormatoCamiseta;
import com.example.demo.model.enumerator.FormatoCaneca;
import com.example.demo.model.enumerator.FormatoMoletom;
import com.example.demo.model.item.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> listarItens(){
        List<Item> response = itemService.listarItens();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> buscarItem(@PathVariable Long id){
        Item response = itemService.buscarItem(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Item> criarItem(@RequestBody Item item){
        Item response = itemService.criarItem(item);
        return ResponseEntity.ok(response);
    }

    @GetMapping("formatos/camiseta")
    public ResponseEntity<List<FormatoCamiseta>> listarFormatosCamiseta(){
        List<FormatoCamiseta> response = itemService.listarFormatoCamiseta();
        return ResponseEntity.ok(response);
    }

    @GetMapping("formatos/caneca")
    public ResponseEntity<List<FormatoCaneca>> listarFormatosCaneca(){
        List<FormatoCaneca> response = itemService.listarFormatoCaneca();
        return ResponseEntity.ok(response);
    }

    @GetMapping("formatos/moletom")
    public ResponseEntity<List<FormatoMoletom>> listarFormatosMoletom(){
        List<FormatoMoletom> response = itemService.listarFormatoMoletom();
        return ResponseEntity.ok(response);
    }
}
