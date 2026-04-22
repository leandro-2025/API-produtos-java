package com.example.produtos.repository;

import com.example.produtos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRespository extends  JpaRepository<Pedido, Long> {
}
