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

public class OddMagicSquare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odd_magic_square);

        Button button = findViewById(R.id.OddMagicSquareHeading);
        final ScrollView scrollView = findViewById(R.id.scrollerid);
        final Button button1 = findViewById(R.id.hideCodeMSquare);
        final TextView textView = findViewById(R.id.problemMSquare);

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
                Intent intent = new Intent(OddMagicSquare.this, RandomCode.class);
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

    public void hintOddMagicSquare(View view)
    {
        String s = "In any magic square, the first number i.e. 1 is stored at position (n/2, n-1). Let this position be (i,j). " +
                "The next number is stored at position (i-1, j+1) where we can consider each row & column " +
                "as circular array i.e. they wrap around.";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

    public void approachOddMagicSquare(View view)
    {
        String s = "The position of next number is calculated by decrementing row number of previous " +
                "number by 1, and incrementing the column number of previous number by 1. " +
                "Wrap if it goes over/under bound.\n\nIf the magic square already contains a number at " +
                "the calculated position, calculated column position will be decremented by 2, and " +
                "calculated row position will be incremented by 1.\n" +
                "\n" +
                "If the calculated row position is -1 & calculated column position is n, the new position would be: (0, n-2).";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

}
