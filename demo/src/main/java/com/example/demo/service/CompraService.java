package com.example.demo.service;

import com.example.demo.model.Compra;
import com.example.demo.repository.CompraRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CompraService {

    private final CompraRepository compraRepository;

    public List<Compra> listarCompras() {

        return compraRepository.findAll();

    }
}
