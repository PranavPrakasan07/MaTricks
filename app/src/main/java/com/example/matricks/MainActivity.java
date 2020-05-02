package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void coder(View view){

        Toast toast = Toast.makeText(this, "Taking you in...", Toast.LENGTH_SHORT);
        toast.show();

        Intent intent = new Intent(this, RandomCode.class);
        startActivity(intent);
    }

    public void nerd(View view)
    {
        Toast.makeText(this, "Choose what you want to learn !!!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, CategoriesNerd.class);
        startActivity(intent);
    }
}
