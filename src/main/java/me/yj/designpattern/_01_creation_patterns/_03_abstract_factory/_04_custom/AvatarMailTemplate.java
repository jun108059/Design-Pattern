package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

// 경력, 직무 기반
public class AvatarMailTemplate extends MailTemplate {
    @Override
    protected void setContent(String content) {
        System.out.println("Set Content For Avatar Mail");
    }
}
