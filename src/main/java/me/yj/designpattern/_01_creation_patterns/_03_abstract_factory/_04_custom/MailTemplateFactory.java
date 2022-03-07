package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

public class MailTemplateFactory {

    /**
     * Mail Type에 따라 Search, Avatar 메일 템플릿 객체 생성
     *
     * @param mailType Mail Type
     * @return MailTemplate
     */
    public static MailTemplate createMailTemplate(MailType mailType) {
        MailTemplate mailTemplate = null;

        switch (mailType) {
            case AVATAR:
                mailTemplate = new AvatarMailTemplate();
                break;
            case SEARCH:
                mailTemplate = new SearchMailTemplate();
                break;
        }
        return mailTemplate;
    }
}
