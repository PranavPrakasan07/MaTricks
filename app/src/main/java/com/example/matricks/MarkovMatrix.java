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

public class MarkovMatrix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markov_matrix);


        Button button = findViewById(R.id.StochasticHead);
        final ScrollView scrollView = findViewById(R.id.scrollerid);
        final Button button1 = findViewById(R.id.hideStochastic);
        final TextView textView = findViewById(R.id.problemStochastic);

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
                Intent intent = new Intent(MarkovMatrix.this, RandomCode.class);
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


    public void hintStochasticMatrix(View view){

        String s = "A Stochastic Matrix is one which has non-negative, real-valued entries, with values " +
                "in the range [0,1], the row-wise, column-wise, or both summing up to 1, depending upon the type of the " +
                "Stochastic Matrix. ";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

    public void approachStochasticMatrix(View view){

        String s = "Check the conditions one by one, if all satisfy, the matrix is a Stochastic Matrix.";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

}
