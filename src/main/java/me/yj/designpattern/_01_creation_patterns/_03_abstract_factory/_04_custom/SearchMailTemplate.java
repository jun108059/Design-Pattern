package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

// 개인 검색 데이터 기반
public class SearchMailTemplate extends MailTemplate {
    @Override
    protected void setContent(String content) {
        System.out.println("Set Content For Search Mail");
    }
}
