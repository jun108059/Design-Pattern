package me.yj.designpattern._02_structural_patterns._06_adapter._04_custom;

public class Adapter implements MailSenderA {

    private final MailSenderB mailSenderB;

    public Adapter(SolutionB newSolution) {
        this.mailSenderB = newSolution;
    }

    @Override
    public void send(String sendInfo) {
        System.out.print("Using Adapter >>> ");
        mailSenderB.sendApi(sendInfo);
    }
}
