package me.yj.designpattern._02_structural_patterns._09_decorator._02_after;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}
