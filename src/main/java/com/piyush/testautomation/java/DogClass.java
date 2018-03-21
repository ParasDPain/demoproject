package com.piyush.testautomation.java;

public class DogClass extends AnimalClass {
    private String noise = "woof";

    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }
}
