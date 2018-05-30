package com.example.codeclan.theshelter;

public class Animal {

    private String name;
    private int age;
    private String type;

    public Animal(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

}
