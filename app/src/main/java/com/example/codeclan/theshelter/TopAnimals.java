package com.example.codeclan.theshelter;

import java.util.ArrayList;

public class TopAnimals {

    private ArrayList<Animal> list;

    public TopAnimals(){
        list = new ArrayList<>();
        list.add(new Animal("Nano", 6, "Doggo"));
        list.add(new Animal("Arthur", 4, "Doggo"));
        list.add(new Animal("Rocket", 4, "Rabbit"));
        list.add(new Animal("Chewie", 130, "Wookie"));
        list.add(new Animal("Katy", 10, "cat"));
        list.add(new Animal("Ruri", 10, "Rabbit"));
        list.add(new Animal("Johana", 1, "turtle"));
        list.add(new Animal("Luis", 8, "hawk"));
        list.add(new Animal("ganzo", 8, "hawk"));
        list.add(new Animal("Flappy", 8, "bird"));
    }
}
