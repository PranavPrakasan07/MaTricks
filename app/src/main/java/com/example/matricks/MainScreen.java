package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }



    public void Transpose(View view){
        Intent intent = new Intent(this, Transpose.class);
        startActivity(intent);
    }

    public void ZigZag(View view){

        Intent intent = new Intent(this, ZigZag.class);
        startActivity(intent);
    }

    public void Rotate(View view){
        Intent intent = new Intent(this, Rotate.class);
        startActivity(intent);
    }
    public void Spiral(View view){
        Intent intent = new Intent(this, Spiral.class);
        startActivity(intent);
    }

    public void AntiSpiral(View view){
        Intent intent = new Intent(this, AntiSpiral.class);
        startActivity(intent);
    }

    public void ZPrinting(View view){
        Intent intent = new Intent(this, ZPrinting.class);
        startActivity(intent);
    }

    public void StochasticMatrix(View view){
        Intent intent = new Intent(this, MarkovMatrix.class);
        startActivity(intent);
    }

    public void previousPage(View view){
        Intent intent = new Intent(this, RandomCode.class);
        startActivity(intent);
    }

    public void nextPage(View view){
        Intent intent = new Intent(this, MainScreen2.class);
        startActivity(intent);
    }
}
