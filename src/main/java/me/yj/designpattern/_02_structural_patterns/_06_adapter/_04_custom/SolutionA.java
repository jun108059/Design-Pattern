package me.yj.designpattern._02_structural_patterns._06_adapter._04_custom;

public class SolutionA implements MailSenderA {

    @Override
    public void send(String sendInfo) {
        System.out.println("A 솔루션 회사에서 메일 발송 : " + sendInfo);
    }
}
