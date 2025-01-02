package com.marcosderlei.aula.services;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcosderlei.aula.entities.Order;
import com.marcosderlei.aula.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<Order> findAll() {
        List<Order> orders = repository.findAll();
        orders.forEach(order -> Hibernate.initialize(order.getItems()));
        return orders;
    }

    @Transactional(readOnly = true)
    public Order findById(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        Hibernate.initialize(order.getItems());
        return order;
    }
}
