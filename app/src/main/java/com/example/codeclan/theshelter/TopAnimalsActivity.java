package com.example.codeclan.theshelter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class TopAnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_animals);
        TopAnimals topAnimals = new TopAnimals();
        ArrayList<Animal> list = topAnimals.getList();

        TopAnimalsAdapter animalsAdapter = new TopAnimalsAdapter(this, list);
    }
}
