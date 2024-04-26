package com.structural.facade;

import com.structural.composite.Account;
import com.structural.composite.SavingAccount;

public class AccountService {

    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }

}
