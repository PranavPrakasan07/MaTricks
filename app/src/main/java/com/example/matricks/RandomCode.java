package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;


import java.util.Random;

public class RandomCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_code);

        final ViewFlipper viewFlipper = findViewById(R.id.viewFlipperCoder);

        Button previous = findViewById(R.id.previousbuttoncoder);
        Button next = findViewById(R.id.nextbuttoncoder);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.stopFlipping();
                viewFlipper.showPrevious();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.stopFlipping();
                viewFlipper.showNext();
            }
        });
    }

    public void goToHomePage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void seeList(View view){

        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    public void seeListRel(View view){

        Intent intent = new Intent(this, Programme_list.class);
        startActivity(intent);
    }


    Intent intent;

    public void seeRandom(View view){

        Random random = new Random();
        int number = random.nextInt(5) + 1;

        switch (number) {
            case 1:
                intent = new Intent(this, ZigZag.class);
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(this, Spiral.class);
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(this, AntiSpiral.class);
                startActivity(intent);

            case 4:
                intent = new Intent(this, Rotate.class);
                startActivity(intent);
                break;

            case 5:
                intent = new Intent(this, Transpose.class);
                startActivity(intent);
                break;
        }
    }
}
