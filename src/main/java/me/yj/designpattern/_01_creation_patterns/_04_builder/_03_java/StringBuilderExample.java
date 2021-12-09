package me.yj.designpattern._01_creation_patterns._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("youngjun").append("_park").toString();
        System.out.println(result);
    }
}
