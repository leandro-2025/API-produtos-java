package com.example.produtos.service;

import  com.example.produtos.model.Pedido;
import com.example.produtos.model.Produto;
import com.example.produtos.repository.PedidoRespository;
import com.example.produtos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRespository repository;
    private final ProdutoRepository produtoRepository;

    public PedidoService(PedidoRespository repository, ProdutoRepository produtoRepository) {
        this.repository = repository;
        this.produtoRepository = produtoRepository;
    }

    public Pedido criar(Pedido pedido) {

        List<Produto> produtosCompleto = pedido.getProdutos()
                .stream()
                .map(p -> produtoRepository.findById(p.getId())
                        .orElseThrow(() -> new RuntimeException("Produto não encontrado")))
                .toList();

        pedido.setProdutos(produtosCompleto);

        return repository.save(pedido);
    }

    public List<Pedido> listar() {

        return repository.findAll();
    }
}
