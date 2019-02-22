package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CatTest {
    private Cat cat;

    @Before
    public void setUp() {
        this.cat = new Cat("Tom", 2, 1);
    }

    @Test
    public void setCatNameTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        String givenName = "Tom";
        //When
        cat.setName(givenName);
        //Then
        String catName = cat.getName();
        Assert.assertEquals(givenName, catName);
    }

    @Test
    public void setCatAgeTest() {
        //Given
        Integer givenAge = 2;
        //When
        cat.setAge(givenAge);
        //Then
        Integer catAge = cat.getAge();
        Assert.assertEquals(givenAge, catAge);
    }

    @Test
    public void speakDogTest() {
        //Given
        String expectedSpeak = "Meow!";
        //When
        cat.speak();
        //Then
        Assert.assertEquals(expectedSpeak, cat.speak());
    }

    @Test
    public void petInheritanceTest() {
        //Given
        //When
        //Then
        Assert.assertTrue(cat instanceof Pet);
    }
}
}