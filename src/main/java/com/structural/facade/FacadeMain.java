package com.structural.facade;

/**
 * Паттерн "Фасад"
 * Предоставляет единый интерфейс для набора интерфейсов подсистемы.
 * Фасад задает высокоуровневый интерфейс, облегчающий использование подсистемы.
 */
public class FacadeMain {
    public static void main(String[] args) {

        BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
        serviceFacade.moneyTransfer();

    }
}
