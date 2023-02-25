package com.example.app.explorenepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowFestivals extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_festivals);

        tv=findViewById(R.id.festivals_description);

        String key= getIntent().getStringExtra("key");

        if (Integer.parseInt(key)==0){
            tv.setText("Dance:\n" +
                    "\n" +
                    "Nepali dance is a vibrant and colorful art form that is deeply rooted in the country's rich cultural heritage. It is a form of expression that combines music, rhythm, and movement to convey a story or message.\n" +
                    "\n" +
                    "Music:\n" +
                    "\n" +
                    "Nepali music is a diverse and vibrant art form that is deeply rooted in the country's cultural heritage. It encompasses a wide range of musical genres, including traditional folk music, classical music, pop music, and fusion music.\n" +
                    "\n" +
                    "Traditional Nepali music is often associated with folk songs and dances that are performed during festivals and special occasions. These songs and dances are characterized by their simplicity and use of traditional instruments, such as the madal, sarangi, and bansuri.\n" +
                    "\n" +
                    "Classical Nepali music, on the other hand, is influenced by Indian classical music and is often performed by trained musicians. It is known for its intricate melodies and rhythms and is typically performed in a formal setting, such as a concert hall.\n" +
                    "\n" +
                    "arts and history:\n" +
                    "\n" +
                    "Nepal has a rich artistic and cultural heritage that is deeply intertwined with its history. The country's art and architecture have been influenced by a range of different cultural, religious, and historical factors, including Buddhism, Hinduism, and various royal dynasties.");
        }
        else if(Integer.parseInt(key)==1){
            tv.setText("Theater:\n" +
                    "\n" +
                    "Nepali theater is a vibrant and growing art form that has a rich cultural history. It is a form of expression that combines acting, music, and dance to tell stories and convey messages to the audience.\n" +
                    "\n"
                    );
        }else{
            tv.setText("Music:\n" +
                    "\n" +
                    "Nepali music is a vibrant and diverse art form that reflects the country's rich cultural heritage and its connection to both India and the wider world. It continues to evolve and adapt to changing times, while remaining an important part of the country's cultural identity.\n" +
                    "\n" );
        }

    }
}