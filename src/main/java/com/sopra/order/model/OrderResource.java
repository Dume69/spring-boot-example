package com.sopra.order.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/orders")
    public List<OrderEntity> listOrders(@RequestParam("clientId") long clientId) {
        return orderService.searchByClientId(clientId);
    }


}
