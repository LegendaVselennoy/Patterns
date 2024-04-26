package com.generative.builder;

/**
 * Паттерн "Строитель"
 * Отделяет конструирование сложного объекта от его представления, чтобы
 * с помощью одного процесса формирования можно было создавать различные представления
 */

public class AccountBuilderTest {

    public static void main(String[] args) {

        Account account = new Account
                .AccountBuilder("Saving Account", "Dinesh Rajput", 1111L)
                .balance(38458.32)
                .interest(4.5)
                .type("SAVING")
                .build();
        System.out.println(account);
    }
}
