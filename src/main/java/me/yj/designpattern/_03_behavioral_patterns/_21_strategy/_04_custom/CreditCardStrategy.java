package me.yj.designpattern._03_behavioral_patterns._21_strategy._04_custom;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvc;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvc, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 " + amount + "원 결제했습니다.");
    }
}
