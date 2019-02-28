package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Pet> petHouse;

    public House(){
        this.petHouse = new ArrayList<Pet>();
    }

    public void add(Dog dog) {
        this.petHouse.add(dog);
    }

    public void add(Cat cat){
        this.petHouse.add(cat);
    }

    public void add(Toucan toucan){
        this.petHouse.add(toucan);
    }

    public Integer getNumberOfPets() {
        return this.petHouse.size();
    }

    public Boolean contains(Dog dog) {
        return this.petHouse.contains(dog);
    }

    public Boolean contains(Cat cat){
        return this.petHouse.contains(cat);
    }

    public Boolean contains(Toucan toucan){
        return this.petHouse.contains(toucan);
    }

    public Boolean isEmpty() {
        return this.petHouse.isEmpty();
    }
}
