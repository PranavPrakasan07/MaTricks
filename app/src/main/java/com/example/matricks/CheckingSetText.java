package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CheckingSetText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checking_set_text);

        final RelativeLayout relativeLayout = findViewById(R.id.relativelayouttypes);

        final Button stochasticbutton = findViewById(R.id.Stochastic_matrix_button);
        final Button hessenbergbutton = findViewById(R.id.hessenberg_button);
        final Button idempotentbutton = findViewById(R.id.Idempotentbutton);
        final Button involutorybutton = findViewById(R.id.Involutory_button);
        final Button orthogonalbutton = findViewById(R.id.Orthogonal_button);
        final Button binarybutton = findViewById(R.id.binarymatrix_button);
        final Button sparsebutton = findViewById(R.id.Sparse_matrix_button);
        final Button symmetricbutton = findViewById(R.id.symmetricmatrixbutton);
        final Button skewsymbutton = findViewById(R.id.skewsymmetricmatrixbutton);
        final Button singularmatbutton = findViewById(R.id.singularmatrixbutton);
        final Button elementarybutton = findViewById(R.id.elementarymatrixbutton);

        final TextView textView = findViewById(R.id.commoncontent);
        final ScrollView scrollView = findViewById(R.id.commonscroller);


        stochasticbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(getResources().getString(R.string.stochastic_content));
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        hessenbergbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(getResources().getString(R.string.hessenberg_content));
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        idempotentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                textView.setText(getResources().getString(R.string.idempotent_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        involutorybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                textView.setText(getResources().getString(R.string.involutory_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        orthogonalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        binarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        sparsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        symmetricbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        skewsymbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        singularmatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        elementarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

    }
}
