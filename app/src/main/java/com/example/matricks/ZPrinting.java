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

public class ZPrinting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z_printing);

        Button button = findViewById(R.id.ZPrintingHeading);
        final ScrollView scrollView = findViewById(R.id.scrollerid);
        final Button button1 = findViewById(R.id.hideCodeZPrinting);
        final TextView textView = findViewById(R.id.problemZPrinting);

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
                Intent intent = new Intent(ZPrinting.this, RandomCode.class);
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

    public void hintZPrinting(View view)
    {
        String s = "Try to increment and decrement the values of the indices at the boundary points";
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

    public void approachZPrinting(View view)
    {
        String s = "Print the row with index '0', then print the minor diagonal, them print the row with index 'n-1'";
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        View view1 = toast.getView();

        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }


}
