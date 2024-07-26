package one.digitalinnovation.gof.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Order;
import one.digitalinnovation.gof.service.strategies.PayStrategy;
import one.digitalinnovation.gof.service.strategies.creditcard.PayByCreditCard;
import one.digitalinnovation.gof.service.strategies.paypal.PayByPayPal;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/strategy")
public class CartoesRestController {

    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity getStrategy() {

        List<PayStrategy> payStrategyList = new ArrayList<>();
        PayStrategy payStrategy1 = new PayByCreditCard(10);
        payStrategyList.add(payStrategy1);

        PayStrategy payStrategy2 = new PayByPayPal(50);
        payStrategyList.add(payStrategy2);

        Order order = new Order();

        StringBuilder message = new StringBuilder();

        payStrategyList.forEach(payStrategy -> message.append(order.processOrder(payStrategy)));

        return ResponseEntity.ok().body(message.toString());
    }
}
