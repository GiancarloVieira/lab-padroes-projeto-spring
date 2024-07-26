package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.service.strategies.PayStrategy;

public class Order {

    public String processOrder(PayStrategy strategy) {
        StringBuilder message = new StringBuilder(strategy.pay());
        return message.toString();
    }
}
