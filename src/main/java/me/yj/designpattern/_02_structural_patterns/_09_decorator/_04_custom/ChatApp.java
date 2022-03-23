package me.yj.designpattern._02_structural_patterns._09_decorator._04_custom;

public class ChatApp {
    private static final boolean enabledAdFilter = true;
    private static final boolean enabledAbuseFilter = true;

    public static void main(String[] args) {
        // 기본 채팅 서비스 생성
        ChatService chatService = new DefaultChatService();
        // 런타임 시 플래그 값에 따라 필터를 추가
        if (enabledAdFilter) { // 광고 제거 필터
            chatService = new AdFilterChatDecorator(chatService);
        }
        if (enabledAbuseFilter) { // 욕설 치환 필터
            chatService = new AbuseFilterChatDecorator(chatService);
        }

        Client client = new Client(chatService);
        client.sendMessage("안녕하세요!");
        client.sendMessage("(광고) 돈이 복사가 된다고?");
        client.sendMessage("똥개야 답장해줘");
    }
}

/* 실행 결과
send message = 안녕하세요!
send message = 이쁜진돗개순종아 답장해줘
 */