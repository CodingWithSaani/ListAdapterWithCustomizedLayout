package com.tutorials180.listadapterwithcustomizedlayout;

public class MyModelClass {

    private String nameOfDay;
    private int referenceOfImage;

    public MyModelClass(String nameOfDay, int referenceOfImage) {
        this.nameOfDay = nameOfDay;
        this.referenceOfImage = referenceOfImage;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public int getReferenceOfImage() {
        return referenceOfImage;
    }

    public void setReferenceOfImage(int referenceOfImage) {
        this.referenceOfImage = referenceOfImage;
    }
}

