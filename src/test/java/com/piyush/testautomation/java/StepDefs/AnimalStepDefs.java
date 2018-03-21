package com.piyush.testautomation.java.StepDefs;

import com.piyush.testautomation.java.AnimalClass;
import com.piyush.testautomation.java.CatClass;
import com.piyush.testautomation.java.DogClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class AnimalStepDefs {
    private AnimalClass myDog;
    private AnimalClass myCat;
    private String animalSound1;
    private String animalSound2;

    @Given("^I have an animal$")
    public void iHaveAnAnimal() throws Throwable {
        myDog = new DogClass();
        myCat = new CatClass();
    }

    @When("^The animal makes sound$")
    public void theAnimalMakesSound() throws Throwable {
        animalSound1 = myDog.getNoise();
        animalSound2 = myCat.getNoise();
    }

    @Then("^I expect dog make sound$")
    public void iExpectDogMakeSound() throws Throwable {
        assertEquals("woof", animalSound1);
        assertEquals("meow", animalSound2);
    }
}
