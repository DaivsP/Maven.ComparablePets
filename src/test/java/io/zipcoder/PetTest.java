package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void speakPetTest() {
        //Given
        String expectedSpeak = "Squeak!";
        //When
        pet.speak();
        //Then
        Assert.assertEquals(expectedSpeak, pet.speak());
    }

    @Test
    public void setName() {
        //Given
        Pet pet = new Pet(null, null, null);
        String givenName = "Pedro";
        //When
        pet.setName(givenName);
        //Then
        String petName = pet.getName();
        Assert.assertEquals(givenName, petName);
    }
}
