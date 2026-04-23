package com.example.produtos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cliente;

    private double total;

    @ManyToMany
    private List<Produto> produtos;

    public Long getId() {
        return id;
    }

    public String getCliente() {
        return  cliente;
    }

    public  void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos() {
        return  produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
