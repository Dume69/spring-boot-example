package com.sopra.order;

import com.sopra.order.model.OrderEntity;
import com.sopra.order.model.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Bean
	public CommandLineRunner fillDb(final OrderRepository orderRepository) {
		return (args) -> {
			orderRepository.save(new OrderEntity(new Date(), 123));
			orderRepository.save(new OrderEntity(new Date(), 234));
		};

	}
}
