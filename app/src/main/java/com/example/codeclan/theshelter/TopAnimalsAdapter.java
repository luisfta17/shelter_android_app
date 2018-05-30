package com.example.codeclan.theshelter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopAnimalsAdapter extends ArrayAdapter<Animal> {

    public TopAnimalsAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.animals_item, parent, false);
        }
        Animal currentAnimal = getItem(position);

        TextView age = (TextView) listItemView.findViewById(R.id.age);
        age.setText(currentAnimal.getAge().toString());
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentAnimal.getName().toString());
        TextView type = (TextView) listItemView.findViewById(R.id.type);
        type.setText(currentAnimal.getType().toString());

        listItemView.setTag(currentAnimal);

        return listItemView;
    }


}
