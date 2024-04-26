package com.generative.prototype;

/**
 * Паттерн "Прототип"
 * Задает вид создаваемых объектов с помощью экземпляра-прототипа и создает новые объекты путем его копирования.
 */

public class PrototypeMain {

    public static void main(String[] args) {

        Account currentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
        currentAccount.accountType();

        Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();
        savingAccount.accountType();
    }
}
