package com.structural.decorator;

public class SavingAccount implements Account{

    @Override
    public String getTotalBenefits() {
        return "This account has 4% interest rate with per day $5000 withdrawal limit";
    }
}
