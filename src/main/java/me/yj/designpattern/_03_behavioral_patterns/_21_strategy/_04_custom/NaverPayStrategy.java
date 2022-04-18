package me.yj.designpattern._03_behavioral_patterns._21_strategy._04_custom;

public class NaverPayStrategy implements PaymentStrategy {
    private String naverId;
    private String naverPw;

    public NaverPayStrategy(String naverId, String naverPw) {
        this.naverId = naverId;
        this.naverPw = naverPw;
    }

    @Override
    public void pay(int amount) {
        System.out.println("네이버페이로 " + amount + "원 결제했습니다.");
    }
}
