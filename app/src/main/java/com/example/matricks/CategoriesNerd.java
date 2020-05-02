package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class CategoriesNerd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_nerd);

        final ViewFlipper viewFlipper = findViewById(R.id.viewflipper);

        Button prev = findViewById(R.id.previousbutton);
        Button next = findViewById(R.id.nextbutton);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.stopFlipping();
                viewFlipper.showPrevious();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.stopFlipping();
                viewFlipper.showNext();
            }
        });

    }
/*
    public void goToIntutionList(View view){

        Intent intent = new Intent(CategoriesNerd.this, NerdConceptList2.class);
        startActivity(intent);
    }

    public void goToTypesList(View view) {

        Intent intent = new Intent(CategoriesNerd.this, NerdConceptList.class);
        startActivity(intent);
    }

    public void goToCalculationList(View view){

        Intent intent = new Intent(CategoriesNerd.this, NerdConceptList.class);
        startActivity(intent);

    }
*/

    public void goToIntutionListRel(View view){

        Intent intent = new Intent(CategoriesNerd.this, RelativeIntution.class);
        startActivity(intent);
    }

    public void goToTypesListRel(View view) {

        Intent intent = new Intent(CategoriesNerd.this, Relativetypes.class);
        startActivity(intent);
    }

    public void goToCalculationListRel(View view){

        Intent intent = new Intent(CategoriesNerd.this, CheckingSetText.class);
        startActivity(intent);

    }

}
