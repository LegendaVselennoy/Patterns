package com.structural.adapter;

import com.generative.factory.Account;

public class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway{

    private PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
    // получаем номер счета по номеру мобильного телефона
        Account account1 = null;
        Account account2 = null;
        paymentGateway.doPayment(account1, account2);
    }
}
