package me.yj.designpattern._02_structural_patterns._06_adapter._04_custom;

public class SolutionB implements MailSenderB {

    @Override
    public void sendApi(String sendInfo) {
        System.out.println("B 솔루션 회사에서 메일 발송 : " + sendInfo);
    }
}
