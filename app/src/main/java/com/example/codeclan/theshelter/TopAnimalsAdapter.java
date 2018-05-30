package com.example.codeclan.theshelter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TopAnimalsAdapter extends ArrayAdapter<Animal> {

    public TopAnimalsAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);

    }

}
