package com.example.demo.service;

import com.example.demo.model.Carrinho;
import com.example.demo.model.item.Item;
import com.example.demo.repository.CarrinhoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarrinhoService {

    private final CarrinhoRepository carrinhoRepository;

    public Carrinho buscarOuCriarCarrinho(Long usuarioId) {
        return carrinhoRepository.findByUsuarioId(usuarioId)
                .orElseGet(() -> {
//                    Carrinho novoCarrinho = new Carrinho();
//                    novoCarrinho.setUsuarioId(usuarioId);
//                    novoCarrinho.setItens(new ArrayList<>());
//                    return carrinhoRepository.save(novoCarrinho);
                    return null;
                });
    }


    public Carrinho adicionarAoCarrinho(Long carrinhoId, Item item) {
        Carrinho carrinho = buscarOuCriarCarrinho(carrinhoId);

        carrinho.getItens().add(item);

        return carrinhoRepository.save(carrinho);
    }

    public Carrinho atualizarCarrinho(Carrinho carrinho) {
        Carrinho existente = carrinhoRepository.findById(carrinho.getId())
                .orElseThrow(() -> new RuntimeException("Carrinho não encontrado!"));

        existente.setItens(carrinho.getItens());
        existente.setStatus(carrinho.getStatus());
        existente.setDataCriacao(carrinho.getDataCriacao());

        return carrinhoRepository.save(existente);
    }

}
