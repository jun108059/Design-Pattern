package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.Set;

public class ClientVer2 {
    public static void main(String[] args) {
        MailFactory mailFactory;
        String mailType = args[0];

        if (mailType.equals("AVATAR")) {
            mailFactory = new AvatarMailFactory();
        } else {
            mailFactory = new SearchMailFactory();
        }

        // 해당하는 mail 타입에 따른 대상자, 메일 템플릿 생성
        Set<Long> validUser = mailFactory.createValidUser();
        MailTemplate mailTemplate = mailFactory.createMailTemplate();

        // (추가) 발송하는 로직 ...
    }
}
