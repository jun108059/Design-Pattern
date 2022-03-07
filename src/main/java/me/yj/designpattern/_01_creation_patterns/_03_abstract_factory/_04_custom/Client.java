package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.Set;

public class Client {
    public static void main(String[] args) {
        ValidUser avatarValidUser = ValidUserFactory.createValidUser(MailType.AVATAR);
        MailTemplate avatarMailTemplate = MailTemplateFactory.createMailTemplate(MailType.AVATAR);

        Set<Long> validUser = avatarValidUser.getValidUser();
        avatarMailTemplate.setContent("신입/경력 기반 개인 맞춤 메일 내용");
        String sender = avatarMailTemplate.template.get("sender");
        String receiver = avatarMailTemplate.template.get("receiver");
        // ..생략
        // 대상자에게 메일 템플릿 설정하여 메일 발송 로직 추가
    }
}
