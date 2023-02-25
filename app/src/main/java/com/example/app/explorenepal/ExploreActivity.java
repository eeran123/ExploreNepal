package com.example.app.explorenepal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExploreActivity extends AppCompatActivity {

    TextView description;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

         description=findViewById(R.id.Nepal_description);

         description.setText("Nepal is a landlocked country in South Asia known for its stunning natural beauty, rich cultural heritage, and warm hospitality. \n" +
                "\n" +
                "It is home to the world's highest mountains, including Mount Everest, and is a popular destination for trekking and adventure tourism.\n" +
                "\n" +
                "For those who want to explore beyond its feted beaches, Nepal's small size makes it simple to experience a mix of culture, history, and landscapes even on a short trip.");

    }
}