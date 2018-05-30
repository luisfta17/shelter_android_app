package com.example.codeclan.theshelter;

import java.util.ArrayList;

public class TopAnimals {

    private ArrayList<Animal> list;

    public TopAnimals(){
        list = new ArrayList<>();
        list.add(new Animal("Nano", 6, "Doggo", R.drawable.doggo1));
        list.add(new Animal("Arthur", 4, "Doggo", R.drawable.doggo2));
        list.add(new Animal("Rocket", 4, "Rabbit", R.drawable.rocket));
        list.add(new Animal("Chewie", 130, "Wookie", R.drawable.dart));
        list.add(new Animal("Katy", 10, "cat", R.drawable.arnolf));
        list.add(new Animal("Ruri", 10, "Rabbit", R.drawable.doggo4));
        list.add(new Animal("Johana", 1, "turtle", R.drawable.doggo4));
        list.add(new Animal("Luis", 8, "hawk", R.drawable.doggo4));
        list.add(new Animal("ganzo", 8, "hawk", R.drawable.doggo4));
        list.add(new Animal("Flappy", 8, "bird", R.drawable.doggo4));
    }

    public ArrayList<Animal> getList() {
        return list;
    }

}
