package com.example.appmarvelworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private String cals = "";
    private String water = "";
    private String steps = "";
    private String exr = "";
    private String sleep = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameField = findViewById(R.id.nameView);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("message");
        double bmi = intent.getDoubleExtra("bmi", 0);
        nameField.setText(userName);

        String[] healthTips = {
                "Drink a jug full of water right after waking up in the morning (Use a copper mug for added health benefits)",
                "Switch from drinking Coffee and Tea to Organic Green Tea",
                "Meditate for 10 minutes daily to remove stress and increase the grey matter concentration in the brain.",
                "Hit the gym 5 days a week.",
                "Drink about 1/2 litre milk every day to fulfill the body’s calcium needs.",
                "Keep Saturdays for Running, Cycling, Cardio sessions.",
                "Take up a sport like Competitive Swimming, Tennis, Badminton etc. on Sundays, for it will improve your flexibility and endurance.",
                "Eat Amla and a handful of soaked almonds and walnuts every morning.",
                "Maintain strict oral hygiene by brushing twice a day using ayurvedic toothpaste (I use Vicco Vajradanti), Mouth Wash (Listerine) and Dental Floss.",
                "Drink a large glass of Orange/Mousambi Juice every evening to maintain your Vitamin C levels in the body.",
                "Get head and body massage every Sunday (Use almond oil for massage)",
                "Totally give up upon snacks like Chips, Samosas, Burgers, Coke, French Fries, Oily Paranthas etc. and switch to healthy snacks such as dry fruits, whole-grain biscuits, freshly cut fruits, Poha and brown bread sandwiches.",
                "Join Yoga classes for increasing the body’s flexibility. Since bodybuilding makes the body stiff, Yoga will hugely benefit in the long run.",
                "Fast on the last day of every month. (Fasting removes toxins from the body and burns excess fat)",
                "Use cold showers for bathing instead of taking hot water showers. Hot water badly affects hair and makes them dry.",
                "Get a complete body checkup, including all blood tests dental checkup, every 3 months.",
                "Ditch cosmetic creams and oils and switch to using coconut oil, which acts both as a natural moisturizer as well as hair oil.",
                "Quit Smoking.",
                "Quit Drinking.",
                "Wake up early in the morning. I personally make it a point to wake up at 4 am.",
                "Ditch chemical-based face packs and face washes for Multani Mitti face packs.",
                "Scrub facial skin and body with dried orange peel powder. It will make the skin glow.",
                "Get at least 7 hours of sleep every night.",
                "Keep your body fat levels to below 15 percent of your overall body weight. It will help you look more muscular and sharp.",
                "Ditch your old clothes and buy new clothes every 6 months. New and well-fitted clothes give a healthy look to the person.",
                "To increase core strength and get lean muscles, practice Martial Arts, Taekwondo or Kalaripatayu.",
                "Walk on the dew of the green grass every morning. It lowers down body temperature as well as blood pressure.",
                "Switch to Patanjali Multani Mitti soap for bathing. Ditch the chemical-based soaps.",
                "Use Khadi Hair Shampoo for hair. Dich chemical-based shampoos.",
                "Eat a high protein breakfast, having at least 30–40 grams of protein. If eating eggs is not a problem, then eggs are the best source of protein since they are natural.",
                "Never take protein supplements including ON, Ultimate Nutrition and others. Such supplements can cause urinary tract problems. Try considering Boost as it contains Malt, which is good for the body.",
                "Minimize the use of electronic gadgets including Laptops and Smartphones or if possible, completely ditch them. Their overuse causes skin allergies, dark circles under eyes.",
                "Sleep on your left side. This position helps to reduce nighttime heartburn symptoms.",
                "Switch to a squat based Indian Toilet or use a stool for legs while using an English toilet. There should be pressure on anus and intestines while pooping. Indian toilets are considered healthy.",
                "To lose weight, practice High Interval Intensive Training (HIIT) and drink a glass of lime water after the workout.",
                "Drink 4 liters of water every day. Buy a copper bottle to store water.",
                "Donate blood every 6 months. It will force the body to create new, fresh blood.",
                "Minimize masturbation to once a week. Daily masturbation can decrease your strength.",
                "Ditch meat-based products and turn vegetarian. It's easier for the body to digest vegetarian food. Plus killing animals is a moral crime.",
                "Always keep a hand sanitizer in your bag. Use is before eating so as to avoid getting infections.",
                "Stop the intake of artificial sugar. Switch to Honey.",
                "Invest in high quality and expensive mattress and pillow. The quality of sleep hugely affects overall health.",
                "Avoid being in the air-conditioned air as much as possible. AC’s are usually not good for the body in the long run.",
                "Ditch lifts for stairs.",
                "Get a healthy glow on the face by adding a small spoon of turmeric to warm water and drinking it daily.",
                "Consult a nutritionist to create a monthly diet plan for yourself. Plan weekly menus and add healthy varieties to it.",
                "Subscribe to health magazines such as Men Fitness for added motivation.",
                "Eat dark chocolate. Regular consumption of chocolate reduces the risk of heart attacks.",
                "Ditch Vegetable oil for healthier Sunflower and Olive Oil. Also, consume Desi Ghee in moderation.",
                "An Apple + 2 Bananas a day keeps the doctor away."
        };

        if (healthTips.length > 0) {
            Random rd = new Random();
            int random = rd.nextInt(healthTips.length);
            String randTip = healthTips[random];
            TextView tv = findViewById(R.id.tip);
            tv.setText(randTip);
        } else {
            TextView tv = findViewById(R.id.tip);
            tv.setText("No health tips available.");
        }

        Button nextPg = findViewById(R.id.nextPageButton2);
        Button update = findViewById(R.id.updateBtn);

        update.setOnClickListener(v -> {
            TextView tvCals = findViewById(R.id.cal);
            TextView tvWater = findViewById(R.id.wtr);
            TextView tvSteps = findViewById(R.id.stp);
            TextView tvEx = findViewById(R.id.exc);
            TextView tvSlp = findViewById(R.id.slp);
            cals = tvCals.getText().toString();
            water = tvWater.getText().toString();
            steps = tvSteps.getText().toString();
            exr = tvEx.getText().toString();
            sleep = tvSlp.getText().toString();
        });

        nextPg.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);
            intent2.putExtra("bmi", bmi);
            intent2.putExtra("message1", cals);
            intent2.putExtra("message2", water);
            intent2.putExtra("message3", steps);
            intent2.putExtra("message4", exr);
            intent2.putExtra("message5", sleep);
            startActivity(intent2);
        });
    }
}
