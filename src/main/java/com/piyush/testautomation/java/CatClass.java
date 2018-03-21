package com.piyush.testautomation.java;

public class CatClass extends AnimalClass {
    private String noise = "meow";

    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }
}
