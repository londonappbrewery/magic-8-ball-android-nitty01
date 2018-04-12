package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton = (Button) findViewById(R.id.ask_button);
        final ImageView decisionMaker = (ImageView) findViewById(R.id.decision_holder);

        final int[] decisions = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Random randomNumberGenerator = new Random();

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                decisionMaker.setImageResource(decisions[randomNumberGenerator.nextInt(5)]);
            }
        });
    }
}
