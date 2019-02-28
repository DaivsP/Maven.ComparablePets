package io.zipcoder;

public class Toucan extends Pet{
    String name;
    Integer age;
    Integer id;
    public Toucan(String name, Integer age, Integer id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public String speak() {
        return "Croak!";
    }
}
