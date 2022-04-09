package me.yj.designpattern._03_behavioral_patterns._18_memento._04_custom;

import lombok.Getter;

@Getter
public class Memento {
    private final String job;
    private final String description;

    public Memento(String job, String description) {
        this.job = job;
        this.description = description;
    }
}