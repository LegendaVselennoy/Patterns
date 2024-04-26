package com.generative.abstract_factory;

import com.generative.factory.Account;

public abstract class AbstractFactory {

    abstract Bank getBank(String bankName);
    abstract Account getAccount(String accountType);

}
