package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

public class ValidUserFactory {

    /**
     * Mail Type에 따라 Search, Avatar 대상자 추출 객체 생성
     *
     * @param mailType Mail Type
     * @return Valid User 객체
     */
    public static ValidUser createValidUser(MailType mailType) {
        ValidUser validUser = null;

        switch (mailType) {
            case AVATAR:
                validUser = new AvatarMailValidUser();
                break;
            case SEARCH:
                validUser = new SearchMailValidUser();
                break;
        }
        return validUser;
    }
}
