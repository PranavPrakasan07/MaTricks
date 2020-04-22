package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen2);
    }

    public void SwapMajorDiagonal(View view){
        Intent intent = new Intent(MainScreen2.this, MajorDiagonalSwap.class);
        startActivity(intent);
    }

    public void SwapMinorDiagonal(View view){
        Intent intent = new Intent(MainScreen2.this, MinorDiagonalSwap.class);
        startActivity(intent);
    }

    public void SwapDiagonal(View view){
        Intent intent = new Intent(MainScreen2.this, Rotate.class);
        startActivity(intent);
    }


    public void OddMSquare(View view){
        Intent intent = new Intent(MainScreen2.this, OddMagicSquare.class);
        startActivity(intent);
    }
/*
    public void AntiSpiral(View view){
        Intent intent = new Intent(this, AntiSpiral.class);
        startActivity(intent);
    }

    public void ZPrinting(View view){
        Intent intent = new Intent(this, ZPrinting.class);
        startActivity(intent);
    }

    public void MinorSwap(View view){
        Intent intent = new Intent(this, MinorDiagonalSwap.class);
        startActivity(intent);
    }
*/
    public void previousPage(View view){
        Intent intent = new Intent(MainScreen2.this, MainScreen.class);
        startActivity(intent);
    }


}
