package com.generative.loner;

/**
 * Паттерн "Одиночка"
 * Гарантирует наличие только одного экземпляра класса в приложении и предоставляет глобальную точку доступа к нему.
 */

public class Main {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.UNIQUE_INSTANCE;
    }
}