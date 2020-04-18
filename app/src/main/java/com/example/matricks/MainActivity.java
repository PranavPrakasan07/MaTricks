package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(View view){

        Toast toast = Toast.makeText(this, "Taking you in...", Toast.LENGTH_SHORT);
        toast.show();

        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }
}
