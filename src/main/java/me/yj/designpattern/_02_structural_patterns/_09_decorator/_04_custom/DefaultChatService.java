package me.yj.designpattern._02_structural_patterns._09_decorator._04_custom;

// ConcreteComponent : 기본 메시지 발송
public class DefaultChatService implements ChatService {
    // 단 하나의 컴포넌트(ChatService)를 포함
    @Override
    public void sendMessage(String message) {
        System.out.println("send message : " + message);
    }
}
