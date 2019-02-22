package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ToucanTest {

    @Before
    public void setUp(){
        this.toucan = new Toucan("Sam", 2, 1);
    }

    @Test
    public void setToucanNameTest(){
        //Given
        Toucan toucan = new Toucan(null, null, null);
        String givenName = "Sam";
        //When
        toucan.setName(givenName);
        //Then
        String toucanName = toucan.getName();
        Assert.assertEquals(givenName, toucanName);}

        @Test
        public void setToucanAgeTest(){
        //Given
            Integer givenAge = 2;
            //When
            toucan.setAge(givenAge);
            //Then
            Integer toucanAge = toucan.getAge();
            Assert.assertEquals(givenAge, toucanAge);

        }

        @Test
        public void speakToucanTest(){
            //Given
            String expectedSpeak = "Croak!";
            //When
            toucan.speak();
            //Then
            Assert.assertEquals(expectedSpeak, toucan.speak());}

        @Test
        public void petInheritanceTest(){
            //Given
            //When
            //Then
            Assert.assertTrue(toucan instanceof Pet);
        }
    }