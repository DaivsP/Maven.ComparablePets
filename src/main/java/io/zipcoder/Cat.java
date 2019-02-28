package io.zipcoder;

public class Cat extends Pet {
    public String name;
    public Integer age;
    public Integer id;
    public Cat(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return this.age;
    }

    public String speak() {
        return "Meow!";
    }

    public String getName() {
        return this.name;
    }

    public void setAge(Integer givenAge) {
        this.age = age;
    }
}
