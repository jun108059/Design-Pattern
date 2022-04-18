package me.yj.designpattern._03_behavioral_patterns._21_strategy._04_custom;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        JobItem job1 = new JobItem(1, "서버개발");
        JobItem job2 = new JobItem(2, "안드로이드개발");

        cart.addItem(job1);
        cart.addItem(job2);

        // 네이버페이로 결제
        cart.pay(new NaverPayStrategy("myEmail@example.com", "myPwd"));
        // 신용카드로 결제
        cart.pay(new CreditCardStrategy("YoungJun Park", "1234555566667777", "999", "02/23"));
    }
}
