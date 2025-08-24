package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrar(Usuario usuario){
        return null;
    }

    @Transactional()
    public Usuario buscarPorId(Long id){
        return null;
    }

    public List<Usuario> buscarTodos(){
        return null;
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        return null;
    }

    public void deletar(Long id){

    }
}
