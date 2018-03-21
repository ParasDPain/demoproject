package com.piyush.testautomation.java.Junittest;

import com.piyush.testautomation.java.CatClass;
import com.piyush.testautomation.java.DogClass;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    DogClass dogObject = new DogClass();

    @Test
    public void TestCat() {
        dogObject.setName("shera");
        Assert.assertEquals("shera", dogObject.getName());
    }

    @Test
    public void TestNoise() {
        dogObject.setNoise("woof");
        Assert.assertEquals("woof", dogObject.getNoise());
    }

    @Test
    public void TestNoOfLegs() {
        dogObject.setNoOfLegs(4);
        Assert.assertEquals(4, dogObject.getNoOfLegs());
    }

    @Test
    public void TestColor() {
        dogObject.setColor("Black");
        Assert.assertEquals("Black", dogObject.getColor());
    }
}
