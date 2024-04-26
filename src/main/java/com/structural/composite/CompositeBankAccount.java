package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account{

    // Коллекция счетов-потомков
    private List<Account> childAccounts = new ArrayList<>();

    @Override
    public void accountType() {
        for (Account account : childAccounts) {
            account.accountType();
        }
    }

    // Добавляет счет в композицию
    public void add(Account account) {
        childAccounts.add(account);
    }

    // Удаляет счет из композиции
    public void remove(Account account) {
        childAccounts.remove(account);
    }
}
