package com.example.codeclan.theshelter;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Animal implements Serializable{

    private String name;
    private Integer age;
    private String type;
    private int image;

    public Animal(String name, int age, String type, int image){
        this.name = name;
        this.age = age;
        this.type = type;
        this.image = image;
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

    public int getImage() {
        return image;
    }
}
