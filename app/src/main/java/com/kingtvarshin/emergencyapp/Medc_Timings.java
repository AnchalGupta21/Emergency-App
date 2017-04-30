package com.kingtvarshin.emergencyapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


public class Medc_Timings extends AppCompatActivity {

    CardView winter,summer,contacts;
    TextView pareekno,medcno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medc__timings);
        setTitle("Medical Center");

        winter = (CardView)findViewById(R.id.cardwinter);
        summer = (CardView)findViewById(R.id.cardsummer);
        contacts = (CardView)findViewById(R.id.cardcontacts);
        winter.setVisibility(View.GONE);
        summer.setVisibility(View.GONE);
        contacts.setVisibility(View.GONE);
        pareekno = (TextView)findViewById(R.id.pareekno);
        medcno = (TextView)findViewById(R.id.medcno);

        String[] SPINNERLIST = {"Summer","Winter","Contacts"};
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
                                summer.setVisibility(View.VISIBLE);
                                winter.setVisibility(View.GONE);
                                contacts.setVisibility(View.GONE);
                                break;
                            case 1:
                                summer.setVisibility(View.GONE);
                                winter.setVisibility(View.VISIBLE);
                                contacts.setVisibility(View.GONE);
                                break;
                            case 2:
                                summer.setVisibility(View.GONE);
                                winter.setVisibility(View.GONE);
                                contacts.setVisibility(View.VISIBLE);
                                break;
                        }
                    }
                }
        );

        pareekno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+91 1596 515 523", null)));
            }
        });

        medcno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+91 1596 515 526", null)));
            }
        });
    }

}
