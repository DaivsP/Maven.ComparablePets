package io.zipcoder;

public class Pet {
    public String name;

    public Pet(String name){
        this.name = name;
    }

    public Pet() {

    }

    public String speak(){
        return "Squeak!";
    }

    public void setName(String givenName) {
        this.name = givenName;
    }

    public String getName() {
        return this.name;
    }
}
