package com.generative.abstract_factory;

import com.generative.factory.Account;

/**
 * Паттерн "Абстрактная Фабрика"
 * Обеспечивает интерфейс для создания семейств взаимосвязанных или
 * взаимозависимых объектов без указания конкретных классов.
 */

public class AbstractFactoryMain {
    public static void main(String[] args) {

        AccountFactory accountFactory = new AccountFactory();
        // Получаем объект класса SavingAccount и вызываем его метод accountType()
        Account savingAccount = accountFactory.getAccount("SAVING");
        // Вызываем метод accountType класса SavingAccount
        savingAccount.accountType();
        // Получаем объект класса CurrentAccount и вызываем его метод accountType()
        Account currentAccount = accountFactory.getAccount("CURRENT");
        // Вызываем метод accountType класса CurrentAccount
        currentAccount.accountType();
    }
}
