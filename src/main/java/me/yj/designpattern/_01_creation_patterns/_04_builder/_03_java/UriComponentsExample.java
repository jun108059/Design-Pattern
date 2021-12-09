package me.yj.designpattern._01_creation_patterns._04_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class UriComponentsExample {

    public static void main(String[] args) {
        UriComponents myBlogUrl = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("dev-youngjun.tistory.com")
                .path("/197")
                .build().encode();
        System.out.println(myBlogUrl);
    }
}
