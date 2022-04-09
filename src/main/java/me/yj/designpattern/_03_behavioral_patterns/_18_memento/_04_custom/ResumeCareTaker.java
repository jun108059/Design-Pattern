package me.yj.designpattern._03_behavioral_patterns._18_memento._04_custom;

import java.util.Stack;

public class ResumeCareTaker {
    // Memento 관리를 위한 stack
    Stack<Memento> ResumeSnapshots = new Stack<>();

    // 특정 시점의 Memento Push
    public void push(Memento ResumeSnapshot)  {
        ResumeSnapshots.push(ResumeSnapshot);
    }

    // 복원을 위한 Memento 객체 반환
    public Memento pop() {
        return ResumeSnapshots.pop();
    }
}
