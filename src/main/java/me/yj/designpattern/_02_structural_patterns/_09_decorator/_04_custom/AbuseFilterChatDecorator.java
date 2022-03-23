package me.yj.designpattern._02_structural_patterns._09_decorator._04_custom;

// 욕설 필터링 Decorator
public class AbuseFilterChatDecorator extends ChatDecorator {
    public AbuseFilterChatDecorator(ChatService chatService) {
        super(chatService);
    }

    @Override
    public void sendMessage(String message) {
        // 욕설 필터링 기능 추가
        super.sendMessage(abuseFilter(message));
    }

    private String abuseFilter(String message) {
        return message.replace("똥개야","이쁜진돗개순종아" );
    }
}
