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

    public void name(View view){
        Intent intent = new Intent(this, Transpose.class);
        startActivity(intent);
    }
/*
    public void name(View view){
        Intent intent = new Intent(this, classname.class);
        startActivity(intent);
    }

    public void name(View view){
        Intent intent = new Intent(this, classname.class);
        startActivity(intent);
    }
    public void name(View view){
        Intent intent = new Intent(this, classname.class);
        startActivity(intent);
    }
    public void name(View view){
        Intent intent = new Intent(this, classname.class);
        startActivity(intent);
    }
    public void name(View view){
        Intent intent = new Intent(this, classname.class);
        startActivity(intent);
    }
    public void name(View view){
        Intent intent = new Intent(this, classname.class);
        startActivity(intent);
    }
*/
}
