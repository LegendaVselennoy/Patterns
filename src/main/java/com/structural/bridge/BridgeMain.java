package com.structural.bridge;

/**
 * Паттерн "Мост"
 * Расцепляет абстракцию с ее реализацией так, чтобы можно было менять
 * их независимо друг от друга.
 */

public class BridgeMain {
    public static void main(String[] args) {

        Bank icici = new IciciBank(new CurrentAccount());
        Account current = icici.openAccount();
        current.accountType();

        Bank hdfc = new HdfcBank(new SavingAccount());
        Account saving = hdfc.openAccount();
        saving.accountType();

    }
}
