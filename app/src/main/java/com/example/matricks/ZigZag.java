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

public class ZigZag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zig_zag);

        Button button = findViewById(R.id.ZigZagHeading);
        final ScrollView scrollView = findViewById(R.id.scrollerid);
        final Button button1 = findViewById(R.id.hideCodeZigZag);
        final TextView textView = findViewById(R.id.problemZigZag);

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
                Intent intent = new Intent(ZigZag.this, RandomCode.class);
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

    public void hintZigZag(View view){

        String s = "Identify the rows which follow the same direction. Use a loop considering the same...";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);

        View view1 = toast.getView();
        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }

    public void approachZigZag(View view){

        String s = "Identify the rows which follow the same direction. That is, use loops from start and end of the rows.";

        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);

        View view1 = toast.getView();
        view1.setBackgroundColor(Color.rgb(61, 184, 255));

        toast.show();
    }
}
