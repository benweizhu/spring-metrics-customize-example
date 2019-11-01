package me.zeph.spring.metrics.springmetricscustomizeexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders/{id}")
    public Order createOrder(@PathVariable long id) {
        return Order.builder().id(id).build();
    }

}
