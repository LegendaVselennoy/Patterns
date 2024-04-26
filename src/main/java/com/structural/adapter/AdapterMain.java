package com.structural.adapter;

/**
 * Паттерн "Адаптер"
 * Преобразует интерфейс класса в другой интерфейс, ожидаемый клиентом.
 * Благодаря адаптеру становится возможным взаимодействие тех классов,
 * которые иначе не могли бы работать друг с другом из-за несовместимых
 * интерфейсов.
 */

public class AdapterMain {

    public static void main(String[] args) {

        PaymentGateway paymentGateway = new PaymentGatewayImpl();

        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);

        String mobile1 = null;
        String mobile2 = null;

        advancedPayGateway.makePayment(mobile1, mobile2);
    }
}
