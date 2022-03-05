package me.yj.designpattern._02_structural_patterns._12_proxy._04_custom;

public class RealImage implements Image {

    private final String realImagePath;

    public RealImage(String imageName) {
        this.realImagePath = getImagePathFromAWS(imageName);
    }


    private String getImagePathFromAWS(String imageName) {
        return "/aws/image/" + imageName;
    }

    @Override
    public void displayImage() {
        System.out.println("Display Image Path : " + this.realImagePath);
    }
}
