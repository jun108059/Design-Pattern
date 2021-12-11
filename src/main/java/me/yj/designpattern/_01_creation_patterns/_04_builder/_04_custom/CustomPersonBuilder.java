package me.yj.designpattern._01_creation_patterns._04_builder._04_custom;

public class CustomPersonBuilder extends PersonBuilder {

    protected Person person;

    @Override
    public void buildLastName(){
        person.setLastName("김");
    }

    @Override
    public void buildFirstName(){
        person.setFirstName("이박");
    }
}
