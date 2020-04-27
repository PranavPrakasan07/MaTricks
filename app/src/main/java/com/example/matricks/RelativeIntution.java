package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class RelativeIntution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nerd_concept_relative_intution);

        final RelativeLayout relativeLayout = findViewById(R.id.relativelayoutintution);

        final Button stochasticbutton = findViewById(R.id.intro_matrix_button);
        final Button hessenbergbutton = findViewById(R.id.intro_determinant_button);
        final Button idempotentbutton = findViewById(R.id.sum_matrices_button);
        final Button involutorybutton = findViewById(R.id.sum_dets_button);
        final Button orthogonalbutton = findViewById(R.id.multiplying_matrices_button);
        final Button binarybutton = findViewById(R.id.multiplying_dets_button);
        final Button sparsebutton = findViewById(R.id.trace_matrix_button);

        final ScrollView stochastic = findViewById(R.id.intromatrixScroller);
        final ScrollView hessenberg = findViewById(R.id.detintutionScroller);
        final ScrollView idempotent = findViewById(R.id.summatrixScroller);
        final ScrollView involutory = findViewById(R.id.sumdetsScroller);
        final ScrollView orthogonal = findViewById(R.id.multmatrixScroller);
        final ScrollView binary = findViewById(R.id.multdetScroller);
        final ScrollView sparse = findViewById(R.id.traceScroller);


        stochasticbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stochastic.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        hessenbergbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hessenberg.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        idempotentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idempotent.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        involutorybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                involutory.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        orthogonalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orthogonal.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        binarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binary.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        sparsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sparse.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void goToCategoriesNerd(View view){

        Intent intent = new Intent(RelativeIntution.this, CategoriesNerd.class);
        startActivity(intent);

    }

}
