package me.yj.designpattern._01_creation_patterns._04_builder._04_custom;

//Builder
public class StandardPersonBuilder extends PersonBuilder{

    protected Person person;

    @Override
    public void buildLastName(){
        person.setLastName("홍");
    }

    @Override
    public void buildFirstName(){
        person.setFirstName("길동");
    }
}