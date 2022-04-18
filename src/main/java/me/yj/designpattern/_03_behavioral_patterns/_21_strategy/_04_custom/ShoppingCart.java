package me.yj.designpattern._03_behavioral_patterns._21_strategy._04_custom;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<JobItem> jobItemList;

    public ShoppingCart() {
        this.jobItemList = new ArrayList<>();
    }

    public void addItem(JobItem item) {
        this.jobItemList.add(item);
    }

    public void removeItem(JobItem item) {
        this.jobItemList.remove(item);
    }

    public int calculateTotal() {
        return jobItemList.size() * 10000;
    }

    // pay - PaymentStrategy 인터페이스 구현한 클래스 존재
    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
