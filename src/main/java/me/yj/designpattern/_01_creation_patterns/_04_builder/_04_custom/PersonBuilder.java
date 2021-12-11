package me.yj.designpattern._01_creation_patterns._04_builder._04_custom;

//Abstract Builder
public abstract class PersonBuilder {
    protected Person person;

    public final void createPerson() {
        person = new Person();
    }

    public abstract void buildLastName();
    public abstract void buildFirstName();

    public Person getPerson(){
        return person;
    }
}