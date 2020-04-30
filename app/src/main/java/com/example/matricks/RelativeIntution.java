package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class RelativeIntution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nerd_concept_relative_intution);

        final RelativeLayout relativeLayout = findViewById(R.id.relativelayoutintution);

        final Button intromatrixbutton = findViewById(R.id.intro_matrix_button);
        final Button introdetbutton = findViewById(R.id.intro_determinant_button);
        final Button matrixsumbutton = findViewById(R.id.sum_matrices_button);
        final Button detsumbutton = findViewById(R.id.sum_dets_button);
        final Button multiplyingmatrixbutton = findViewById(R.id.multiplying_matrices_button);
        final Button multiplyingdetbutton = findViewById(R.id.multiplying_dets_button);
        final Button tracebutton = findViewById(R.id.trace_matrix_button);
        final Button adjointbutton = findViewById(R.id.cofactor_button);
        final Button cofactorbutton = findViewById(R.id.adjoint_button);

        final TextView commoncontent = findViewById(R.id.commoncontent);
        final ScrollView commonscroller = findViewById(R.id.commonscroller);

        intromatrixbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.matrix_intution_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        introdetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.det_intution_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        matrixsumbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.matrixsum_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        detsumbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.sum_dets_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        multiplyingmatrixbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.mult_matrix_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        multiplyingdetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.mult_dets_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        tracebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.trace_matrix_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        cofactorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.cofactor_content));
                relativeLayout.setVisibility(View.INVISIBLE);
            }
        });

        adjointbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commonscroller.setVisibility(View.VISIBLE);
                commoncontent.setText(getResources().getString(R.string.adjoint_content));
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

        Intent intent = new Intent(RelativeIntution.this, CategoriesNerd.class);
        startActivity(intent);

    }


}
