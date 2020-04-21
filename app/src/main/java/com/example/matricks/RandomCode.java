package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class RandomCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_code);



        final Button button = findViewById(R.id.coderAssist1);
        final Button button1 = findViewById(R.id.coderAssist2);
        final Button button2 = findViewById(R.id.viewassistant);
        final TextView textView = findViewById(R.id.welcome1);
        final TextView textView1 = findViewById(R.id.welcome2);

        button.setVisibility(View.VISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);

        textView.setVisibility(View.VISIBLE);
        textView1.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.VISIBLE);
                textView.setVisibility(View.INVISIBLE);
                textView1.setVisibility(View.INVISIBLE);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.INVISIBLE);
                textView1.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.INVISIBLE);
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
