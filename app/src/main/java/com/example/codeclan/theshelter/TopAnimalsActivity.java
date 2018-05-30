package com.example.codeclan.theshelter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_animals);
        TopAnimals topAnimals = new TopAnimals();
        ArrayList<Animal> list = topAnimals.getList();

        TopAnimalsAdapter animalsAdapter = new TopAnimalsAdapter(this, list);

        ListView listView =(ListView)findViewById(R.id.list);
        listView.setAdapter(animalsAdapter);
    }

    public void onListItemClick(View listItem) {
        Animal animal = (Animal) listItem.getTag();
        Log.d("Animal Name: ", animal.getName());

        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra("animal", animal);
        startActivity(intent);
    }
}
