package me.yj.designpattern._01_creation_patterns._03_abstract_factory._04_custom;

import java.util.HashSet;
import java.util.Set;

public abstract class ValidUser {
    Set<Long> validUserList = new HashSet<>();

    protected abstract Set<Long> getValidUser();

    public void setValidUserList(Set<Long> validUserList) {
        validUserList.addAll(validUserList);
    }
}
