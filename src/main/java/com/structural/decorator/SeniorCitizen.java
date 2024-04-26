package com.structural.decorator;

public class SeniorCitizen extends AccountDecorator {

    Account account;

    public SeniorCitizen(Account account) {
        super();
        this.account = account;
    }

    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are "+applyOtherBenefits();
    }

    String applyOtherBenefits() {
        return " an medical insurance of up to $1,000 for Senior Citizen";
    }

}
