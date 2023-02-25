package com.example.app.explorenepal.AllTourDestinations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.app.explorenepal.R;

import java.util.ArrayList;

public class DestinationsList extends AppCompatActivity {

    RecyclerView recycler;
    LinearLayoutManager manager;
    DestinationsList_Adapter adapter;
    ArrayList<DestinationsList_Model> array;
    ImageView img ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attractions_list);
        img = (ImageView) findViewById(R.id.imageView);



        array = new ArrayList<>();
        array.add(new DestinationsList_Model("Kathmandu", "Bagmati", R.drawable.kathmandu));
        array.add(new DestinationsList_Model("Swayambhu", "Bagmati", R.drawable.swaymbhu));
        array.add(new DestinationsList_Model("Pokhara", "lakeside", R.drawable.pokhara));
        array.add(new DestinationsList_Model("Chitwan National Park", "Bharatpur", R.drawable.chitwan));


        adapter = new DestinationsList_Adapter(this, array);

        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler = findViewById(R.id.tourattr_recycler);

        recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);


        img.setOnClickListener(v -> finish());
    }



}