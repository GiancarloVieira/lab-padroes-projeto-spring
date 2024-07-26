package one.digitalinnovation.gof.service.strategies.paypal;

import one.digitalinnovation.gof.service.strategies.PayStrategy;

public class PayByPayPal implements PayStrategy {

    private int paymentAmount;

    public PayByPayPal(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String pay() {
        StringBuilder message = new StringBuilder();
        message.append(verifyAccount())
        .append(("\n"))
        .append("Pagando " + paymentAmount + " usando PayPal.")
        .append("\n");

        return message.toString();
    }

    private String verifyAccount() {
        return "Verificação Pay Pal bem sucedida.";
    }
}
