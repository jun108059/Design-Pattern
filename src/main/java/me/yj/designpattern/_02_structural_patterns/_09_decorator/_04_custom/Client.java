package me.yj.designpattern._02_structural_patterns._09_decorator._04_custom;

public class Client implements ChatService {
    private final ChatService chatService;
    public Client(ChatService chatService) {
        this.chatService = chatService;
    }
    public void sendMessage(String message) {
        chatService.sendMessage(message);
    }
}
