package me.yj.designpattern._02_structural_patterns._09_decorator._04_custom;

// 광고 필터링 Decorator
public class AdFilterChatDecorator extends ChatDecorator {
    public AdFilterChatDecorator(ChatService chatService) {
        super(chatService);
    }

    @Override
    public void sendMessage(String message) {
        // 광고 필터링 기능 추가
        if (isNotAd(message) ) {
            super.sendMessage(message);
        }
    }

    private boolean isNotAd(String message) {
        return !message.contains("광고");
    }
}
