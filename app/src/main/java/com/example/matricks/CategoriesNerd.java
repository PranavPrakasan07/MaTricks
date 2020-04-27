package com.example.matricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoriesNerd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_nerd);
    }

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

    public void goToIntutionListRel(View view){

        Intent intent = new Intent(CategoriesNerd.this, RelativeIntution.class);
        startActivity(intent);
    }

    public void goToTypesListRel(View view) {

        Intent intent = new Intent(CategoriesNerd.this, Relativetypes.class);
        startActivity(intent);
    }

}
