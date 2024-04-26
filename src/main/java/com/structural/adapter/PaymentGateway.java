package com.structural.adapter;

import com.generative.factory.Account;

public interface PaymentGateway {

    void doPayment(Account account1, Account account2);

}
