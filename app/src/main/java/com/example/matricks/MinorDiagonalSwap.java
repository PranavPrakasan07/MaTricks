package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MinorDiagonalSwap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_diagonal_swap);


        Button button = findViewById(R.id.minorSwap);
        final ScrollView scrollView = findViewById(R.id.scrollerid);
        final Button button1 = findViewById(R.id.hideCodeMinorSwap);
        final TextView textView = findViewById(R.id.minorSwapProblem);

        scrollView.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.VISIBLE);

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                scrollView.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                textView.setVisibility(View.INVISIBLE);

                return true;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinorDiagonalSwap.this, RandomCode.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                textView.setVisibility(View.VISIBLE);
            }
        });

    }

    public void hintMinorSwap(View view){

        String s = "Keep account of the indices of the non-primary diagonal of the matrix.";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

    public void approachMinorDiagonal(View view) {

        String s = "Loop through till half of the major diagonal, using the j=n-i indices and swap the elements with 'i == j'.";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }
}
