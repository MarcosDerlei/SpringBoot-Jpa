package com.marcosderlei.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosderlei.aula.entities.OrderItem;
import com.marcosderlei.aula.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
