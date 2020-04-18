package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class RandomCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_code);

    }

    public void seeList(View view){
        Intent intent = new Intent(this, MainScreen.class);
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
