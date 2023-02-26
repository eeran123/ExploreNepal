package com.example.app.explorenepal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ShowFestivals extends AppCompatActivity {

    TextView tv;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_festivals);

        tv=findViewById(R.id.festivals_description);

        String key= getIntent().getStringExtra("key");

        if (Integer.parseInt(key)==0){
            tv.setText("Rato Machhindranath Jatra:\n" +
                    "\n" +
                    "This is a month-long festival celebrated in Patan, Kathmandu valley during the months of May and June. The festival is dedicated to the god of rain and good harvest, Rato Machhindranath.\n" +
                    "\n" +
                    "Janai Purnima:\n" +
                    "\n" +
                    "This festival is celebrated in August, marking the full moon day of the Hindu month of Shrawan. It is a religious festival that involves the changing of the sacred thread by the Brahmin community.\n" +
                    "\n" +
                    "Nag Panchami:\n" +
                    "\n" +
                    "This festival is celebrated in July or August, marking the worship of the serpent god. It is believed that the worship of the serpent god protects against snake bites.\n" +
                    "\n" +
                    "Krishna Janmashtami:\n" +
                    "\n" +
                    "This festival is celebrated in August or September to mark the birth of Lord Krishna. It is celebrated with great enthusiasm in the Kathmandu valley." +
                    "\n" +
                    "Ropai Jatra: \n" +
                    "\n" +
                    "This festival is celebrated in June, marking the beginning of the rice-planting season. It is celebrated with great joy in the rural areas of Nepal." +
                    "\n" +
                    "Ghanta Karna Chaturdashi: \n" +
                    "\n" +
                    "This festival is celebrated in August or September. It involves the burning of an effigy of the demon Ghanta Karna, which is believed to ward off evil spirits." +

                    "Gai Jatra: \n" +
                    "\n" +
                    "A festival celebrated to honor the dead, celebrated in August or September.Although Gai Jatra is celebrated in August or September, it falls during the summer season. It is a colorful festival celebrated in the Kathmandu valley to honor the dead."

            );
        }
        else if(Integer.parseInt(key)==1){
            tv.setText(     "Dashain:\n" +
                            "\n" +
                            "Dashain is the biggest and most important festival in Nepal, celebrated in September or October. It is a 15-day festival that marks the victory of good over evil.The biggest and most important festival in Nepal, celebrated in September or October for 15 days.\n" +
                             "\n"+
                            "Tihar:\n" +
                            "\n" +
                            "Tihar, also known as the festival of lights, is celebrated in October or November for five days. It is a festival that honors the goddess of wealth and prosperity.\n" +
                            "\n" +
                            "Chhat:\n" +
                            "\n" +
                            "Chhath is a festival celebrated in November, mainly in the Terai region of Nepal. It is a festival dedicated to the worship of the sun god.\n" +
                            "\n" +
                            "Maghe Sankranti:\n" +
                            "\n" +
                            "Maghe Sankranti is celebrated in January, marking the end of the winter solstice. It is a festival that marks the beginning of longer and warmer days.\n" +
                            "\n" +
                            "Loshar:\n" +
                            "\n" +
                            "Lhosar is a festival celebrated by the Tibetan community in Nepal. It is celebrated in February or March and marks the beginning of the Tibetan New Year.\n" +
                            "\n" +
                            "Shree Swasthani Brata Katha: \n" +
                            "\n" +
                            "This festival is celebrated in January or February and involves the reading of the Swasthani Brata Katha, a Hindu religious text that tells the story of Lord Shiva and Parvati." +
                            "\n" +
                            "Ghanta Karna Chaturdashi: \n" +
                            "\n" +
                            "This festival is celebrated in August or September. It involves the burning of an effigy of the demon Ghanta Karna, which is believed to ward off evil spirits." +

                            "Sonam Lhosar \n" +
                            "\n" +
                            "Sonam Lhosar is another Tibetan New Year festival celebrated by the Tamang community in Nepal. It is celebrated in February and involves singing, dancing, and feasting.\n" +
                            "\n"

                    );
        }else{
            tv.setText("Holi:\n" +
                    "\n" +
                    "Holi, also known as the festival of colors, is celebrated in March to mark the beginning of spring. It is a festival of joy, fun, and frolic, and involves the throwing of colored powder and water.\n" +
                    "\n" +
                    "Bisket Jatra:\n" +
                    "\n" +
                    "Bisket Jatra is a festival celebrated in the town of Bhaktapur in April. It is a festival that marks the Nepali New Year and involves the pulling of chariots and the display of colorful masks\n" +
                    "\n"+
                    "Buddha Jayanti:\n" +
                    "\n" +
                    " Buddha Jayanti is a festival celebrated in April or May to commemorate the birth, enlightenment, and death of Lord Buddha. It is a festival that involves prayer, meditation, and offerings.\n" +
                    "\n" +
                    "Nepali New Year:\n" +
                    "\n" +
                    "Nepali New Year, also known as Baisakh, is celebrated in April. It is a festival that marks the beginning of a new year and involves prayer, feasting, and dancing.\n" +
                    "\n" +
                    "Rato Machhindranath Jatra:\n" +
                    "\n" +
                    "Rato Machhindranath Jatra is a month-long festival celebrated in May and June in Patan, Kathmandu valley. It is a festival that honors the god of rain and good harvest, Rato Machhindranath.\n" +
                    "\n" +
                    "Loshar:\n" +
                    "\n" +
                    "Lhosar is a festival celebrated by the Tibetan community in Nepal. It is celebrated in February or March and marks the beginning of the Tibetan New Year.\n" +
                    "\n" +
                    "Seto Machhindranath Jatra: \n" +
                    "\n" +
                    "Seto Machhindranath Jatra is a festival celebrated in April or May in Kathmandu valley. It is a festival that involves the pulling of a chariot carrying the statue of the god Seto Machhindranath." +
                    "\n" +
                    "Ghode Jatra: \n" +
                    "\n" +
                    "Ghode Jatra is a festival celebrated in April in Kathmandu valley. It is a festival that involves the display of horses and is believed to protect against evil spirits."

            );
        }

    }
}