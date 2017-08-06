package com.sopra.order.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    List<OrderEntity> searchByClientId(long clientId) {
        return orderRepository.findByClientId(clientId);
    }

}
