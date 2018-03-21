package com.piyush.testautomation.java;

public class AnimalClass {
    private String name;
    private int noOfLegs;
    private String color;
    private String noise ;

    //creating getters and setters
    public String getName() {
        return name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
