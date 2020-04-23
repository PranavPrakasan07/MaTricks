package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class NerdConceptList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerd_concept_list);

        Button backbutton = findViewById(R.id.back_button_seelist);

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
