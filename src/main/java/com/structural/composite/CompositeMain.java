package com.structural.composite;

/**
 * Паттерн "Составной объект"
 * Объекты можно объединять в древовидные структуры, отражающие
 * иерархии типа «часть — целое». Благодаря составному объекту клиенты
 * могут работать одинаковым образом как с отдельными объектами, так
 * и с их композициями.
 */

public class CompositeMain {
    public static void main(String[] args) {
        // Сберегательные счета
        SavingAccount savingAccount1 = new SavingAccount();
        SavingAccount savingAccount2 = new SavingAccount();

        // Текущие счета
        CurrentAccount currentAccount1 = new CurrentAccount();
        CurrentAccount currentAccount2 = new CurrentAccount();

        // Составной банковский счет
        CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();

        // Выполняем композицию банковских счетов
        compositeBankAccount1.add(savingAccount1);
        compositeBankAccount1.add(currentAccount1);
        compositeBankAccount2.add(currentAccount2);
        compositeBankAccount2.add(savingAccount2);
        compositeBankAccount.add(compositeBankAccount2);
        compositeBankAccount.add(compositeBankAccount1);

        compositeBankAccount.accountType();
    }
}
