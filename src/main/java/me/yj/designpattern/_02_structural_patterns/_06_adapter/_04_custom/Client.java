package me.yj.designpattern._02_structural_patterns._06_adapter._04_custom;


public class Client {
    public static void main(String[] args) {

        MailSenderA senderA = new SolutionA();
        senderA.send("기존 발송 메일");

        senderA = new Adapter(new SolutionB());
        senderA.send("TO-BE 발송 메일");

    }
}
