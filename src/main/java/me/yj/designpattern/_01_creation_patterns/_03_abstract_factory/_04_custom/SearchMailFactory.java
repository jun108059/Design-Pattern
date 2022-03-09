package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.Set;

// 검색 기반 맞춤 메일 생성 팩토리 클래스
public class SearchMailFactory extends MailFactory {
    @Override
    public Set<Long> createValidUser() {
        return new SearchMailValidUser().validUserList;
    }

    @Override
    public MailTemplate createMailTemplate() {
        return new SearchMailTemplate();
    }
}
