package me.yj.designpattern._02_structural_patterns._09_decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {

        Client client = new Client(new TrimmingCommentService());
        client.writeComment("디자인패턴 스터디");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("https://github.com/jun108059");

        // 공백 제거
        Client clientWithTrim = new Client(new TrimmingCommentService());
        clientWithTrim.writeComment("디자인패턴 스터디");
        clientWithTrim.writeComment("보는게 하는거 보다 재밌을 수가 없지..."); // 공백 제거
        clientWithTrim.writeComment("https://github.com/jun108059");

        // 스팸 필터링
        Client clientWithSpamFilter = new Client(new SpamFilteringCommentService());
        clientWithSpamFilter.writeComment("디자인패턴 스터디");
        clientWithSpamFilter.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        clientWithSpamFilter.writeComment("https://github.com/jun108059"); // 스팸 URL 필터링

        // 요구사항 : 공백 + 스팸처리
        // 이후에
        // 이후에 공백 + 스팸을 하려면 새로운 Service 를 만들어야함.

    }

}
