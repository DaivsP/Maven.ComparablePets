package io.zipcoder;

public class Dog extends  Pet{
    public String name;
    public Integer age;
    public Integer id;

    public Dog (String name, Integer age, Integer id){
        super();
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

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String speak() {
        return "woof!";
    }
}
