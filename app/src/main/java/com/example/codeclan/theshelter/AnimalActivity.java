package com.example.codeclan.theshelter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        Intent intent = getIntent();
        Animal animal = (Animal) intent.getSerializableExtra("animal");
        Log.d("AnimalActivity: ", animal.getName());
    }
}
