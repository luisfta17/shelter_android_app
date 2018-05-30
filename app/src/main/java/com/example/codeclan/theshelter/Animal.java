package com.example.codeclan.theshelter;

import java.io.Serializable;

public class Animal implements Serializable{

    private String name;
    private Integer age;
    private String type;

    public Animal(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

}
