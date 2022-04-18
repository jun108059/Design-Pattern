package me.yj.designpattern._03_behavioral_patterns._21_strategy._04_custom;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {

    private final String name;
    private final String cardNumber;
    private final String cvc;
    private final String dateOfExpiry;

    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 " + amount + "원 결제했습니다.");
    }
}
