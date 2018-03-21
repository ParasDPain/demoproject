package com.piyush.testautomation.java.Junittest;

import com.piyush.testautomation.java.AnimalClass;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    private AnimalClass dog = new AnimalClass();
    private AnimalClass cat = new AnimalClass();

    @Test
    public void AnimalTest() {
        dog.setName("Guz");
        dog.setColor("Black");
        dog.setNoOfLegs(4);
        dog.setNoise("woof");

        Assert.assertEquals(dog.getName(), "Guz");
        Assert.assertEquals(dog.getColor(), "Black");
        Assert.assertEquals(dog.getNoOfLegs(), 4);
        Assert.assertEquals(dog.getNoise(), "woof");
    }
}
