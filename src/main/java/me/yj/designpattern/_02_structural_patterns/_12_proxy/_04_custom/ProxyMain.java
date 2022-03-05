package me.yj.designpattern._02_structural_patterns._12_proxy._04_custom;

public class ProxyMain {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("kakao.png");
        Image image2 = new ProxyImage("naver.png");

        image1.displayImage();
        image2.displayImage();
    }
}
