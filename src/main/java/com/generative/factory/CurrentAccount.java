package com.generative.factory;

public class CurrentAccount implements Account{

    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }

}
