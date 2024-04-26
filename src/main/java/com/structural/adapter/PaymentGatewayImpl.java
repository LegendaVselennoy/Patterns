package com.structural.adapter;

import com.generative.factory.Account;

public class PaymentGatewayImpl implements PaymentGateway{

    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Gateway");
    }

}
