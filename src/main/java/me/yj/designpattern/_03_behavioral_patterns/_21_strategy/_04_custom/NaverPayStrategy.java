package me.yj.designpattern._03_behavioral_patterns._21_strategy._04_custom;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NaverPayStrategy implements PaymentStrategy {

    private final String naverId;
    private final String naverPw;

    @Override
    public void pay(int amount) {
        System.out.println("네이버페이로 " + amount + "원 결제했습니다.");
    }
}
