package com.piyush.testautomation.java.Junittest;

import com.piyush.testautomation.java.CatClass;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    CatClass catObject = new CatClass();

    @Test
    public void TestCat() {
        catObject.setName("billy");
        Assert.assertEquals("billy", catObject.getName());
    }

    @Test
    public void TestNoise() {
        catObject.setNoise("meow");
        Assert.assertEquals("meow", catObject.getNoise());
    }

    @Test
    public void TestNoOfLegs() {
        catObject.setNoOfLegs(4);
        Assert.assertEquals(4, catObject.getNoOfLegs());
    }

    @Test
    public void TestColor() {
        catObject.setColor("White");
        Assert.assertEquals("White", catObject.getColor());
    }
}
