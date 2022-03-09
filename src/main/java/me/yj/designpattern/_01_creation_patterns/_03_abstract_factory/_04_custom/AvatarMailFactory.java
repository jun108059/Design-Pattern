package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.Set;

// 개인 정보 맞춤 메일 생성 팩토리 클래스
public class AvatarMailFactory extends MailFactory {
    @Override
    public Set<Long> createValidUser() {
        return new AvatarMailValidUser().validUserList;
    }

    @Override
    public MailTemplate createMailTemplate() {
        return new AvatarMailTemplate();
    }
}
