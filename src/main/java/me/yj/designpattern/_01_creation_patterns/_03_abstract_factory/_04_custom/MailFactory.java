 package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.Set;

// 추상 대상자, 추상 메일 템플릿을 생성하는 추상 팩토리 클래스
public abstract class MailFactory {
    public abstract Set<Long> createValidUser();
    public abstract MailTemplate createMailTemplate();
}
