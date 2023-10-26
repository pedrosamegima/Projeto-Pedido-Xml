package com.gerenciamentoPedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamentoPedido.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
