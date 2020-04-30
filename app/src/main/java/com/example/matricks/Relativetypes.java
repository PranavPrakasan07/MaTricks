package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

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
        final Button symmetricbutton = findViewById(R.id.symmetricmatrixbutton);
        final Button skewsymbutton = findViewById(R.id.skewsymmetricmatrixbutton);
        final Button singularmatbutton = findViewById(R.id.singularmatrixbutton);
        final Button elementarybutton = findViewById(R.id.elementarymatrixbutton);
        final Button signaturebutton = findViewById(R.id.signaturematrixbutton);

        final TextView commoncontent = findViewById(R.id.commoncontent);
        final ScrollView commonscroller = findViewById(R.id.commonscroller);

        stochasticbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.stochastic_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        hessenbergbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.hessenberg_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        idempotentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.idempotent_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        involutorybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.involutory_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        orthogonalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.orthogonal_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        binarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.binary_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        sparsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.sparse_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        symmetricbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.symmetricMatrix_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        skewsymbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.skewsymmetricMatrix_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        singularmatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.singularmatrix_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        elementarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.elementary_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        signaturebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.signature_matrix_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        commoncontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.INVISIBLE);
                relativeLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    public void goToCategoriesNerd(View view){

        Intent intent = new Intent(Relativetypes.this, CategoriesNerd.class);
        startActivity(intent);

    }

}

