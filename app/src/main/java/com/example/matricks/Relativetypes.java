package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class Relativetypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nerd_concept_relative_types);

        final RelativeLayout relativeLayout = findViewById(R.id.relativelayouttypes);

        final Button stochasticbutton = findViewById(R.id.Stochastic_matrix_button);
        final Button hessenbergbutton = findViewById(R.id.hessenberg_button);
        final Button idempotentbutton = findViewById(R.id.Idempotentbutton);
        final Button involutorybutton = findViewById(R.id.Involutory_button);
        final Button orthogonalbutton = findViewById(R.id.Orthogonal_button);
        final Button binarybutton = findViewById(R.id.binarymatrix_button);
        final Button sparsebutton = findViewById(R.id.Sparse_matrix_button);

        final ScrollView stochastic = findViewById(R.id.stochiasticScroller);
        final ScrollView hessenberg = findViewById(R.id.hessenbergScroller);
        final ScrollView idempotent = findViewById(R.id.idempotentScroller);
        final ScrollView involutory = findViewById(R.id.involutoryScroller);
        final ScrollView orthogonal = findViewById(R.id.orthogonalScroller);
        final ScrollView binary = findViewById(R.id.binaryScroller);
        final ScrollView sparse = findViewById(R.id.sparseScroller);

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

        Intent intent = new Intent(Relativetypes.this, CategoriesNerd.class);
        startActivity(intent);

    }

}

