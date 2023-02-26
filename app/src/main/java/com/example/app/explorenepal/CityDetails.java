package com.example.app.explorenepal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;

public class CityDetails extends AppCompatActivity {

    ShapeableImageView mainimage, attr1img, attr2img, food1img, food2img;
    TextView city, description, duration, timetovisit, attr1name, attr1des, attr2name, attr2des, food1name, food1des, food2name, food2des,besttime;
    Button locationbtn;
    String location;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        mainimage = findViewById(R.id.citydetails_image);
        besttime=findViewById(R.id.textView13);
        attr1img = findViewById(R.id.citydetails_place1image);
        attr2img = findViewById(R.id.citydetails_place2image);
        food1img = findViewById(R.id.citydetails_food1image);
        food2img = findViewById(R.id.citydetails_food2image);
        city = findViewById(R.id.citydetails_name);
        description = findViewById(R.id.citydetails_description);
        timetovisit = findViewById(R.id.citydetails_besttime);
        attr1name = findViewById(R.id.citydetails_place1name);
        attr2name = findViewById(R.id.citydetails_place2name);
        food1name = findViewById(R.id.citydetails_food1name);
        food2name = findViewById(R.id.citydetails_food2name);
        attr1des = findViewById(R.id.citydetails_place1description);
        attr2des = findViewById(R.id.citydetails_place2description);
        food1des = findViewById(R.id.citydetails_food1description);
        food2des = findViewById(R.id.citydetails_food2description);
        locationbtn = findViewById(R.id.citydetails_getlocationbtn);

        String city_str = getIntent().getStringExtra("putextra_city");

