package io.zipcoder;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class DogTest {
    private Dog dog;

    @Before
    public void setUp() {
        this.dog = new Dog("Fido", 2, 1);
    }

    @Test
    public void setDogNameTest() {
        //Given
        Dog dog = new Dog(null, null, null);
        String givenName = "Fido";
        //When
        dog.setName(givenName);
        //Then
        String dogName = dog.getName();
        Assert.assertEquals(givenName, dogName);
    }

    @Test
    public void setDogAgeTest(){
        //Given
        Integer givenAge = 2;
        //When
        dog.setAge(givenAge);
        //Then
        Integer dogAge = dog.getAge();
        Assert.assertEquals(givenAge, dogAge);
    }

    @Test
    public void speakDogTest() {
        //Given
        String expectedSpeak = "woof!";
        //When
        dog.speak();
        //Then
        Assert.assertEquals(expectedSpeak, dog.speak());
    }

    @Test
    public void petInheritanceTest() {
        //Given
        //When
        //Then
        Assert.assertTrue(dog instanceof Pet);
    }
}
