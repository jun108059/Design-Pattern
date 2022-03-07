package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.Set;

public class AvatarMailValidUser extends ValidUser {
    @Override
    protected Set<Long> getValidUser() {
        System.out.println("Valid User For Avatar Data");
        return null;
    }
}
