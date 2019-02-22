package io.zipcoder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
    @Before
    private Dog dog = new Dog("Fido", 2, 1);
    private Cat cat = new Toucan("Sam", 2, 1);
    private Toucan toucan = new Cat("Tom", 2, 1);
    private House house = new House();

    @Test
    public void getAmountOfPetsTest() {
        //Given
        house.add(dog);
        house.add(cat);
        house.add(toucan);
        //When
        Integer actual = house.getNumberOfPets();
        //Then
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfPetsTest2() {
        //Given
        house.add(dog);
        house.add(cat);
        house.add(toucan);
        //When
        Boolean expectedDog = house.contains(dog);
        Boolean expectedCat = house.contains(cat);
        Boolean expectedToucan = house.contains(toucan);
        //Then
        Assert.assertTrue(expectedDog);
        Assert.assertTrue(expectedCat);
        Assert.assertTrue(expectedToucan);
    }

    @Test
    public void getAmountOfPetsTest3() {
        //Given
        house.add(dog);
        house.add(cat);
        house.add(toucan);
        //When
        Boolean expected = house.isEmpty();
        //Then
        Assert.assertFalse(expected);
    }
}