package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class NerdConceptList2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerd_concept_list2);

        Button backbutton = findViewById(R.id.back_button_seelist);

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

        final Button nextbutton = findViewById(R.id.nextbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.VISIBLE);
                hessenbergbutton.setVisibility(View.VISIBLE);
                idempotentbutton.setVisibility(View.VISIBLE);
                involutorybutton.setVisibility(View.VISIBLE);
                orthogonalbutton.setVisibility(View.VISIBLE);
                binarybutton.setVisibility(View.VISIBLE);
                sparsebutton.setVisibility(View.VISIBLE);
                nextbutton.setVisibility(View.VISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        stochasticbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.VISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        hessenbergbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.VISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        idempotentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.VISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        involutorybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.VISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        orthogonalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.VISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        binarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.VISIBLE);
                sparse.setVisibility(View.INVISIBLE);

            }
        });

        sparsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stochasticbutton.setVisibility(View.INVISIBLE);
                hessenbergbutton.setVisibility(View.INVISIBLE);
                idempotentbutton.setVisibility(View.INVISIBLE);
                involutorybutton.setVisibility(View.INVISIBLE);
                orthogonalbutton.setVisibility(View.INVISIBLE);
                binarybutton.setVisibility(View.INVISIBLE);
                sparsebutton.setVisibility(View.INVISIBLE);
                nextbutton.setVisibility(View.INVISIBLE);

                stochastic.setVisibility(View.INVISIBLE);
                hessenberg.setVisibility(View.INVISIBLE);
                idempotent.setVisibility(View.INVISIBLE);
                involutory.setVisibility(View.INVISIBLE);
                orthogonal.setVisibility(View.INVISIBLE);
                binary.setVisibility(View.INVISIBLE);
                sparse.setVisibility(View.VISIBLE);

            }
        });
    }
}
