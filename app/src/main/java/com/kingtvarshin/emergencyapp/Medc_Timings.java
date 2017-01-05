package com.kingtvarshin.emergencyapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


public class Medc_Timings extends AppCompatActivity {

    CardView winter,summer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medc__timings);

        winter = (CardView)findViewById(R.id.cardwinter);
        summer = (CardView)findViewById(R.id.cardsummer);
        winter.setVisibility(View.GONE);
        summer.setVisibility(View.GONE);

        String[] SPINNERLIST = {"Winter","Summer"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                findViewById(R.id.android_material_design_spinner2);
        materialDesignSpinner.setAdapter(arrayAdapter);
        materialDesignSpinner.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i)
                        {
                            case 0:
                                summer.setVisibility(View.GONE);
                                winter.setVisibility(View.VISIBLE);
                                break;
                            case 1:
                                summer.setVisibility(View.VISIBLE);
                                winter.setVisibility(View.GONE);
                                break;
                        }
                    }
                }
        );
    }

}