        switch (city_str) {
            case "Pasupatinath":
                city.setText("Kathmandu");
                attr1name.setText("PasupathiNath Temple");
                attr2name.setText("Pashupatinath Temple is one of the most sacred Hindu temples in the world and is located in Kathmandu, Nepal.");
                attr1des.setText("It is dedicated to Lord Shiva, one of the three principal deities of Hinduism. ");
                attr2des.setText("The temple complex, which is spread over an area of 264 hectares, is a UNESCO World Heritage Site");
                attr1img.setImageResource(R.drawable.kathmandu);
                attr2img.setImageResource(R.drawable.pasupatinath1);
                food1name.setText("Tuna salad sandwich");
                food2name.setText("Thakali thali");
                food1des.setText("The tuna salad has boiled egg whites in it which I’ve never seen before. And the tuna salad is just a touch saltier than the egg salad sandwich (to which You found yourself adding salt). No matter what sandwich you try, make sure it comes on the seven-grain bread. It’s soft, delicious, and hearty.");
                food2des.setText("The Thakali Thali usually includes a serving of steamed rice, a lentil soup known as dal, a vegetable curry, a meat or chicken curry, and achar (pickles). The meal may also include aloo tama (a dish made with potatoes and bamboo shoots), spinach or other leafy greens, and a pappadum (a crispy flatbread).");
                food1img.setImageResource(R.drawable.organic);
                food2img.setImageResource(R.drawable.rice);
                besttime.setText("Pashupatinath Temple can be visited throughout the year, but the best time to visit depends on your preferences and travel plans.");
                description.setText("The best time to visit Pashupatinath Temple depends on your personal preferences and travel plans. If you don't mind the crowds and want to experience the temple during a festival, then you might choose to visit during peak season. If you prefer a quieter experience, then you might choose to visit during the off-season..");
                location = "https://goo.gl/maps/xuqCR1PsmEgQh6rM9";
                timetovisit.setText("Best Time to Visit");
                mainimage.setImageResource(R.drawable.kathmandu);
                break;
            case "Swayambhu":
                city.setText("Kathmandu");
                attr1name.setText("Swayambhu");
                attr2name.setText("Swayambhunath, also known as the Monkey Temple, is an ancient Buddhist temple located on a hilltop in the Kathmandu Valley of Nepal. The temple is one of the most iconic and recognizable landmarks in Nepal and is an important pilgrimage site for both Buddhists and Hindus.");
                attr1des.setText("Main city Kathmandu");
                attr2des.setText("The main stupa at Swayambhunath is a massive white dome that is topped by a gilded spire and a pair of all-seeing eyes that symbolize the wisdom and compassion of the Buddha.");
                attr1img.setImageResource(R.drawable.swayambhunath);
                attr2img.setImageResource(R.drawable.swayambhunath1);

                food1name.setText("Friedmomo");
                food2name.setText("Newari Cuisine");
                food1des.setText("fried momos are delicious, they are also quite high in calories and should be consumed in moderation as part of a balanced diet");
                food2des.setText("Newaris are the locals of Kathmandu, who were the original habitats of the city from many centuries back. Their cuisines in Kathmandu are exceptional and wonderful to taste. Nearly 200 variety of cuisines of Newari are known for their fantastic flavors. If you want to try the best local food of Kathmandu means, Newari cuisines are the best choice. Alu tama, Bara, Dheedo, Gundruk, Sinki, Senla mu, Hakuchoila, Bhuttan, Aloo sadheko, etc are some of the famous specials of Newari.");
                food1img.setImageResource(R.drawable.friedmomo);
                food2img.setImageResource(R.drawable.newaricuice);

                besttime.setText("Best time to visit months of October to December and March to May. ");
                description.setText("Swayambhunath, also known as the Monkey Temple, is an ancient Buddhist temple located on a hilltop in the Kathmandu Valley of Nepal. The temple is one of the most iconic and recognizable landmarks in Nepal and is an important pilgrimage site for both Buddhists and Hindus..hence months are considered the peak tourist season in Nepal, as the weather is generally mild and dry, making it ideal for sightseeing and outdoor activities.");
                location = "https://goo.gl/maps/RuZF2emUYWVyBnwL9";
                timetovisit.setText("Best Time to Visit");
                mainimage.setImageResource(R.drawable.swaymbhu);
                break;
            case "Pokhara":
                city.setText("Lakeside");
                attr1name.setText("Pokhara");
                attr2name.setText("Green city");
                attr1des.setText("Main city of lekhnath");
                attr2des.setText("The city is known for its stunning natural beauty, including its clear blue lakes, lush green forests, and magnificent mountain views.");
                attr1img.setImageResource(R.drawable.lakeside);
                attr2img.setImageResource(R.drawable.pokharacity);

                food1name.setText("Friedmomo");
                food2name.setText("Newari Cuisine");
                food1des.setText("fried momos are delicious, they are also quite high in calories and should be consumed in moderation as part of a balanced diet");
                food2des.setText("Newaris are the locals of Kathmandu, who were the original habitats of the city from many centuries back. Their cuisines in Kathmandu are exceptional and wonderful to taste. Nearly 200 variety of cuisines of Newari are known for their fantastic flavors. If you want to try the best local food of Kathmandu means, Newari cuisines are the best choice. Alu tama, Bara, Dheedo, Gundruk, Sinki, Senla mu, Hakuchoila, Bhuttan, Aloo sadheko, etc are some of the famous specials of Newari.");
                food1img.setImageResource(R.drawable.friedmomo);
                food2img.setImageResource(R.drawable.newaricuice);

                besttime.setText("Best time to visit months of October to December and March to May. ");
                description.setText(" Pokhara is a city located in the western region of Nepal, about 200 kilometers west of Kathmandu, the capital city of Nepal. It is situated in a valley at the base of the Annapurna mountain range, making it a popular destination for outdoor enthusiasts and nature lovers.\n" +
                        "\n" +
                        "The city is known for its stunning natural beauty, including its clear blue lakes, lush green forests, and magnificent mountain views. Phewa Lake, one of the most popular attractions in Pokhara, offers scenic boat rides and is surrounded by restaurants and cafes that provide breathtaking views of the surrounding landscape.\n" +
                        "\n" +
                        "Pokhara is also a hub for adventure sports such as trekking, paragliding, and rafting. The Annapurna Circuit Trek, which starts from Pokhara, is one of the most popular treks in Nepal and offers stunning views of the Himalayan mountain range.\n" +
                        "\n" +
                        "The city has a vibrant nightlife and is home to many bars, restaurants, and cafes that cater to both locals and tourists. The Lakeside area is particularly popular for its lively atmosphere and range of entertainment options.\n" +
                        "\n" +
                        "Overall, Pokhara is a beautiful and vibrant city that offers visitors a chance to experience the natural beauty and adventure of Nepal, while also enjoying its rich cultural heritage and warm hospitality.");
                location = "https://goo.gl/maps/RuZF2emUYWVyBnwL9";
                timetovisit.setText("Best Time to Visit");
                mainimage.setImageResource(R.drawable.pokharacity);
                break;
            case "Chitwan":
                city.setText("Baratpur");
                attr1name.setText("Chitwan");
                attr2name.setText("Green city");
                attr1des.setText("Main city chitwan");
                attr2des.setText("The city is known for its stunning natural beauty, including its clear blue lakes, lush green forests, and magnificent mountain views.");
                attr1img.setImageResource(R.drawable.img);
                attr2img.setImageResource(R.drawable.chitwan);

                food1name.setText("Friedmomo");
                food2name.setText("Newari Cuisine");
                food1des.setText("fried momos are delicious, they are also quite high in calories and should be consumed in moderation as part of a balanced diet");
                food2des.setText("Newaris are the locals of Kathmandu, who were the original habitats of the city from many centuries back. Their cuisines in Kathmandu are exceptional and wonderful to taste. Nearly 200 variety of cuisines of Newari are known for their fantastic flavors. If you want to try the best local food of Kathmandu means, Newari cuisines are the best choice. Alu tama, Bara, Dheedo, Gundruk, Sinki, Senla mu, Hakuchoila, Bhuttan, Aloo sadheko, etc are some of the famous specials of Newari.");
                food1img.setImageResource(R.drawable.friedmomo);
                food2img.setImageResource(R.drawable.newaricuice);

                besttime.setText("The best time to visit Chitwan for wildlife viewing is during the winter months, from October to February, when the weather is dry and cool. During this time, animals are more active, and it is easier to spot them in the national park. ");
                description.setText(" Chitwan is a city located in the southwestern part of Nepal, in the Terai region. It is the fifth-largest city in Nepal and is known for its biodiversity and wildlife conservation efforts. The city is home to Chitwan National Park, which is one of the most popular tourist destinations in Nepal.\n" +
                        "\n" +
                        "Chitwan National Park is a UNESCO World Heritage Site and is home to a diverse range of flora and fauna, including the Bengal tiger, one-horned rhinoceros, Asian elephant, and several species of birds. Visitors can explore the park on elephant back or in a jeep safari, and there are also opportunities for bird watching, canoeing, and nature walks.");
                location = "https://goo.gl/maps/RuZF2emUYWVyBnwL9";
                timetovisit.setText("Best Time to Visit");
                mainimage.setImageResource(R.drawable.chitwan1);
                break;
        }



        locationbtn.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location))));



    }
}



