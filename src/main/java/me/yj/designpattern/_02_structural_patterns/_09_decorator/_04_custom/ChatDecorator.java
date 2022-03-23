package me.yj.designpattern._02_structural_patterns._09_decorator._04_custom;

// Decorator : 기능 추가 후 Component 호출
public class ChatDecorator implements ChatService {
    private final ChatService chatService;
    public ChatDecorator(ChatService chatService) {
        this.chatService = chatService;
    }
    @Override
    public void sendMessage(String message) {
        chatService.sendMessage(message);
    }
}
