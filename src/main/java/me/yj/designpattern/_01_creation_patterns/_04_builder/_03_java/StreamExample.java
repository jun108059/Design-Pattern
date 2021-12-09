package me.yj.designpattern._01_creation_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder().add("youngjun").add("github").build();
        names.forEach(System.out::println);
    }
}
