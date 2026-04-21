package com.example.produtos.service;

import com.example.produtos.ProdutoNaoEncontradoException;
import com.example.produtos.model.Produto;
import com.example.produtos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProdutoNaoEncontradoException("Produto não encontrado!"));
    }

    public Produto atualizar(Long id, Produto novoProduto) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new ProdutoNaoEncontradoException("Produto não encontrado"));

        produto.setNome(novoProduto.getNome());
        produto.setPreco(novoProduto.getPreco());
        produto.setQuantidade(novoProduto.getQuantidade());

        return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
