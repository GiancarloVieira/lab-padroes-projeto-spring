package one.digitalinnovation.gof.service.strategies.creditcard;

import one.digitalinnovation.gof.service.strategies.PayStrategy;

public class PayByCreditCard implements PayStrategy {

    private int paymentAmount;

    public PayByCreditCard(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String pay() {
        StringBuilder message = new StringBuilder();
        message.append(verifyCreditCard())
        .append("\n")
        .append("Pagando " + paymentAmount + " usando Cartão de Crédito.")
        .append("\n");
        return message.toString();
    }

    private String verifyCreditCard() {
        return "Verificação do Cartão de Crédito bem Sucecedida.";
    }
}
