package com.structural.facade;

import com.structural.composite.Account;

public class TransferService {

    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transfering Money");
    }

}
